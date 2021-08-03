package is.pims.MercadoManazo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import is.pims.MercadoManazo.dto.Opinion;
import is.pims.MercadoManazo.dto.Producto;
import is.pims.MercadoManazo.dto.RespuestaApi;

@Repository
public class OpinionRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Opinion> getOpiniones(){
		List<Opinion> opiniones = new ArrayList<>();
		opiniones = jdbcTemplate.query("SELECT * FROM opinion;", new RowMapper<Opinion>() {
			
			@Override
			public Opinion mapRow(ResultSet rs, int rownum) throws SQLException{
				Opinion opinion = new Opinion();
				opinion.setId_opinion(rs.getInt(1));
				opinion.setId_producto(rs.getInt(2));
				opinion.setId_comprador(rs.getInt(3));
				opinion.setCalificacion(rs.getInt(4));
				opinion.setComentario(rs.getString(5));
				
				return opinion;
			}
		});
		
		return opiniones;
	}
	
	public List<Opinion> getOpiniones(int id){
		List<Opinion> opiniones = new ArrayList<>();
		opiniones = jdbcTemplate.query("SELECT * FROM opinion WHERE id_producto = " + id + ";", new RowMapper<Opinion>() {
				
			@Override
			public Opinion mapRow(ResultSet rs, int rownum) throws SQLException{
				Opinion opinion = new Opinion();
				opinion.setId_opinion(rs.getInt(1));
				opinion.setId_producto(rs.getInt(2));
				opinion.setId_comprador(rs.getInt(3));
				opinion.setCalificacion(rs.getInt(4));
				opinion.setComentario(rs.getString(5));
			
				return opinion;
			}
		});
		return opiniones;
	}
	
	public RespuestaApi createOpinion(Opinion opinion) {
		jdbcTemplate.update("INSERT INTO opinion (id_opinion, id_producto, id_comprador, calificacion, comentario) VALUES("
				+ "" + opinion.getId_opinion() + "," 
				+ "" + opinion.getId_producto() + "," 
				+ "" + opinion.getId_comprador() + ","
				+ "" + opinion.getCalificacion() + "," 
				+ "'" + opinion.getComentario() + "');");
		RespuestaApi msg = new RespuestaApi();
		msg.setMessage("Producto agregado exitosamente");
		return msg;
	}
}
