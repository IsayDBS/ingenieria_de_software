package is.pims.MercadoManazo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import is.pims.MercadoManazo.dto.Comprador;
import is.pims.MercadoManazo.service.CompradorService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/comprador")
public class CompradorController {
	
	@Autowired
	CompradorService compradorservice;
	
	@GetMapping("/{id_comprador}")
	public ResponseEntity<Object> getComprador(@PathVariable("id_comprador") int id_comprador){
		return new ResponseEntity<>(compradorservice.getComprador(id_comprador), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Object> createComprador(@RequestBody Comprador comprador){
		return new ResponseEntity<>(compradorservice.createComprador(comprador), HttpStatus.OK);
	}
}
