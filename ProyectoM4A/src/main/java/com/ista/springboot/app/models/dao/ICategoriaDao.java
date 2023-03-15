package com.ista.springboot.app.models.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ista.springboot.app.models.entity.Categoria;

public interface ICategoriaDao extends JpaRepository<Categoria, Long> {
	
	
	//retornar las categorias activas
	//primera manera pero me retorna todos las relaciones
	//y desperdia recursos
	@Query("SELECT new Categoria(c.CatId ,c.CatNombre) FROM Categoria c WHERE  c.CatEstado=:estado")
	List<Categoria> findAllBycatEstado(boolean estado);
	
	
	@Modifying
	@Query("UPDATE Categoria c SET c.CatEstado= :estado WHERE c.CatNombre = :nombre")
	int actualizarEstado(@Param("estado")boolean CatEstado, @Param("nombre")String CatNombre);
	
	
	@Modifying
	@Query("UPDATE Categoria c SET c.CatNombre= :nombreNew WHERE c.CatId = :CatId")
	int actualizarNombre(@Param("nombreNew") String CatNombre,@Param("CatId") Long  CatId);
	
}
