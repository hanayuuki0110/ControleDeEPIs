package com.example.demo.dto;

public class FuncionarioDto {
    public record FuncionarioRequestDto(long idFuncionario, String nomeFuncionario) {

    }
    public record FuncionarioResponseDto(long idFuncionario, String nomeFuncionario) {

    }

}
