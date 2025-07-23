package com.isai.demo_api_graphql.persistence;

import org.springframework.data.repository.CrudRepository;

import com.isai.demo_api_graphql.entitys.Estudiante;

public interface IEstudianteDao extends CrudRepository<Estudiante, Long> {

}
