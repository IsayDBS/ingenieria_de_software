package is.pims.MercadoManazo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import is.pims.MercadoManazo.dto.Opinion;
import is.pims.MercadoManazo.dto.RespuestaApi;

@Repository
public interface OpinionRepository extends CrudRepository<Opinion,Long> { }
