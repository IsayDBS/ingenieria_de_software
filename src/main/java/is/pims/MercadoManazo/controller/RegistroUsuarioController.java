package is.pims.MercadoManazo.controller;

import is.pims.MercadoManazo.dto.SolicitudRegistro;
import is.pims.MercadoManazo.service.RegistroService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/register")
@AllArgsConstructor
public class RegistroUsuarioController {

    private final RegistroService registroService;

    @PostMapping
    public String registro(@RequestBody SolicitudRegistro req){
        return registroService.registro(req);
    }
}
