package is.pims.MercadoManazo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import is.pims.MercadoManazo.dto.Comprador;
import is.pims.MercadoManazo.dto.RespuestaApi;
import is.pims.MercadoManazo.repository.CompradorRepository;

@Service
public class CompradorServiceImp implements CompradorService {

	@Autowired
	CompradorRepository compradorrepository;
	
	@Override
	public Comprador getComprador(int id_comprador) {
		// TODO Auto-generated method stub
		return compradorrepository.getComprador(id_comprador);
	}

	@Override
	public RespuestaApi createComprador(Comprador comprador) {
		// TODO Auto-generated method stub
		return compradorrepository.createComprador(comprador);
	}

}
