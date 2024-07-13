package com.example.semana7.repository;

import com.example.semana7.model.Nutricionista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NutricionistaRepository extends JpaRepository<Nutricionista, Long> {
    Nutricionista findByNome(String nome);
}
