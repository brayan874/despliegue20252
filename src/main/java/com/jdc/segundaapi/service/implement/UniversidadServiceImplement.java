package com.jdc.segundaapi.service.implement;

import com.jdc.segundaapi.entity.UniversidadEntity;
import com.jdc.segundaapi.repository.UniversidadRepository;
import com.jdc.segundaapi.service.IUniversidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class UniversidadServiceImplement  implements IUniversidadService {

    @Autowired
    private UniversidadRepository universidadRepository;


    @Override

    @Transactional(readOnly = true)
    public List<UniversidadEntity> findAll() {
        return universidadRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public UniversidadEntity findById(Long id) {
        return universidadRepository.findById(id).orElse(null);
    }
}
