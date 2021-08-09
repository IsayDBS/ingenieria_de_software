package is.pims.MercadoManazo.service;

import is.pims.MercadoManazo.dto.Email;
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
    private final EmailService emailService;

    public String registro(SolicitudRegistro req){
        RolUsuario r;
        boolean isValid = emailValidator.test(req.getCorreo());
        if (!isValid)
            throw new IllegalStateException("Correo no válido");
        if (req.isRole()) //isRole == true -> VENDEDOR
            r = RolUsuario.VENDEDOR;
        else
            r = RolUsuario.COMPRADOR;

        Usuario usr = new Usuario(req.getNombre(), req.getApellido(), req.getCorreo(), req.getTelefono(), r);
        String pwd = "Tu contraseña en MercadoManazo es: <b>" + usr.getPassword() + "</b>";
        emailService.sendEmail(new Email(usr.getCorreo(),pwd,"Contraseña Mercado Manazo"));
        return usuarioService.registraUsuario(usr, r);
    }
}
