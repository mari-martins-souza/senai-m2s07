package com.example.semana7.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Paciente {
    @Id
    private Long paciente_id;
    private String nome;
    private Date data_de_nascimento;
    private String cpf;
    private String telefone;
    private String email;
    private Long endereco_id;
}
