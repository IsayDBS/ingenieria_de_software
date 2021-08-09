package is.pims.MercadoManazo.dto;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class SolicitudRegistro {

    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private boolean role;
}
