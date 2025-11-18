package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity

public class EPI {

    public EPI() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int qtdDisponivel;
    private int qtdTotal;
    private long idEPI;
    private String nomeEPI;
    private boolean emprestado;

    public EPI(long idEPI, String nomeEPI, int qtdDisponivel, int qtdTotal, boolean emprestado) {
        this.idEPI = idEPI;
        this.nomeEPI = nomeEPI;
        this.qtdDisponivel = qtdDisponivel;
        this.qtdTotal = qtdTotal;
        this.emprestado = emprestado;

    }

    public long getIdEPI() {
        return idEPI;
    }

    public void setIdEPI(int idEPI) {
        if (idEPI == 0) {
            throw new IllegalArgumentException("invalido");

        } else {
            this.idEPI = idEPI;

        }
    }

    public String getNomeEPI() {
        return nomeEPI;
    }

    public void setNomeEPI(String nomeEPI) {
        if (nomeEPI == null) {
            throw new IllegalArgumentException("invalido");

        } else {
            this.nomeEPI = nomeEPI;
        }
    }

    public int getQtdDisponivel() {
        return qtdDisponivel;
    }

    public void setQtdDisponivel(int qtdDisponivel) {
        if (qtdDisponivel == 0) {
            throw new IllegalArgumentException("invalido");

        }else{
            this.qtdDisponivel = qtdDisponivel;

        }
    }

    public int getQtdTotal() {
        return qtdTotal;
    }

    public void setQtdTotal(int qtdTotal) {
        if (qtdTotal == 0) {
            throw new IllegalArgumentException("invalido");

        }else{
            this.qtdTotal = qtdTotal;
        }
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        return "EPI{" +
                "qtdDisponivel=" + qtdDisponivel +
                ", qtdTotal=" + qtdTotal +
                ", idEPI=" + idEPI +
                ", nomeEPI='" + nomeEPI + '\'' +
                ", emprestado=" + emprestado +
                '}';
    }
}