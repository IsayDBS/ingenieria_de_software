package is.pims.MercadoManazo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import is.pims.MercadoManazo.dto.Producto;
import is.pims.MercadoManazo.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	ProductoService productoservice;
	

	@GetMapping
	public ResponseEntity<Object> getProductos(){
		return new ResponseEntity<>(productoservice.getProductos(), HttpStatus.OK);
	}
	
	
	@GetMapping("/{nombre_producto}")
	public ResponseEntity<Object> getProductosBusq(@PathVariable("nombre_producto") String nombre_producto){
		return new ResponseEntity<>(productoservice.getProductosBusq(nombre_producto), HttpStatus.OK);
	}
	
	/*
	@GetMapping("/{id_producto}")
	public ResponseEntity<Object> getProducto(@PathVariable("id_producto") int id_producto){
		return new ResponseEntity<>(productoservice.getProducto(id_producto), HttpStatus.OK);
	}
	*/
	
	@PostMapping
	public ResponseEntity<Object> createProducto(@RequestBody Producto producto){
		return new ResponseEntity<>(productoservice.createProducto(producto), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id_producto}")
	public ResponseEntity<Object> deleteProducto(@PathVariable("id_producto") int id_producto){
		return new ResponseEntity<>(productoservice.eliminarProducto(id_producto), HttpStatus.OK);
	}
}
