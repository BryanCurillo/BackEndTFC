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

import com.ista.springboot.app.models.entity.Usuario;
import com.ista.springboot.app.models.services.IUsuarioService;

public class UsuarioRestController {

	@Autowired
	public IUsuarioService usuarioService;
	
	//LISTAR
	@GetMapping("/Usuario")
	public List<Usuario> index(){
		return usuarioService.findAll();
	}
	
	//BUSCAR PPOR ID
	@GetMapping("/Usuario/{id}")
	public Usuario show(@PathVariable Long id) {
		return usuarioService.findById(id);
	}
	
	//GUARDAR
	@PostMapping("/Usuario")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario create(@RequestBody Usuario usuario  ) {
		
		return usuarioService.save(usuario);
	}
	
	//EDITAR
	@PutMapping("/Usuario/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id) {
		
		Usuario usuarioACTUAL = usuarioService.findById(id);

		return usuarioService.save(usuarioACTUAL);
	}
	
	//ELIMINAR
	@DeleteMapping("/Usuario/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		usuarioService.delete(id);
	}
}
