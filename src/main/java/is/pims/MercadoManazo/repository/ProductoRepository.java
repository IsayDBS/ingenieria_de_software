package is.pims.MercadoManazo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import is.pims.MercadoManazo.dto.Producto;
import is.pims.MercadoManazo.dto.RespuestaApi;

@Repository
public class ProductoRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Producto> getProductos(){
		List<Producto> productos = new ArrayList<>();
		productos = jdbcTemplate.query("SELECT * FROM producto;", new RowMapper<Producto>() {
			
			@Override
			public Producto mapRow(ResultSet rs, int rownum) throws SQLException{
				Producto producto = new Producto();
				producto.setId_producto(rs.getInt(1));
				producto.setId_vendedor(rs.getInt(2));
				producto.setNombre(rs.getString(3));
				producto.setDescripcion(rs.getString(4));
				producto.setPrecio(rs.getFloat(5));
				producto.setImagen(rs.getString(6));
				
				return producto;
			}
		});
		
		return productos;
	}
	
	public List<Producto> getProductosBusq(String nombre_producto){
		List<Producto> productos = new ArrayList<>();
		productos = jdbcTemplate.query("SELECT * FROM producto WHERE nombre like '%" + nombre_producto + "%';", new RowMapper<Producto>() {
			
			@Override
			public Producto mapRow(ResultSet rs, int rownum) throws SQLException{
				Producto producto = new Producto();
				producto.setId_producto(rs.getInt(1));
				producto.setId_vendedor(rs.getInt(2));
				producto.setNombre(rs.getString(3));
				producto.setDescripcion(rs.getString(4));
				producto.setPrecio(rs.getFloat(5));
				producto.setImagen(rs.getString(6));
				
				return producto;
			}
		});
		
		return productos;
	}
	
	/*
	public Producto getProducto(int id) {
		Producto producto = new Producto();
		producto = jdbcTemplate.queryForObject("SELECT * FROM producto WHERE id_producto = " + id + ";", new RowMapper<Producto>() {
			
			@Override
			public Producto mapRow(ResultSet rs, int rownum) throws SQLException{
				Producto producto = new Producto();
				producto.setId_producto(rs.getInt(1));
				producto.setId_vendedor(rs.getInt(2));
				producto.setNombre(rs.getString(3));
				producto.setDescripcion(rs.getString(4));
				producto.setPrecio(rs.getFloat(5));
				producto.setImagen(rs.getString(6));
				
				return producto;
			}
			
		});
		return producto;
	}
	*/
	
	public RespuestaApi createProducto(Producto producto) {
		jdbcTemplate.update("INSERT INTO producto (id_vendedor, nombre, descripcion, precio, inventario, imagen) VALUES("
				+ "'" + producto.getId_vendedor() + "'," 
				+ "'" + producto.getNombre() + "'," 
				+ "'" + producto.getDescripcion() + "',"
				+ "" + producto.getPrecio() + "," 
				+ "" + producto.getInventario() + ","
				+ "'" + producto.getImagen() + "');");
		RespuestaApi msg = new RespuestaApi();
		msg.setMessage("Producto agregado exitosamente");
		return msg;
	}
	
	public RespuestaApi deleteProducto(int id) {
		jdbcTemplate.update("DELETE FROM producto WHERE id_producto = " + id + ";");
		RespuestaApi msg = new RespuestaApi();
		msg.setMessage("Producto eliminado exitosamente");
		return msg;
	}
}
