package is.pims.MercadoManazo.service;

import is.pims.MercadoManazo.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioService implements UserDetailsService {

    private final UsuarioRepository usuarioRepository;
    private final static String USER_NOT_FOUND = "El usuario %s no fue encontrado";

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return usuarioRepository.encuentraPorCorreo(s)
                .orElseThrow(()-> new UsernameNotFoundException(String.format(USER_NOT_FOUND,s)));
    }
}
