package com.jdc.segundaapi.rest;


import com.jdc.segundaapi.entity.UniversidadEntity;
import com.jdc.segundaapi.service.IUniversidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/universidad")
public class UniversidadRest {


    @Autowired
    private IUniversidadService universidadService;
    @GetMapping("listar")
    public ResponseEntity<List<UniversidadEntity>> findAll() {
        return ResponseEntity.ok(universidadService.findAll());
    }

    @GetMapping("/listarby/{id}")
    public ResponseEntity <UniversidadEntity> findById(@PathVariable("id")Long id) {
        return ResponseEntity.ok(universidadService.findById(id));
    }
}