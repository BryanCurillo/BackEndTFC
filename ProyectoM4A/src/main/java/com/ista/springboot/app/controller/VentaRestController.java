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

import com.ista.springboot.app.models.entity.Venta;
import com.ista.springboot.app.models.services.I.IVentaService;

@RestController
@RequestMapping("/api")
public class VentaRestController {

	@Autowired
	public IVentaService ventaService;
	
	//LISTAR
	@GetMapping("/Venta")
	public List<Venta> index(){
		return ventaService.findAll();
	}

	// BUSCAR PPOR ID
	@GetMapping("/Venta/{id}")
	public Venta show(@PathVariable Long id) {
		return ventaService.findById(id);
	}

	// GUARDAR
	@PostMapping("/Venta")
	@ResponseStatus(HttpStatus.CREATED)
	public Venta create(@RequestBody Venta venta  ) {
		
		return ventaService.save(venta);
	}

	// EDITAR
	@PutMapping("/Venta/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Venta update(@RequestBody Venta venta, @PathVariable Long id) {
		
		Venta ventaACTUAL = ventaService.findById(id);
		ventaACTUAL.setVenIdComprador(venta.getVenIdComprador());
		ventaACTUAL.setVenIdPublicacion(venta.getVenIdPublicacion());
		ventaACTUAL.setVenId(venta.getVenId());
		

		return ventaService.save(ventaACTUAL);
	}

	// ELIMINAR
	@DeleteMapping("/Venta/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		ventaService.delete(id);
	}
}
