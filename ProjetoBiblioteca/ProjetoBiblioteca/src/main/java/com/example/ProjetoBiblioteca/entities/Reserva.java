package com.example.ProjetoBiblioteca.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Reserva {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Reserva(Integer Id, Instant dataReserva, String status, String livro, String usuario){
        this.Id = Id;
        this.dataReserva = dataReserva;
        this.status = status;
        this.livro = livro;
        this.usuario = usuario;
    }
    public Reserva() {
    }
    private Integer Id;
    private Instant dataReserva;
    private String status;
    private String livro;
    private String usuario;
}
