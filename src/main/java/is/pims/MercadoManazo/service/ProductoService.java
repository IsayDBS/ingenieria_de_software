package is.pims.MercadoManazo.service;

import java.util.List;

import is.pims.MercadoManazo.dto.Producto;
import is.pims.MercadoManazo.dto.RespuestaApi;

public interface ProductoService {

	public List<Producto> getProductos();
	public List<Producto> getProductosBusq(String nombre_producto);
	public Producto getProducto(int id_producto, String nombre_producto);
	public RespuestaApi createProducto(Producto producto);
	public RespuestaApi eliminarProducto(int id_producto);
	public RespuestaApi updateProducto(Producto producto, int id_producto);
}
