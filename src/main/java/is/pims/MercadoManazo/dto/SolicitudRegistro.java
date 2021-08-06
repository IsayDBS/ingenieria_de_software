package is.pims.MercadoManazo.dto;

import lombok.*;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class SolicitudRegistro {

    private final String nombre;
    private final String apellido;
    private final String contrasena;
    private final String correo;
    private final String telefono;
}
