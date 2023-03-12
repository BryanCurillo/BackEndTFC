	package com.ista.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ista.springboot.app.models.entity.Usuario;
import com.ista.springboot.app.models.services.I.IUsuarioService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UsuarioRestController {
	/**
	 * 
	 * temporal para areglar el error 001
	 * 
	 * 
	 */
	@Qualifier("usuarioServiceImpl")

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
		usuarioACTUAL.setUsuCalificacion(usuario.getUsuCalificacion());
		usuarioACTUAL.setUsuId(usuario.getUsuId());
		usuarioACTUAL.setUsuNombreUsuario(usuario.getUsuNombreUsuario());
		usuarioACTUAL.setUsuPerId(usuario.getUsuPerId());
		usuarioACTUAL.setUsuContraUsuario(usuario.getUsuContraUsuario());
		usuarioACTUAL.setUsuEstado(usuario.getUsuEstado());
		
		return usuarioService.save(usuarioACTUAL);
	}
	
	//ELIMINAR
	@DeleteMapping("/Usuario/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		usuarioService.delete(id);
	}
	
	//METODOS PERSONALIZADOS
	
	
	@GetMapping("/Usuario/{user}/{pass}")
	public Usuario show(@PathVariable String user,@PathVariable String pass) {
		System.out.println(user+' '+pass);
		return usuarioService.findByUserPass(user, pass);
		

	}
	
	@GetMapping("/Usuario/exist/{user}")
	public Boolean show(@PathVariable String user) {
		return usuarioService.existByUser(user);
		

	}
	
	@GetMapping("/Usuarios")
	public List<Usuario> index2(){
		return usuarioService.findAllUsuarios();
	}
}
