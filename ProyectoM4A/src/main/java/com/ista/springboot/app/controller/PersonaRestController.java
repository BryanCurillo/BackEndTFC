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

import com.ista.springboot.app.models.entity.Persona;
import com.ista.springboot.app.models.services.IPersonaService;

@RestController
@RequestMapping("/api")
public class PersonaRestController {

	@Autowired
	private IPersonaService iPersonaService;

	@GetMapping("/personas")
	public List<Persona> indext() {
		return iPersonaService.findAll();
	}

	@GetMapping("/persona/{id}")
	public Persona show(@PathVariable Long id) {
		return iPersonaService.findById(id);
	}

	@PostMapping("/persona")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona create(@RequestBody Persona persona) {
		return iPersonaService.save(persona);
	}

	@DeleteMapping("/persona{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		iPersonaService.delete(id);
	}

	@PutMapping("/personaUpdate/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona update(@RequestBody Persona persona, @PathVariable Long id) {

		Persona personaactual = iPersonaService.findById(id);

		personaactual.setPerApellido(persona.getPerApellido());
		personaactual.setPerCedula(persona.getPerCedula());
		personaactual.setPerCorreo(persona.getPerCorreo());
		personaactual.setPerDireccion(persona.getPerDireccion());
		personaactual.setPerId(persona.getPerId());
		personaactual.setPerNombre(persona.getPerNombre());
		personaactual.setPerSexo(persona.getPerSexo());
		personaactual.setPerTelefono(persona.getPerTelefono());		


		return iPersonaService.save(persona);

	}
}
