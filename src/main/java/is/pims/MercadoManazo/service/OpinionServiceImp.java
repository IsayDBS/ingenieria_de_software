package is.pims.MercadoManazo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import is.pims.MercadoManazo.dto.Opinion;
import is.pims.MercadoManazo.dto.RespuestaApi;
import is.pims.MercadoManazo.repository.OpinionRepository;

@Service
public class OpinionServiceImp implements OpinionService {

	@Autowired
	OpinionRepository opinionrepository;
	
	@Override
	public List<Opinion> getOpiniones() {
		// TODO Auto-generated method stub
		return opinionrepository.findAll();
	}
}
