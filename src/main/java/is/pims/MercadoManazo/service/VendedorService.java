package is.pims.MercadoManazo.service;

import is.pims.MercadoManazo.dto.RespuestaApi;
import is.pims.MercadoManazo.dto.Vendedor;

public interface VendedorService {
	
	public Vendedor getVendedor(int id_vendedor);
	public RespuestaApi createVendedor(Vendedor Vendedor);
}
