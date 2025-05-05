package practica02.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


/**
 * Clase libros: libros en la libreria.
 *
 * @author Fernando Arroyo Redondo
 * @version 1.0
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "libros")
public class Libros implements Serializable {

    @Id
    @Column(name="idlib")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    /**
     * The titulo.
     */
    @Column(name = "titulo", length = 255)
    private String titulo;

    /**
     * The autor.
     */
    @Column(name = "autor", length = 255)
    private String autor;

}