package is.pims.MercadoManazo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import is.pims.MercadoManazo.dto.Comprador;
import is.pims.MercadoManazo.dto.RespuestaApi;

@Repository
public class CompradorRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Comprador getComprador(int id) {
		Comprador comprador = new Comprador();
		comprador = jdbcTemplate.queryForObject("SELECT * FROM comprador WHERE id_comprador = " + id + ";", new RowMapper<Comprador>() {
			
			@Override
			public Comprador mapRow(ResultSet rs, int rownum) throws SQLException{
				Comprador comprador = new Comprador();
				comprador.setId_comprador(rs.getInt(1));
				comprador.setNombre_usuario(rs.getString(2));
				comprador.setApellido_usuario(rs.getString(3));
				comprador.setCorreo(rs.getString(4));
				comprador.setPassword_comprador(rs.getString(5));
				comprador.setTelefono(rs.getString(6));
				comprador.setEs_vendedor(false);
				comprador.setTarjeta(rs.getString(7));
				
				return comprador;
			}
		});
		return comprador;
	}
	
	public RespuestaApi createComprador(Comprador comprador) {
		jdbcTemplate.update("INSERT INTO comprador (nombre_usuario, apellido_usuario, correo, password_comprador, telefono, es_vendedor, tarjeta) VALUES ("
				+ "'" + comprador.getNombre_usuario() + "',"
				+ "'" + comprador.getApellido_usuario() + "',"
				+ "'" + comprador.getCorreo() + "',"
				+ "'" + comprador.getPassword_comprador() + "',"
				+ "'" + comprador.getTelefono() + "',"
				+ "" + comprador.getEs_vendedor() + ","
				+ "'" + comprador.getTarjeta() + "');");
		RespuestaApi msg = new RespuestaApi();
		msg.setMessage("Comprador creado exitosamente");
		return msg;
	}
}
