package com.example.demo.dto.funcionario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class FuncionarioRequest {

    @NotBlank
    @NotNull
    private long idFuncionario;
    @NotBlank
    @NotNull
    private String nomeFuncionario;
    @NotBlank
    @NotNull
    private String email;

}
