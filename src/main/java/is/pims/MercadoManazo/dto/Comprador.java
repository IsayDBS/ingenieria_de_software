package is.pims.MercadoManazo.dto;

public class Comprador {
	
	private int id_comprador;
	private String nombre_usuario;
	private String apellido_usuario;
	private String correo;
	private String password_comprador;
	private String telefono;
	private boolean es_vendedor;
	private String tarjeta;
	
	public Comprador() {
		
	}
	
	public Comprador(int id_comprador, String nombre_usuario, String apellido_usuario, String correo, String password_comprador, String telefono, boolean es_vendedor, String tarjeta) {
		this.id_comprador = id_comprador;
		this.nombre_usuario = nombre_usuario;
		this.apellido_usuario = apellido_usuario;
		this.correo = correo;
		this.password_comprador = password_comprador;
		this.telefono = telefono;
		this.es_vendedor = es_vendedor;
		this.tarjeta = tarjeta;
	}

	public int getId_comprador() {
		return id_comprador;
	}

	public void setId_comprador(int id_comprador) {
		this.id_comprador = id_comprador;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getApellido_usuario() {
		return apellido_usuario;
	}

	public void setApellido_usuario(String apellido_usuario) {
		this.apellido_usuario = apellido_usuario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword_comprador() {
		return password_comprador;
	}

	public void setPassword_comprador(String password_comprador) {
		this.password_comprador = password_comprador;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public boolean getEs_vendedor() {
		return es_vendedor;
	}

	public void setEs_vendedor(boolean es_vendedor) {
		this.es_vendedor = es_vendedor;
	}

	public String getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}
	
	
}
