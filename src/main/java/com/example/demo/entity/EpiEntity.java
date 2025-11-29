package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "Epi")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EpiEntity {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEpi;


    private int qtdDisponivel;
    private int qtdTotal;
    private String nomeEpi;
    private boolean devolvido;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;



}
