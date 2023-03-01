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

import com.ista.springboot.app.models.entity.PieFactura;
import com.ista.springboot.app.models.services.IPieFacturaService;

public class PieFacturaRestController {
	@Autowired
	public IPieFacturaService pieFacturaService;

	// LISTAR
	@GetMapping("/PieFactura")
	public List<PieFactura> index() {
		return pieFacturaService.findAll();
	}

	// BUSCAR PPOR ID
	@GetMapping("/PieFactura/{id}")
	public PieFactura show(@PathVariable Long id) {
		return pieFacturaService.findById(id);
	}

	// GUARDAR
	@PostMapping("/PieFactura")
	@ResponseStatus(HttpStatus.CREATED)
	public PieFactura create(@RequestBody PieFactura pieFactura) {

		return pieFacturaService.save(pieFactura);
	}

	// EDITAR
	@PutMapping("/PieFactura/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public PieFactura update(@RequestBody PieFactura pieFactura, @PathVariable Long id) {

		PieFactura pieFacturaACTUAL = pieFacturaService.findById(id);

		//
		//
		//
		//
		
		return pieFacturaService.save(pieFacturaACTUAL);
	}

	// ELIMINAR
	@DeleteMapping("/PieFactura/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		pieFacturaService.delete(id);
	}
}
