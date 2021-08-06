package is.pims.MercadoManazo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import is.pims.MercadoManazo.dto.Email;
import is.pims.MercadoManazo.service.EmailService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(value="/email")
public class EmailController {
		
	@Autowired
	private EmailService emailPort;
		
	@PostMapping(value = "/send")
	@ResponseBody
	public boolean SendEmail(@RequestBody Email emailBody)  {
		return emailPort.sendEmail(emailBody);
	}
}
