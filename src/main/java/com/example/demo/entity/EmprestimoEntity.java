package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "Emprestimos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmprestimoEntity {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmprestimo;

    @ManyToOne
    private FuncionarioEntity funcionario;

    @ManyToOne
    private EpiEntity epi;

    private String dataEmprestimo;
    private  String dataDevolucao;

    private boolean devolvido;





}