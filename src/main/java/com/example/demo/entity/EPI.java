package com.example.demo.entity;

public class EPI {
    private int idEPI;
    private String nomeEPI;
    private boolean emprestado;

    public EPI(int idEPI, boolean emprestado) {
        this.idEPI = idEPI;
        this.emprestado = emprestado;

    }

    public int getIdEPI() {
        return idEPI;
    }

    public void setIdEPI(int idEPI) {
        if (idEPI == 0) {
            System.out.println("invalido");

        } else {
            this.idEPI = idEPI;

        }
    }

    public String getNomeEPI() {
        return nomeEPI;
    }

    public void setNomeEPI(String nomeEPI) {
        if (nomeEPI == null) {
            System.out.println("invalido");
        } else {
            this.nomeEPI = nomeEPI;
        }
    }
}
