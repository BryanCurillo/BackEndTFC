package com.ista.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.app.models.entity.Usuario;

//¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡
//investigar que es le jpa para consultar personalizadas

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
	

	
}
