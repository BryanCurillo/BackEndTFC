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

import com.ista.springboot.app.models.entity.DetalleFactura;
import com.ista.springboot.app.models.services.IDetalleFacturaService;

@RestController
@RequestMapping("/api")
public class DetalleFacturaRestController {

	@Autowired
	public IDetalleFacturaService detalleFacturaService;

	// LISTAR
	@GetMapping("/DetalleFactura")
	public List<DetalleFactura> index() {
		return detalleFacturaService.findAll();
	}

	// BUSCAR PPOR ID
	@GetMapping("/DetalleFactura/{id}")
	public DetalleFactura show(@PathVariable Long id) {
		return detalleFacturaService.findById(id);
	}

	// GUARDAR
	@PostMapping("/DetalleFactura")
	@ResponseStatus(HttpStatus.CREATED)
	public DetalleFactura create(@RequestBody DetalleFactura detalleFactura) {

		return detalleFacturaService.save(detalleFactura);
	}

	// EDITAR
	@PutMapping("/DetalleFactura/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public DetalleFactura update(@RequestBody DetalleFactura detalleFactura, @PathVariable Long id) {

		DetalleFactura detalleFacturaACTUAL = detalleFacturaService.findById(id);

		//
		//
		//

		return detalleFacturaService.save(detalleFacturaACTUAL);
	}

	// ELIMINAR
	@DeleteMapping("/DetalleFactura/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		detalleFacturaService.delete(id);
	}

}
