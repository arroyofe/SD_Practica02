package practica02.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class usuariosdto {
    private int id;
    private String nombre;
    private String apellidos;
    private String clave;
    private String email;
}