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

import com.ista.springboot.app.models.entity.Rol;
import com.ista.springboot.app.models.services.IRolService;

public class RolRestController {
	@Autowired
	public IRolService rolService;
	
	
	//LISTAR
	@GetMapping("/Rol")
	public List<Rol> index(){
		return rolService.findAll();
	}

	// BUSCAR PPOR ID
	@GetMapping("/Rol/{id}")
	public Rol show(@PathVariable Long id) {
		return rolService.findById(id);
	}

	// GUARDAR
	@PostMapping("/Rol")
	@ResponseStatus(HttpStatus.CREATED)
	public Rol create(@RequestBody Rol rol ) {
		
		return rolService.save(rol);
	}

	// EDITAR
	@PutMapping("/Rol/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Rol update(@RequestBody Rol rol , @PathVariable Long id) {
		
		Rol rolACTUAL = rolService.findById(id);
		rolACTUAL.setRolId(rol.getRolId());
		rolACTUAL.setRolNombre(rol.getRolNombre());

		return rolService.save(rolACTUAL);
	}

	// ELIMINAR
	@DeleteMapping("/Rol/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		rolService.delete(id);
	}
}
