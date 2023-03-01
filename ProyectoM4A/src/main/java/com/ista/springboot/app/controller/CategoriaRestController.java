package com.ista.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ista.springboot.app.models.entity.Categoria;
import com.ista.springboot.app.models.services.ICategoriaService;

//HOLA MARI
@RestController
@RequestMapping("/api")
public class CategoriaRestController {

	@Autowired
	public ICategoriaService categoriaService;

	// LISTAR
	@GetMapping("/Categoria")
	public List<Categoria> index() {
		return categoriaService.findAll();
	}

	// BUSCAR POR ID
	@GetMapping("/Categoria/{id}")
	public Categoria show(@PathVariable Long id) {
		return categoriaService.findById(id);
	}

	// GUARDAR
	@PostMapping("/Categoria")
	@ResponseStatus(HttpStatus.CREATED)
	public Categoria create(@RequestBody Categoria categoria) {
		return categoriaService.save(categoria);
	}

	// EDITAR
	public Categoria update(@RequestBody Categoria categoria,@PathVariable Long id) {
		Categoria categoriaActual = categoriaService.findById(id);
		//
		//ES UNA PRUEBA DEL GIT
		
		return categoriaService.save(categoria);
	}

	//ELIMINAR
	@DeleteMapping("/Categoria/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		categoriaService.delete(id);
	}
}