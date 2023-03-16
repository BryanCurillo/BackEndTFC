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

import com.ista.springboot.app.models.entity.Oferta;
import com.ista.springboot.app.models.services.I.IOfertaService;

@RestController
@RequestMapping("/api")
public class OfertaRestController {
	@Autowired
	public IOfertaService ofertaService;

	// LISTAR
	@GetMapping("/Oferta")
	public List<Oferta> index() {
		return ofertaService.findAll();
	}

	// BUSCAR PPOR ID
	@GetMapping("/Oferta/{id}")
	public Oferta show(@PathVariable Long id) {
		return ofertaService.findById(id);
	}

	// GUARDAR
	@PostMapping("/Oferta")
	@ResponseStatus(HttpStatus.CREATED)
	public Oferta create(@RequestBody Oferta oferta) {

		return ofertaService.save(oferta);
	}

	// EDITAR
	@PutMapping("/Oferta/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Oferta update(@RequestBody Oferta oferta, @PathVariable Long id) {

		Oferta ofertaACTUAL = ofertaService.findById(id);
		ofertaACTUAL.setPoIdOferta(oferta.getPoIdOferta());
		ofertaACTUAL.setOfeEstado(oferta.getOfeEstado());
		ofertaACTUAL.setOfeId(oferta.getOfeId());

		return ofertaService.save(ofertaACTUAL);
	}

	// ELIMINAR
	@DeleteMapping("/Oferta/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		ofertaService.delete(id);
	}
}
