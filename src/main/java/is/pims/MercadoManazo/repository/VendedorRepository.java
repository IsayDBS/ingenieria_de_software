package is.pims.MercadoManazo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import is.pims.MercadoManazo.dto.Vendedor;
import is.pims.MercadoManazo.dto.RespuestaApi;

@Repository
public class VendedorRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Vendedor getVendedor(int id) {
		Vendedor vendedor = new Vendedor();
		vendedor = jdbcTemplate.queryForObject("SELECT * FROM vendedor WHERE id_vendedor = " + id + ";", new RowMapper<Vendedor>() {
			
			@Override
			public Vendedor mapRow(ResultSet rs, int rownum) throws SQLException{
				Vendedor vendedor = new Vendedor();
				vendedor.setId_vendedor(rs.getInt(1));
				vendedor.setNombre_usuario(rs.getString(2));
				vendedor.setApellido_usuario(rs.getString(3));
				vendedor.setCorreo(rs.getString(4));
				vendedor.setPassword_vendedor(rs.getString(5));
				vendedor.setTelefono(rs.getString(6));
				vendedor.setEs_vendedor(false);
				
				return vendedor;
			}
		});
		return vendedor;
	}
	
	public RespuestaApi createVendedor(Vendedor vendedor) {
		jdbcTemplate.update("INSERT INTO vendedor (nombre_usuario, apellido_usuario, correo, password_comprador, telefono, es_vendedor) VALUES ("
				+ "'" + vendedor.getNombre_usuario() + "',"
				+ "'" + vendedor.getApellido_usuario() + "',"
				+ "'" + vendedor.getCorreo() + "',"
				+ "'" + vendedor.getPassword_vendedor() + "',"
				+ "'" + vendedor.getTelefono() + "',"
				+ "" + vendedor.getEs_vendedor() + ");");
		RespuestaApi msg = new RespuestaApi();
		msg.setMessage("Comprador creado exitosamente");
		return msg;
	}
}
