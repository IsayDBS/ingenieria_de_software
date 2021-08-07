package is.pims.MercadoManazo.service;

import is.pims.MercadoManazo.dto.Comprador;
import is.pims.MercadoManazo.dto.RespuestaApi;

public interface CompradorService {

	public Comprador getComprador(int id_comprador);
	public RespuestaApi createComprador(Comprador comprador);
}
