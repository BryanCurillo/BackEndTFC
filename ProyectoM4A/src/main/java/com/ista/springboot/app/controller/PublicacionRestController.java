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

import com.ista.springboot.app.models.entity.Publicacion;
import com.ista.springboot.app.models.services.I.IPublicacionService;

@RestController
@RequestMapping("/api")
public class PublicacionRestController {
	@Autowired
	public IPublicacionService publicacionService;
	
	//LISTAR
	@GetMapping("/Publicacion")
	public List<Publicacion> index(){
		return publicacionService.findAll();
	}

	// BUSCAR PPOR ID
	@GetMapping("/Publicacion/{id}")
	public Publicacion show(@PathVariable Long id) {
		return publicacionService.findById(id);
	}

	// GUARDAR
	@PostMapping("/Publicacion")
	@ResponseStatus(HttpStatus.CREATED)
	public Publicacion create(@RequestBody Publicacion publicacion  ) {
		
		return publicacionService.save(publicacion);
	}

	// EDITAR
	@PutMapping("/Publicacion/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Publicacion update(@RequestBody Publicacion publicacion , @PathVariable Long id) {
		
		Publicacion publicacionACTUAL = publicacionService.findById(id);
		publicacionACTUAL.setPubDescripcion(publicacion.getPubDescripcion());
		publicacionACTUAL.setPubId(publicacion.getPubId());
		publicacionACTUAL.setPubIdProducto(publicacion.getPubIdProducto());
		publicacionACTUAL.setPubIdVendedor(publicacion.getPubIdVendedor());		
		
		return publicacionService.save(publicacionACTUAL);
	}

	// ELIMINAR
	@DeleteMapping("/Publicacion/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		publicacionService.delete(id);
	}
}
