package is.pims.MercadoManazo.service;

import is.pims.MercadoManazo.dto.RolUsuario;
import is.pims.MercadoManazo.dto.Usuario;
import is.pims.MercadoManazo.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioService implements UserDetailsService {

    private final UsuarioRepository usuarioRepository;
    private final static String USER_NOT_FOUND = "El usuario %s no fue encontrado";
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {
        return usuarioRepository.findByCorreo(correo)
                .orElseThrow(()-> new UsernameNotFoundException(String.format(USER_NOT_FOUND,correo)));
    }

    public String registraUsuario(Usuario usuario, RolUsuario rolUsuario){
        boolean coincidence = usuarioRepository.findByCorreo(usuario.getCorreo()).isPresent();
        if(coincidence && usuario.getRolUsuario() == rolUsuario)
            throw new IllegalStateException("El correo ya está registrado para el rol especificado");

        String encoded = bCryptPasswordEncoder.encode(usuario.getPassword());

        usuario.setContrasena(encoded);
        usuario.setEnabled(true);
        usuarioRepository.save(usuario);
        return "redirect:/login/";
    }
}
