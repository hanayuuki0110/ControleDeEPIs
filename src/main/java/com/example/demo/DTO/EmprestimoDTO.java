package com.example.demo.DTO;

public class EmprestimoDTO {
    public record EmprestimoRequestDTO(long idEPI, String nomeEPI, boolean devolvido) {

    }
    public record EmprestimoResponseDTO(Long idEPI, String nomeEPI, boolean devolvido) {

    }
}
