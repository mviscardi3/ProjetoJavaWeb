package com.example.ProjetoBiblioteca.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Multa {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Multa(Integer Id, Double valor, Instant dataGeracao, String motivo, String pago){
        this.Id =Id;
        this.valor = valor;
        this.dataGeracao = dataGeracao;
        this.motivo = motivo;
        this.pago = pago;
    }
    public Multa() {
    }
    private Integer Id;
    private Double valor;
    private Instant dataGeracao;
    private String motivo;
    private String pago;
}
