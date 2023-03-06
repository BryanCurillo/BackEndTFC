package com.ista.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ista.springboot.app.models.entity.Usuario;

public interface IUsuarioConPerDao extends JpaRepository<Usuario, Long>{
	
	//¡¡¡¡¡¡¡¡¡¡AGREGAR EL NEW 
	@Query("SELECT new Usuario(u.usuNombreUsuario , u.contrasena)  FROM Usuario u WHERE u.usuNombreUsuario = :usuNombreUsuario AND u.contrasena = :contrasena")
   	Usuario findByusuNombreUsuarioAndcontrasena(@Param("usuNombreUsuario") String usuNombreUsuario, @Param("contrasena") String contrasena);

}
