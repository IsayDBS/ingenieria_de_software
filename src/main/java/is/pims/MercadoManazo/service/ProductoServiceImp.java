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
		return productorepository.findAll();
	}



}
