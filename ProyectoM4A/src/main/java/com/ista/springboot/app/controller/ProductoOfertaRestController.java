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
import org.springframework.web.bind.annotation.ResponseStatus;

import com.ista.springboot.app.models.entity.ProductoOferta;
import com.ista.springboot.app.models.services.IProductoOfertaService;

public class ProductoOfertaRestController {
	@Autowired
	public IProductoOfertaService ofertaService;

	// LISTAR
	@GetMapping("/ProductoOferta")
	public List<ProductoOferta> index() {
		return ofertaService.findAll();
	}

	// BUSCAR PPOR ID
	@GetMapping("/ProductoOferta/{id}")
	public ProductoOferta show(@PathVariable Long id) {
		return ofertaService.findById(id);
	}

	// GUARDAR
	@PostMapping("/ProductoOferta")
	@ResponseStatus(HttpStatus.CREATED)
	public ProductoOferta create(@RequestBody ProductoOferta productoOferta) {

		return ofertaService.save(productoOferta);
	}

	// EDITAR
	@PutMapping("/ProductoOferta/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ProductoOferta update(@RequestBody ProductoOferta productoOferta, @PathVariable Long id) {

		ProductoOferta productoOfertaACTUAL = ofertaService.findById(id);
		productoOfertaACTUAL.setPoDescripcion(productoOferta.getPoDescripcion());
		productoOfertaACTUAL.setPodIdOferta(productoOferta.getPodIdOferta());
		productoOfertaACTUAL.setPoFoto(productoOferta.getPoFoto());
		productoOfertaACTUAL.setPoId(productoOferta.getPoId());
		productoOfertaACTUAL.setPoNombre(productoOferta.getPoNombre());
		productoOfertaACTUAL.setPoPrecio(productoOferta.getPoPrecio());
		
		
		return ofertaService.save(productoOfertaACTUAL);
	}

	// ELIMINAR
	@DeleteMapping("/ProductoOferta/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		ofertaService.delete(id);
	}

}
