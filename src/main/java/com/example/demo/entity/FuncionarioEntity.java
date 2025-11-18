package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class FuncionarioEntity {

    public FuncionarioEntity() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFuncionario;
    private String nomeFuncionario;
    private String email;

    public FuncionarioEntity(int idFuncionario, String nomeFuncionario) {
        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.email = email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.isEmpty()||email.isBlank()){
            throw new IllegalArgumentException("email invalido");
        }

    }

    public void setIdFuncionario(int idFuncionario) {
        if(idFuncionario==0){
            throw new IllegalArgumentException("invalido");

        }else{
            this.idFuncionario = idFuncionario;
        }

    }

    public FuncionarioEntity(long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }


    @Override
    public String toString() {
        return "FuncionarioEntity{" +
                "idFuncionario=" + idFuncionario +
                ", nomeFuncionario='" + nomeFuncionario + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
