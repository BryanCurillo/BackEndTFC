package com.ista.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ista.springboot.app.models.entity.Usuario;

public interface IUsuarioDao extends JpaRepository<Usuario, Long> {

}
