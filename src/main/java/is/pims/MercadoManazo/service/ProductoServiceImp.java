package is.pims.MercadoManazo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import is.pims.MercadoManazo.dto.Producto;
import is.pims.MercadoManazo.dto.RespuestaApi;
import is.pims.MercadoManazo.repository.ProductoRepository;

@Service
public class ProductoServiceImp implements ProductoService {

	@Autowired
	ProductoRepository productorepository;
	
	
	@Override
	public List<Producto> getProductos() {
		// TODO Auto-generated method stub
		return productorepository.getProductos();
	}

	@Override
	public Producto getProducto(int id_producto, String nombre_producto) {
		// TODO Auto-generated method stub
		return productorepository.getProducto(id_producto, nombre_producto);
	}

	@Override
	public RespuestaApi createProducto(Producto producto) {
		// TODO Auto-generated method stub
		return productorepository.createProducto(producto);
	}

	@Override
	public RespuestaApi eliminarProducto(int id_producto) {
		// TODO Auto-generated method stub
		return productorepository.deleteProducto(id_producto);
	}

	@Override
	public List<Producto> getProductosBusq(String nombre_producto) {
		// TODO Auto-generated method stub
		return productorepository.getProductosBusq(nombre_producto);
	}

}
