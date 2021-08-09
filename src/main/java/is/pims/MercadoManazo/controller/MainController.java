package is.pims.MercadoManazo.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index (Model model){return "index";}

    @GetMapping("/login")
    public String viewLoginPage(){return "login";}

    @GetMapping("/register/confirm")
    public String muestraLog(){return "login";}


}
