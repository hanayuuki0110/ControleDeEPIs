package com.example.demo.dto.epi;

import lombok.Data;
import java.time.LocalDate;

@Data
public class EpiResponse {

    private long idEpi;

    private String nomeEpi;

    private int qtdDisponivel;

    private int qtdTotal;

    private boolean devolvido;

    private LocalDate dataEmprestimo;

    private LocalDate dataDevolucao;
}
