package com.example.demo.dto.epi;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data

public class EpiRequest {

    @NotBlank
    private String nomeEpi;
    @NotNull
    private int qtdDisponivel;
    @NotNull
    private int qtdTotal;

    private boolean devolvido;

    private LocalDate dataEmprestimo;

    private LocalDate dataDevolucao;
}
