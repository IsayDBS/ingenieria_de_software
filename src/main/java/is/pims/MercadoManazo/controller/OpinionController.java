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

import is.pims.MercadoManazo.dto.Opinion;
import is.pims.MercadoManazo.service.OpinionService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/opinion")
public class OpinionController {

	@Autowired
	OpinionService opinionservice;
	
	@GetMapping
	public ResponseEntity<Object> getOpiniones(){
		return new ResponseEntity<>(opinionservice.getOpiniones(),HttpStatus.OK);
	}
	
	@GetMapping("/{id_opinion}")
	public ResponseEntity<Object> getOpiniones(@PathVariable("id_opinion") int id_opinion){
		return new ResponseEntity<>(opinionservice.getOpiniones(id_opinion), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Object> createOpinion(@RequestBody Opinion opinion){
		return new ResponseEntity<>(opinionservice.createOpinion(opinion), HttpStatus.OK);
	}
}
