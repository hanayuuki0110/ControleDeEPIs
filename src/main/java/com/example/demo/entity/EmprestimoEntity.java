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

    private String dataEmprestimo;
    private  String dataDevolucao;

    private boolean devolvido;

    public EmprestimoEntity(long idEmprestimo, FuncionarioEntity funcionario, String EPI,  String dataEmprestimo, String dataDevolucao, boolean devolvido) {
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
            throw new IllegalArgumentException("epi invalido");

        } else {
            this.epi = EPI;

        }
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public EpiEntity getEpi() {
        return epi;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        if (dataDevolucao == null) {
            throw new IllegalArgumentException("dataDevolucao invalido");
        }else {
            this.dataDevolucao = dataDevolucao;
        }
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        if (dataEmprestimo == null) {
            throw new IllegalArgumentException("dataEmprestimo invalido");

        }else{
            this.dataEmprestimo = dataEmprestimo;
        }


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