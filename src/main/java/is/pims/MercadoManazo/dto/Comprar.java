package is.pims.MercadoManazo.dto;

public class Comprar {

	private int id_vendedor;
	private int id_comprador;
	
	public Comprar() {
		
	}
	
	public Comprar(int id_vendedor, int id_comprador) {
		this.id_vendedor = id_vendedor;
		this.id_comprador = id_comprador;
	}

	public int getId_vendedor() {
		return id_vendedor;
	}

	public void setId_vendedor(int id_vendedor) {
		this.id_vendedor = id_vendedor;
	}

	public int getId_comprador() {
		return id_comprador;
	}

	public void setId_comprador(int id_comprador) {
		this.id_comprador = id_comprador;
	}
	
	
}
