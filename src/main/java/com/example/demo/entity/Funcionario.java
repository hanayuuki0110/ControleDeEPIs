package com.example.demo.entity;

public class Funcionario {

    private int idFuncionario;
    private String nomeFuncionario;

    public Funcionario(int idFuncionario, String nomeFuncionario) {
        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nomeFuncionario;

    }

    public void setNomeFuncionario(String nomeFuncionario) {
        if(nomeFuncionario.isEmpty()||nomeFuncionario.isBlank()){
            System.out.println("invalido");

        }else{
            this.nomeFuncionario = nomeFuncionario;
        }
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        if(idFuncionario==0){
            System.out.println("invalido");

        }else{
            this.idFuncionario = idFuncionario;
        }
    }

    public Funcionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "idFuncionario=" + idFuncionario +
                ", nomeFuncionario='" + nomeFuncionario + '\'' +
                '}';
    }
}
