package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

import java.time.LocalDateTime;

@Entity
public class EmprestimoEntity {

    public EmprestimoEntity() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmprestimo;

    @ManyToOne
    private FuncionarioEntity funcionario;

    @ManyToOne
    private EpiEntity epi;

    private LocalDateTime dataEmprestimo;
    private  LocalDateTime dataDevolucao;

    private boolean devolvido;

    public EmprestimoEntity(long idEmprestimo, FuncionarioEntity funcionario, String EPI,  LocalDateTime dataEmprestimo, LocalDateTime dataDevolucao, boolean devolvido) {
        this.idEmprestimo = idEmprestimo;
        this.funcionario = funcionario;
        this.epi = epi;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.devolvido = devolvido;
    }

    public long getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(long idEmprestimo) {
        if(idEmprestimo==0){
            throw new IllegalArgumentException("invalido");

        }else{
            this.idEmprestimo = idEmprestimo;

        }
    }

    public FuncionarioEntity getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioEntity funcionario) {
        if (funcionario == null) {
            throw new IllegalArgumentException("invalido");

        } else {
            this.funcionario = funcionario;

        }
    }

    public EpiEntity getEPI() {

        return epi;
    }


    public void setEpi(EpiEntity EPI) {
        if (EPI == null) {
            throw new IllegalArgumentException("invalido");

        } else {
            this.epi = EPI;

        }
    }

    public LocalDateTime getDataEmprestimo() {
        return dataEmprestimo;

    }

    public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
        if (dataEmprestimo == null) {
            throw new IllegalArgumentException("invalido");

        } else {
            this.dataEmprestimo = dataEmprestimo;

        }
    }

    public LocalDateTime getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDateTime dataDevolucao) {
        if (dataDevolucao == null) {
            throw new IllegalArgumentException("invalido");

        } else {
            this.dataDevolucao = dataDevolucao;

        }
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "idEmprestimo=" + idEmprestimo +
                ", funcionario=" + funcionario +
                ", EPI=" + epi +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                ", devolvido=" + devolvido +
                '}';
    }
}