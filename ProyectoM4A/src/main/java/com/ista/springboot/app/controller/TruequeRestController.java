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

import com.ista.springboot.app.models.entity.Trueque;
import com.ista.springboot.app.models.services.ITruequeService;

public class TruequeRestController {

	@Autowired
	public ITruequeService truequeService;
	
	//LISTAR
	@GetMapping("/Trueque")
	public List<Trueque> index(){
		return truequeService.findAll();
	}

	// BUSCAR PPOR ID
	@GetMapping("/Trueque/{id}")
	public Trueque show(@PathVariable Long id) {
		return truequeService.findById(id);
	}

	// GUARDAR
	@PostMapping("/Trueque")
	@ResponseStatus(HttpStatus.CREATED)
	public Trueque create(@RequestBody Trueque trueque  ) {
		
		return truequeService.save(trueque);
	}

	// EDITAR
	@PutMapping("/Trueque/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Trueque update(@RequestBody Trueque trueque , @PathVariable Long id) {
		
		Trueque truequeACTUAL = truequeService.findById(id);

		return truequeService.save(truequeACTUAL);
	}

	// ELIMINAR
	@DeleteMapping("/Trueque/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		truequeService.delete(id);
	}

}
