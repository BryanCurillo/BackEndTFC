package com.ista.springboot.app.models.services.I;

import java.util.List;

import com.ista.springboot.app.models.entity.Categoria;

public interface ICategoriaService {
	
	public List<Categoria> findAll();

	public Categoria save(Categoria categoria);

	public Categoria findById(Long id);

	public void delete(Long id);
	
	//metodos personalizados
	public List<Categoria> findCatAct(boolean estado);
	
	public int EstadoAct(boolean estado , String nombre);
	
	
	public int UpdateNombreCat(String nombreNew, Long idCat);
	
	
}
