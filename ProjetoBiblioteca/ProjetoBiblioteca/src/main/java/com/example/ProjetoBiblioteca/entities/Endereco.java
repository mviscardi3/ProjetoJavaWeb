package com.example.ProjetoBiblioteca.entities;

import jakarta.persistence.*;

@Entity
public class Endereco {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Endereco(Integer Id, String rua, Integer numero, String bairro, String cidade, String estado, String cep){
        this.Id = Id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public Endereco() {
    }
    private Integer Id;
    private String rua;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
}
