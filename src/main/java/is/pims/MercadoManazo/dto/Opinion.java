package is.pims.MercadoManazo.dto;

public class Opinion {
	
	private int id_opinion;
	private int id_producto;
	private int id_comprador;
	private int calificacion;
	private String comentario;
	
	public Opinion() {
		
	}
	
	public Opinion(int id_opinion, int id_producto, int id_comprador, int calificacion, String comentario) {
		this.id_opinion = id_opinion;
		this.id_producto = id_producto;
		this.id_comprador = id_comprador;
		this.calificacion = calificacion;
		this.comentario = comentario;
	}
	
	public int getId_opinion() {
		return this.id_opinion;
	}
	
	public void setId_opinion(int id_opinion) {
		this.id_opinion = id_opinion;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public int getId_comprador() {
		return id_comprador;
	}

	public void setId_comprador(int id_comprador) {
		this.id_comprador = id_comprador;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
}
