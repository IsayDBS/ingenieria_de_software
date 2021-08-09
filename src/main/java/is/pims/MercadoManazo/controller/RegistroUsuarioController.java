package is.pims.MercadoManazo.controller;

import is.pims.MercadoManazo.dto.SolicitudRegistro;
import is.pims.MercadoManazo.service.RegistroService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/register")
@AllArgsConstructor
public class RegistroUsuarioController {

    private final RegistroService registroService;

    @GetMapping
    public  String muestraRegistro(Model model){
        model.addAttribute("req", new SolicitudRegistro());
        return "register";
    };



    @PostMapping
    public String registro(SolicitudRegistro req){
        return registroService.registro(req);
    }
}
