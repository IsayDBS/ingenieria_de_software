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

import is.pims.MercadoManazo.dto.Vendedor;
import is.pims.MercadoManazo.service.VendedorService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/vendedor")
public class VendedorController {

	@Autowired
	VendedorService vendedorservice;
	
	@GetMapping("/{id_vendedor}")
	public ResponseEntity<Object> getVendedor(@PathVariable("id_vendedor") int id_vendedor){
		return new ResponseEntity<>(vendedorservice.getVendedor(id_vendedor), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Object> createVendedor(@RequestBody Vendedor vendedor){
		return new ResponseEntity<>(vendedorservice.createVendedor(vendedor), HttpStatus.OK);
	}
}
