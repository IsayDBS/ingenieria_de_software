package is.pims.MercadoManazo.service;

import is.pims.MercadoManazo.dto.RolUsuario;
import is.pims.MercadoManazo.dto.SolicitudRegistro;
import is.pims.MercadoManazo.dto.Usuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistroService {

    private final UsuarioService usuarioService;
    private final EmailValidator emailValidator;

    public String registro(SolicitudRegistro req){
        boolean isValid = emailValidator.test(req.getCorreo());
        if (!isValid)
            throw new IllegalStateException("Correo no válido");

        return usuarioService.registraUsuario(
                new Usuario(
                        req.getNombre(),
                        req.getApellido(),
                        req.getCorreo(),
                        req.getTelefono(),
                        RolUsuario.COMPRADOR
                ),
                RolUsuario.COMPRADOR
        );
    }
}
