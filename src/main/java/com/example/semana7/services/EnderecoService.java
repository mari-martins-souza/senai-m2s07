package com.example.semana7.services;

import com.example.semana7.model.Endereco;
import com.example.semana7.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco save(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public Endereco update(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public void delete(Long id) {
        enderecoRepository.deleteById(id);
    }

    public Endereco findById(Long id) {
        return enderecoRepository.findById(id).orElse(null);
    }
}
