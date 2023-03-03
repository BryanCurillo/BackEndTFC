package com.ista.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ista.springboot.app.models.entity.Producto;
import com.ista.springboot.app.models.services.I.IProductoService;

@RestController
@RequestMapping("/api")
public class ProductoRestController {
	@Autowired
	public IProductoService productoService ;
	
	//LISTAR
	@GetMapping("/Producto")
	public List<Producto> index(){
		return productoService.findAll();
	}

	// BUSCAR PPOR ID
	@GetMapping("/Producto/{id}")
	public Producto show(@PathVariable Long id) {
		return productoService.findById(id);
	}

	// GUARDAR
	@PostMapping("/Producto")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto create(@RequestBody Producto producto ) {
		
		return productoService.save(producto);
	}

	// EDITAR
	@PutMapping("/Producto/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto update(@RequestBody Producto producto, @PathVariable Long id) {
		
		Producto productoACTUAL = productoService.findById(id);
		productoACTUAL.setProdDescripcion(productoACTUAL.getProdDescripcion());
		productoACTUAL.setProdFoto(productoACTUAL.getProdFoto());
		productoACTUAL.setProdId(productoACTUAL.getProdId());
		productoACTUAL.setProdIdCategoria(productoACTUAL.getProdIdCategoria());
		productoACTUAL.setProdNombre(productoACTUAL.getProdNombre());
		productoACTUAL.setProdPrecio(productoACTUAL.getProdPrecio());
		
		return productoService.save(productoACTUAL);
	}

	// ELIMINAR
	@DeleteMapping("/Producto/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		productoService.delete(id);
	}
}
