package com.ista.springboot.app.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ista.springboot.app.models.entity.Persona;

public interface IPersonaDao extends CrudRepository<Persona, Long> {

	

	//modifico en metodo save para que solo me retorne 
	//la persona y no desperdiciar memoria

	
	//validar que no existan cedula ni correo de la persona 
	//para pasar a la siguiente interfaz y registrar
	@Query("SELECT COUNT(p)>0  FROM Persona p WHERE p.PerCedula = :cedula ")
	boolean existByPerCedula(@Param("cedula")String PerCedula);
	
	@Query("SELECT COUNT(p)>0  FROM Persona p WHERE p.PerCorreo = :correo ")
	boolean existByPerCorreo(@Param("correo")String PerCorreo);
	
}
