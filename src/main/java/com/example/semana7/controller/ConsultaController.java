package com.example.semana7.controller;

import com.example.semana7.model.Consulta;
import com.example.semana7.services.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {
    @Autowired
    private ConsultaService consultaService;

    @PostMapping
    public Consulta create(@RequestBody Consulta consulta) {
        return consultaService.save(consulta);
    }

    @PutMapping("/{id}")
    public Consulta update(@PathVariable Long id, @RequestBody Consulta consulta) {
        consulta.setConsulta_id(id);
        return consultaService.update(consulta);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        consultaService.delete(id);
    }

    @GetMapping("/{id}")
    public Consulta findById(@PathVariable Long id) {
        return consultaService.findById(id);
    }
}

