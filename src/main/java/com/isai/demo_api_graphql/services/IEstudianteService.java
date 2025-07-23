package com.isai.demo_api_graphql.services;

import java.util.List;

import com.isai.demo_api_graphql.entitys.Estudiante;

public interface IEstudianteService {

    Estudiante buscarPorId(Long id);

    List<Estudiante> listarEstudiantes();

    void crearEstudiante(Estudiante estudiante);

    void eliminarEstudiantePorId(Long id);
}
