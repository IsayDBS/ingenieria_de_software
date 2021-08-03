package is.pims.MercadoManazo.dto;

public class Vendedor {

	private int id_vendedor;
	private String nombre_usuario;
	private String apellido_usuario;
	private String correo;
	private String password_vendedor;
	private String telefono;
	private boolean es_vendedor;
	
	public Vendedor() {
		
	}
	
	public Vendedor(int id_vendedor, String nombre_usuario, String apellido_usuario, String correo, String password_vendedor, String telefono, boolean es_vendedor) {
		this.id_vendedor = id_vendedor;
		this.nombre_usuario = nombre_usuario;
		this.apellido_usuario = apellido_usuario;
		this.correo = correo;
		this.password_vendedor = password_vendedor;
		this.telefono = telefono;
		this.es_vendedor = es_vendedor;
	}

	public int getId_vendedor() {
		return id_vendedor;
	}

	public void setId_vendedor(int id_vendedor) {
		this.id_vendedor = id_vendedor;
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

	public String getPassword_vendedor() {
		return password_vendedor;
	}

	public void setPassword_vendedor(String password_vendedor) {
		this.password_vendedor = password_vendedor;
	}
	
	public String getTelefono() {
		return this.telefono;
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
	
	
}
