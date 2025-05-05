package practica02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import practica02.model.Libros;
import practica02.services.LibrosService;

import java.util.List;

@Controller
public class LibrosController {
    private final LibrosService librosService;

    public LibrosController(LibrosService librosService) {
        this.librosService = librosService;
    }
/*
    @GetMapping("/")
    public String vistaHome(ModelMap interfazConPantalla) {
        List<Libros> listaLibros = LibrosService.listaLibros();
        interfazConPantalla.addAttribute("listaLibros", listaLibros);
        return "index";
    }

 */
}
