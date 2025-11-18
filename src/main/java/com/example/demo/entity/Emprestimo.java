package com.example.demo.Entity;

import com.example.demo.Entity.Funcionario;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Emprestimo {

    public Emprestimo() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmprestimo;

    @ManyToOne
    private Funcionario funcionario;

    @ManyToOne
    private EPI EPI;

    private LocalDateTime dataEmprestimo;
    private  LocalDateTime dataDevolucao;

    private boolean devolvido;

    public Emprestimo(long idEmprestimo, Funcionario funcionario, EPI EPI,  LocalDateTime dataEmprestimo, LocalDateTime dataDevolucao, boolean devolvido) {
        this.idEmprestimo = idEmprestimo;
        this.funcionario = funcionario;
        this.EPI = EPI;
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

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        if (funcionario == null) {
            throw new IllegalArgumentException("invalido");

        } else {
            this.funcionario = funcionario;

        }
    }

    public EPI getEPI() {
        return EPI;
    }

    public void setEPI(EPI EPI) {
        if (EPI == null) {
            throw new IllegalArgumentException("invalido");

        } else {
            this.EPI = EPI;

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

        // PRA ACERTAR...

        this.devolvido = devolvido;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "idEmprestimo=" + idEmprestimo +
                ", funcionario=" + funcionario +
                ", EPI=" + EPI +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                ", devolvido=" + devolvido +
                '}';
    }
}