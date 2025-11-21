package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity

public class EpiEntity {

    public EpiEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEpi;


    private int qtdDisponivel;
    private int qtdTotal;
    private String nome;
    private boolean devolvido;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public EpiEntity(int qtdDisponivel, int qtdTotal, long idEpi, String nome, boolean devolvido, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.qtdDisponivel = qtdDisponivel;
        this.qtdTotal = qtdTotal;
        this.idEpi = idEpi;
        this.nome = nome;
        this.devolvido = devolvido;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public int getQtdDisponivel() {
        return qtdDisponivel;
    }

    public void setQtdDisponivel(int qtdDisponivel) {
        this.qtdDisponivel = qtdDisponivel;
    }

    public int getQtdTotal() {
        return qtdTotal;
    }

    public void setQtdTotal(int qtdTotal) {
        this.qtdTotal = qtdTotal;
    }

    public long getIdEpi() {
        return idEpi;
    }

    public void setIdEpi(int idEpi) {
        this.idEpi = idEpi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
