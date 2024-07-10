package com.example.semana7.controller;

import com.example.semana7.model.Nutricionista;
import com.example.semana7.services.NutricionistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nutricionistas")
public class NutricionistaController {
    @Autowired
    private NutricionistaService nutricionistaService;

    @PostMapping
    public Nutricionista create(@RequestBody Nutricionista nutricionista) {
        return nutricionistaService.save(nutricionista);
    }

    @PutMapping("/{id}")
    public Nutricionista update(@PathVariable Long id, @RequestBody Nutricionista nutricionista) {
        nutricionista.setNutricionista_id(id);
        return nutricionistaService.update(nutricionista);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        nutricionistaService.delete(id);
    }

    @GetMapping("/{id}")
    public Nutricionista findById(@PathVariable Long id) {
        return nutricionistaService.findById(id);
    }
}
