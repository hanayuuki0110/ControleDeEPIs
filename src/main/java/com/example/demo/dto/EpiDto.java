package com.example.demo.dto;

public class EpiDto {

    public record EpiRequestDto(long idEpi, String nomeEpi, int qtdDisponivel, int qtdTotal) {}

    public record EpiResponseDto(long idEpi, String nomeEpi, int qtdDisponivel, int qtdTotal) {}
}
