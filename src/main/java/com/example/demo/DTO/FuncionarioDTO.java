package com.example.demo.DTO;

public class FuncionarioDTO {
    public record FuncionarioRequestDTO(long idFuncionario, String nomeFuncionario) {

    }
    public record FuncionarioResponseDTO(long idFuncionario, String nomeFuncionario) {

    }

}
