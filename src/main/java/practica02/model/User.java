package practica02.model;

import jakarta.persistence.*;


/**
 * Clase usuario: usuario que se conectará a para el login de la aplicación.
 *
 * @author Fernando Arroyo Redondo
 * @version 1.0
 */
@Entity
@Table(name = "usuario")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * The email.
     */
    @Column(name = "email", length = 100)
    private String email;

    /**
     * The password.
     */
    @Column(name = "clave", length = 100)
    private String password;

    /**
     * The firstname.
     */
    @Column(name = "nombre", length = 100)
    private String firstname;

    /**
     * The lastname.
     */
    @Column(name = "apellidos", length = 100)
    private String lastname;


    /**
     * Gets the id.
     *
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * Gets the firstname.
     *
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the firstname.
     *
     * @param firstname the new firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Gets the lastname.
     *
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the lastname.
     *
     * @param lastname the new lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Gets the email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     *
     * @param email the new email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     *
     * @param password the new password
     */
    public void setPassword(String password) {
        this.password = password;
    }


}