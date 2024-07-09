package com.example.semana7.services;

import com.example.semana7.model.Nutricionista;
import com.example.semana7.repository.NutricionistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NutricionistaService {
    @Autowired
    private NutricionistaRepository nutricionistaRepository;

    public Nutricionista save(Nutricionista nutricionista) {
        return nutricionistaRepository.save(nutricionista);
    }

    public Nutricionista update(Nutricionista nutricionista) {
        return nutricionistaRepository.save(nutricionista);
    }

    public void delete(Long id) {
        nutricionistaRepository.deleteById(id);
    }

    public Nutricionista findById(Long id) {
        return nutricionistaRepository.findById(id).orElse(null);
    }
}
