package is.pims.MercadoManazo.repository;

import is.pims.MercadoManazo.dto.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface UsuarioRepository extends CrudRepository<Usuario,Long> {

    Optional<Usuario> findByCorreo(String correo);

}
