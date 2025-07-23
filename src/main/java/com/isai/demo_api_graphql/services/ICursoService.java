package com.isai.demo_api_graphql.services;

import java.util.List;

import com.isai.demo_api_graphql.entitys.Curso;

public interface ICursoService {
    Curso buscarPorId(Long id);

    List<Curso> listarEstudiantes();

    void crearCurso(Curso estudiante);

    void eliminarCursoPorId(Long id);
}
