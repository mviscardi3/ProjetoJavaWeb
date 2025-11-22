package com.example.ProjetoBiblioteca.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Funcionario {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Funcionario(Integer Id, String nome, String matricula, String cargo, Instant dataAdmissao, Double salario){
        this.Id = Id;
        this.nome = nome;
        this.matricula = matricula;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public Funcionario() {
    }
    private Integer Id;
    private String nome;
    private String matricula;
    private String cargo;
    private Instant dataAdmissao;
    private Double salario;
}
