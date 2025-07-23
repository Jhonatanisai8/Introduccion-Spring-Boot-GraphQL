package com.isai.demo_api_graphql.persistence;

import org.springframework.data.repository.CrudRepository;

import com.isai.demo_api_graphql.entitys.Curso;

public interface ICursoDao extends CrudRepository<Curso, Long> {

}
