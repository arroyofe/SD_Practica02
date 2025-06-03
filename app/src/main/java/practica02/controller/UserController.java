package practica02.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import practica02.model.User;
import practica02.services.DatabaseServices;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private DatabaseServices databaseService;

    public UserController() {
    }


    @GetMapping("/")
    public String mainPage(HttpSession session, Model model) {

        if (session.getAttribute("id") != null) {
            model.addAttribute("logued", true);
        }
        return "home";
    }


    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/checkLogin")
    public String checkLogin(Model model, HttpSession session, @RequestParam("id") Long id
            , @RequestParam("password") String password) {

        if (databaseService.checkRegistered(id, password)) {
            session.setAttribute("id", id);
            session.setAttribute("password", password);
            model.addAttribute("logued", true);
            return "home";
        }


        model.addAttribute("nouser", true);
        return "login";
    }


    /**
     * Devuelve una vista con el perfil de un usuario
     *
     * @param model   the model
     * @param session the session
     * @return profile view
     */
    @GetMapping("/profile")
    public String getProfile(Model model, HttpSession session) {

        User user = databaseService.getUser((Long) session.getAttribute("id"));

        model.addAttribute("user", user);

        return "profile";

    }

    /**
     * Método getProfile.
     *
     * @param model the model
     * @return profile view
     */
    @PostMapping("/updateProfile")
    public String updateProfile(Model model, @RequestParam("id") long id, @RequestParam("email") String email, @RequestParam("password") String password
            , @RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname) {

        databaseService.updateProfile(id, email, password, firstname, lastname);

        User user = databaseService.getUser(id);

        model.addAttribute("user", user);


        return "profile";

    }

    /**
     * Método getProfile.
     *
     * @param model the model
     * @return profile view
     */
    @GetMapping("/showUsers")
    public String updateProfile(Model model) {

        List<User> userList = databaseService.getAllUsers();

        model.addAttribute("userList", userList);

        return "usuarios";

    }


}