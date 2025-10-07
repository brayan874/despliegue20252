package com.jdc.segundaapi.service;

import com.jdc.segundaapi.entity.UniversidadEntity;

import java.util.List;

public interface IUniversidadService {
    public List<UniversidadEntity> findAll();
    public UniversidadEntity findById(Long id);

}
