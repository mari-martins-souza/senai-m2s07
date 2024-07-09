package com.example.semana7.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Endereco {
    @Id
    private Long endereco_id;
    private String logradouro;
    private String estado;
    private String cidade;
    private String numero;
    private String cep;
}
