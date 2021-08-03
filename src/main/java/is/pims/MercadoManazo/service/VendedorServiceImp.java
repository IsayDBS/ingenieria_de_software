package is.pims.MercadoManazo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import is.pims.MercadoManazo.dto.RespuestaApi;
import is.pims.MercadoManazo.dto.Vendedor;
import is.pims.MercadoManazo.repository.VendedorRepository;

@Service
public class VendedorServiceImp implements VendedorService {

	@Autowired
	VendedorRepository vendedorrepository;
	
	@Override
	public Vendedor getVendedor(int id_vendedor) {
		// TODO Auto-generated method stub
		return vendedorrepository.getVendedor(id_vendedor);
	}

	@Override
	public RespuestaApi createVendedor(Vendedor Vendedor) {
		// TODO Auto-generated method stub
		return vendedorrepository.createVendedor(Vendedor);
	}

}
