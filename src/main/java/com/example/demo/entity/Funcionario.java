package com.example.demo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFuncionario;
    private String nomeFuncionario;

    public Funcionario(int idFuncionario, String nomeFuncionario) {
        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nomeFuncionario;

    }

    public void setNomeFuncionario(String nomeFuncionario) {
        if(nomeFuncionario.isEmpty()||nomeFuncionario.isBlank()){
            throw new IllegalArgumentException("invalido");

        }else{
            this.nomeFuncionario = nomeFuncionario;
        }
    }

    public long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        if(idFuncionario==0){
            throw new IllegalArgumentException("invalido");

        }else{
            this.idFuncionario = idFuncionario;
        }
    }

    public Funcionario(long idFuncionario) {
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
