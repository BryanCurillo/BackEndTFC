package com.ista.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ista.springboot.app.models.entity.Trueque;

public interface ITruequeDao extends JpaRepository<Trueque, Long> {

}
