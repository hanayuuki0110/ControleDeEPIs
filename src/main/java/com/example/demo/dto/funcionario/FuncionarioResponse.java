package com.example.demo.dto.funcionario;

import lombok.Data;

@Data
public class FuncionarioResponse {

    private long idFuncionario;

    private String nomeFuncionario;

    private String email;
}
