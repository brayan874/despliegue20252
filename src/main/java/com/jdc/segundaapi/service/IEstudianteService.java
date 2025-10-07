package com.jdc.segundaapi.service;

import com.jdc.segundaapi.entity.EstudianteEntity;

import java.util.List;

public interface IEstudianteService {

    public List<EstudianteEntity> findAll();
    public EstudianteEntity findById(Long id);


}
