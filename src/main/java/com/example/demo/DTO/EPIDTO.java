package com.example.demo.DTO;

public class EPIDTO {
    public record EPIRequestDTO(long idEPI, String nomeEPI, int qtdDisponivel, int qtdTotal) {}

    public record FuncionarioRequestDTO(long idEPI, String nomeEPI, int qtdDisponivel, int qtdTotal) {}
}
