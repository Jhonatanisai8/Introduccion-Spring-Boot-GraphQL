package com.isai.demo_api_graphql.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isai.demo_api_graphql.entitys.Estudiante;
import com.isai.demo_api_graphql.persistence.IEstudianteDao;
import com.isai.demo_api_graphql.services.IEstudianteService;

@Service
public class EstudianteServiceImpl
        implements IEstudianteService {

    private final IEstudianteDao iEstudianteDao;

    public EstudianteServiceImpl(IEstudianteDao iEstudianteDao) {
        this.iEstudianteDao = iEstudianteDao;
    }

    @Override
    @Transactional(readOnly = true)
    public Estudiante buscarPorId(Long id) {
        return iEstudianteDao.findById(id).orElseThrow();
    }

    @Override
    @Transactional
    public void crearEstudiante(Estudiante estudiante) {
        iEstudianteDao.save(estudiante);
    }

    @Override
    @Transactional
    public void eliminarEstudiantePorId(Long id) {
        iEstudianteDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Estudiante> listarEstudiantes() {
        return (List<Estudiante>) iEstudianteDao.findAll();
    }

}
