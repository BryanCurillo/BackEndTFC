package com.ista.springboot.app.models.services;

import java.util.List;

import com.ista.springboot.app.models.entity.Usuario;

public interface IUsuarioService {
	
	public List<Usuario> findAll();
	
	public Usuario save(Usuario usuario);
	
	public Usuario findById(Long Id);
	
	public void delete(Long Id);
	
	//añado en metod personalizado con el nombre que quiera
	public  Usuario findByUserPass(String usu_nombreUsuario, String contrasena);
}
