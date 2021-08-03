package is.pims.MercadoManazo.service;

import java.util.List;

import is.pims.MercadoManazo.dto.Opinion;
import is.pims.MercadoManazo.dto.RespuestaApi;

public interface OpinionService {

	public List<Opinion> getOpiniones();
	public RespuestaApi createOpinion(Opinion opinion);
	public List<Opinion> getOpiniones(int id);
}
