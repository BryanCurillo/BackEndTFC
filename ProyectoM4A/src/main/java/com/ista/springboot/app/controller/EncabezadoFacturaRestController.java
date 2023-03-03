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

import com.ista.springboot.app.models.entity.EncabezadoFactura;
import com.ista.springboot.app.models.services.I.IEncabezadoService;

public class EncabezadoFacturaRestController {
	@Autowired
	public IEncabezadoService encabezadoService;

	// LISTAR
	@GetMapping("/EncabezadoFactura")
	public List<EncabezadoFactura> index() {
		return encabezadoService.findAll();
	}

	// BUSCAR PPOR ID
	@GetMapping("/EncabezadoFactura/{id}")
	public EncabezadoFactura show(@PathVariable Long id) {
		return encabezadoService.findById(id);
	}

	// GUARDAR
	@PostMapping("/EncabezadoFactura")
	@ResponseStatus(HttpStatus.CREATED)
	public EncabezadoFactura create(@RequestBody EncabezadoFactura encabezadoFactura) {

		return encabezadoService.save(encabezadoFactura);
	}

	// EDITAR
	@PutMapping("/EncabezadoFactura/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public EncabezadoFactura update(@RequestBody EncabezadoFactura encabezadoFactura, @PathVariable Long id) {
		
		EncabezadoFactura encabezadoFacturaACTUAL = encabezadoService.findById(id);
		encabezadoFacturaACTUAL.setEncaFecha(encabezadoFactura.getEncaFecha());
		encabezadoFacturaACTUAL.setEncaId(encabezadoFactura.getEncaId());
		encabezadoFacturaACTUAL.setEncaIdTrueque(encabezadoFactura.getEncaIdTrueque());
		encabezadoFacturaACTUAL.setEncaIdVenta(encabezadoFactura.getEncaIdVenta());
		encabezadoFacturaACTUAL.setPieFactura(encabezadoFactura.getPieFactura());
		
		return encabezadoService.save(encabezadoFacturaACTUAL);
	}

	// ELIMINAR
	@DeleteMapping("/EncabezadoFactura/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		encabezadoService.delete(id);
	}
}
