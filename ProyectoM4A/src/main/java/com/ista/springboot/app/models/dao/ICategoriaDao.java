package com.ista.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.app.models.entity.Categoria;

public interface ICategoriaDao extends JpaRepository<Categoria, Long> {

}
