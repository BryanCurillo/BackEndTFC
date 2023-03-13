package com.ista.springboot.app.models.services.I;

import java.util.List;

import com.ista.springboot.app.models.entity.Usuario;

public interface IUsuarioService {
	
	public List<Usuario> findAll();
	
	public Usuario save(Usuario usuario);
	
	public Usuario findById(Long Id);
	
	public void delete(Long Id);
	
	
	//añado en metod personalizado con el nombre que quiera
	public  Usuario findByUserPass(String usu_nombreUsuario, String contrasena);
	
	
	public  Boolean existByUser(String usu_nombreUsuario);
	
	public List<Usuario> findAllUsuAct();
	
	public List<Usuario> findAllUsuInc();
	
	public int updateEstado(Long id,Boolean estado);
	
	
}
