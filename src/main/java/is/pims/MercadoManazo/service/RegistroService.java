package is.pims.MercadoManazo.service;

import is.pims.MercadoManazo.dto.SolicitudRegistro;
import org.springframework.stereotype.Service;

@Service
public class RegistroService {

    public String registro(SolicitudRegistro req){
        return "good";
    }
}
