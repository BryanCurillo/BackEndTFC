package com.ista.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.app.models.entity.Trueque;

public interface ITruequeDao extends CrudRepository<Trueque, Long> {

}
