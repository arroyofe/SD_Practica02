package practica02.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practica02.repository.UserRepository;
import practica02.model.User;


@Service
public class DatabaseServices {

        @Autowired
        private UserRepository userRepository;


        /**
         * Método checkRegistered.
         *
         * @param id the id
         * @param password the password
         * @return true o false
         */
        public boolean checkRegistered(Long id, String password) {
            Optional<User> userOpt;
            User user = new User();

            if (userRepository.existsById(String.valueOf(id))){
                userOpt = userRepository.findById(String.valueOf(id));
                if (userOpt.isPresent()) {
                    user = userOpt.get();

                    return user.getPassword().equals(password);
                }

            }
            return false;

        }

        /**
         * Metodo updateProfile.
         * @param email the email
         * @param password the password
         */
        public void updateProfile(Long id, String email, String password, String firstname, String lastname) {

            User user = new User();

            user.setEmail(email);
            user.setPassword(password);
            user.setFirstname(firstname);
            user.setLastname(lastname);

            userRepository.save(user);

        }

        /**
         * Método getUser.
         * @param id the id
         * @return the user
         */
        public User getUser(String id) {
            Optional<User> userOpt;
            User user = new User();

            if (userRepository.existsById(id)){
                userOpt = userRepository.findById(id);
                if (userOpt.isPresent()) {
                    user = userOpt.get();
                }
            }
            return user;
        }

        /**
         * Método getAllUsers.
         * @return lista de usuarios
         */
        public List<User> getAllUsers(){
            List<User> listUsers = (List<User>) userRepository.findAll();

            for (User user : listUsers) {
                System.out.println(user.getEmail().toString());
            }
            return listUsers;
        }
}
