package com.example.demo.dto;

public class EmprestimoDto {
    public record EmprestimoRequestDto
            (long idEpi, String nomeEpi, boolean devolvido) {

    }
    public record EmprestimoResponseDto(Long idEpi, String nomeEpi, boolean devolvido) {

    }
}
