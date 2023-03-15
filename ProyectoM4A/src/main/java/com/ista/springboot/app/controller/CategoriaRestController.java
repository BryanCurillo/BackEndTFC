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

import com.ista.springboot.app.models.entity.Categoria;
import com.ista.springboot.app.models.services.I.ICategoriaService;

//HOLA KEVIN
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
		categoriaActual.setCatId(categoria.getCatId());
		categoriaActual.setCatNombre(categoria.getCatNombre());
		
		return categoriaService.save(categoria);
	}

	//ELIMINAR
	@DeleteMapping("/Categoria/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		categoriaService.delete(id);
	}
	
	
	//metodos personalizados
	//listar categorias acitvas o inactivas
	@GetMapping("/CategoriaAct/{estado}")
	public List<Categoria> index2(@PathVariable boolean estado) {
		return categoriaService.findCatAct(estado);
	}
	
	@PutMapping("/CategoriaEst/{estado}/{nombre}")
	@ResponseStatus(HttpStatus.CREATED)
	public int show(@PathVariable boolean estado,@PathVariable String nombre){
		//1 si se realizo cambion
		//0 no se pudo
		return categoriaService.EstadoAct(estado, nombre);
	}
	
	@PutMapping("/CategoriaUpName/{nombre}/{idCat}")
	@ResponseStatus(HttpStatus.CREATED)
	public int show2(@PathVariable String nombre,@PathVariable Long idCat){
		//1 si se realizo cambion
		//0 no se pudo
		return categoriaService.UpdateNombreCat(nombre, idCat);
	}
	
}
