package com.ista.springboot.app.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ista.springboot.app.models.entity.Usuario;

//¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡
//investigar que es le jpa para consultar personalizadas

public interface IUsuarioDao extends JpaRepository<Usuario, Long> {
	
	//metodo para retornar todos lo el metodo findall para que me retorne solo el usuario y no sus relaciones 
	//usuario activos
	//Utilizo en UsuContraUsuario para mandar mediante un join los atributos de persona y evitar crear una nueva entity con los parametros que necesito
	@Query("SELECT new Usuario(u.UsuId, CONCAT(p.PerNombre,' ', p.PerApellido,' ',p.PerCedula) as UsuContraUsuario ,u.UsuNombreUsuario) FROM Usuario u JOIN u.UsuPerId p ON u.UsuPerId = p.PerId WHERE  u.UsuNombreUsuario != 'admin' and u.UsuEstado= true")
	List<Usuario> findAllUsuariosAct();
	
	//usuario Inactivos
	@Query("SELECT new Usuario(u.UsuId, CONCAT(p.PerNombre,' ', p.PerApellido,' ',p.PerCedula) as UsuContraUsuario ,u.UsuNombreUsuario) FROM Usuario u JOIN u.UsuPerId p ON u.UsuPerId = p.PerId WHERE  u.UsuNombreUsuario != 'admin' and u.UsuEstado= false")
	List<Usuario> findAllUsuariosInc();

	
	
	//¡¡¡¡¡¡¡¡¡¡AGREGAR EL NEW ( constructor ) este debe estar definido para 
	//crear el objeto usuario solo con los atributos que necesito
	@Query("SELECT new Usuario(u.UsuId , u.UsuNombreUsuario, u.UsuCalificacion )  FROM Usuario u WHERE u.UsuNombreUsuario = :usuario AND u.UsuContraUsuario = :contrasena and u.UsuEstado= true ")
	//tener cuidado findBy-UsuarioNombre
	//siempre tiene que ir el findBy y el nombre los atributos tal y como esta en la clase usuario el AND sirve para separar los atributos que se van a usar para buscar
	Usuario findByUsuNombreUsuarioAndUsuContraUsuario(@Param("usuario") String UsuNombreUsuario, @Param("contrasena") String UsuContraUsuario);
	
	
	//Ver si ya existe un usuario
	@Query("SELECT COUNT(u)>0  FROM Usuario u WHERE u.UsuNombreUsuario = :usuario  ")
	boolean existByUsuNombreUsuario(@Param("usuario")String UsuNombreUsuario);
	
	//modificar solo el estado de la persona
	 @Modifying
	 @Query("UPDATE Usuario u SET u.UsuEstado = :estado WHERE u.UsuId = :id")
	 int actualizarEstado(@Param("id") Long UsuId, @Param("estado") Boolean UsuEstado);
	
	
}
