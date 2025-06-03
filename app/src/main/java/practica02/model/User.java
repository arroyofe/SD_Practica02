package practica02.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


/**
 * Clase usuario: usuario que se conectará a para el login de la aplicación.
 *
 * @author Fernando Arroyo Redondo
 * @version 1.0
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuarios")
public class User implements Serializable {

    @Id
    @Column (name= "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    /**
     * The email.
     */
    @Column(name = "email", length = 255)
    private String email;

    /**
     * The password.
     */
    @Column(name = "clave", length = 255)
    private String password;

    /**
     * The firstname.
     */
    @Column(name = "nombre", length = 255)
    private String firstname;

    /**
     * The lastname.
     */
    @Column(name = "apellidos", length = 255)
    private String lastname;

}