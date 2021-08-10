package is.pims.MercadoManazo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import is.pims.MercadoManazo.dto.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import is.pims.MercadoManazo.dto.Producto;
import is.pims.MercadoManazo.dto.RespuestaApi;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface ProductoRepository extends CrudRepository<Producto,Long> {

    Optional<Producto> findByNombre(String nombre);
    Iterable<Producto> findAllByNombre(Iterable<String> nombres); //
    List<Producto> findAllbyUsuario_Id(int id); //Dashboard


}
