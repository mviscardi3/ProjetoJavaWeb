package com.example.ProjetoBiblioteca.entities;

import jakarta.persistence.*;

@Entity
public class Biblioteca {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Biblioteca(Integer Id, String nome, String endereco, String telefone, String listaDeLivros, String listaDeUsuarios, String funcionarios){
        this.Id = Id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.listaDeLivros = listaDeLivros;
        this.listaDeUsuarios = listaDeUsuarios;
        this.funcionarios = funcionarios;
    }

    // GETTERS
    public Integer getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getListaDeLivros() {
        return listaDeLivros;
    }

    public String getListaDeUsuarios() {
        return listaDeUsuarios;
    }

    public String getFuncionarios() {
        return funcionarios;
    }


    // SETTERS
    public void setId(Integer Id) {
        this.Id = Id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setListaDeLivros(String listaDeLivros) {
        this.listaDeLivros = listaDeLivros;
    }

    public void setListaDeUsuarios(String listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }

    public void setFuncionarios(String funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Biblioteca() {
    }
    private Integer Id;
    private String nome;
    private String endereco;
    private String telefone;
    private String listaDeLivros;
    private String listaDeUsuarios;
    private String funcionarios;

}
