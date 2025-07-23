package com.isai.demo_api_graphql.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isai.demo_api_graphql.entitys.Curso;
import com.isai.demo_api_graphql.persistence.ICursoDao;
import com.isai.demo_api_graphql.services.ICursoService;

@Service
public class CursoServiceImpl
        implements ICursoService {

    private final ICursoDao iCursoDao;

    public CursoServiceImpl(ICursoDao iCursoDao) {
        this.iCursoDao = iCursoDao;
    }

    @Override
    @Transactional(readOnly = true)
    public Curso buscarPorId(Long id) {
        return iCursoDao.findById(id).orElseThrow();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Curso> listarEstudiantes() {
        return (List<Curso>) iCursoDao.findAll();
    }

    @Override
    @Transactional
    public void crearCurso(Curso estudiante) {
        iCursoDao.save(estudiante);
    }

    @Override
    @Transactional
    public void eliminarCursoPorId(Long id) {
        iCursoDao.deleteById(id);
    }

}
