package is.pims.MercadoManazo.dto;

public class Producto {

	private int id_producto;
	private int id_vendedor;
	private String nombre;
	private String descripcion;
	private float precio;
	private int inventario;
	private String imagen;
	
	public Producto() {
		
	}
	
	public Producto(int id_producto, int id_vendedor, String nombre, String descripcion, float precio, int inventario, String imagen) {
		this.id_producto = id_producto;
		this.id_vendedor = id_vendedor;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.inventario = inventario;
		this.imagen = imagen;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public int getId_vendedor() {
		return id_vendedor;
	}

	public void setId_vendedor(int id_vendedor) {
		this.id_vendedor = id_vendedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getInventario() {
		return inventario;
	}

	public void setInventario(int inventario) {
		this.inventario = inventario;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
}
