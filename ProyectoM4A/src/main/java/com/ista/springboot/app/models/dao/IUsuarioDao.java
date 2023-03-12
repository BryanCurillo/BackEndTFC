package com.ista.springboot.app.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ista.springboot.app.models.entity.Usuario;

//¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡
//investigar que es le jpa para consultar personalizadas

public interface IUsuarioDao extends JpaRepository<Usuario, Long> {
	
	//metodo para retornar todos lo el metodo findall para que me retorne solo el usuario y no sus relaciones 
	//usuario activos
	@Query("SELECT new Usuario(u.UsuId, u.UsuNombreUsuario, u.UsuCalificacion) FROM Usuario u WHERE  u.UsuNombreUsuario != 'admin' and u.UsuEstado= true")
	List<Usuario> findAllUsuariosAct();
	
	//usuario Inactivos
	@Query("SELECT new Usuario(u.UsuId, u.UsuNombreUsuario, u.UsuCalificacion) FROM Usuario u WHERE  u.UsuNombreUsuario != 'admin' and u.UsuEstado= false")
	List<Usuario> findAllUsuariosInc();

	
	
	//¡¡¡¡¡¡¡¡¡¡AGREGAR EL NEW ( constructor ) este debe estar definido para 
	//crear el objeto usuario solo con los atributos que necesito
	@Query("SELECT new Usuario(u.UsuId , u.UsuNombreUsuario, u.UsuCalificacion )  FROM Usuario u WHERE u.UsuNombreUsuario = :usuario AND u.UsuContraUsuario = :contrasena")
	//tener cuidado findBy-UsuarioNombre
	//siempre tiene que ir el findBy y el nombre los atributos tal y como esta en la clase usuario el AND sirve para separar los atributos que se van a usar para buscar
	Usuario findByUsuNombreUsuarioAndUsuContraUsuario(@Param("usuario") String UsuNombreUsuario, @Param("contrasena") String UsuContraUsuario);
	
	
	//Ver si ya existe un usuario
	@Query("SELECT COUNT(u)>0  FROM Usuario u WHERE u.UsuNombreUsuario = :usuario  ")
	boolean existByUsuNombreUsuario(@Param("usuario")String UsuNombreUsuario);
	
}
