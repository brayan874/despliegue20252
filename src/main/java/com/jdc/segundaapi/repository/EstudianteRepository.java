package com.jdc.segundaapi.repository;

import com.jdc.segundaapi.entity.EstudianteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<EstudianteEntity, String> {
}
