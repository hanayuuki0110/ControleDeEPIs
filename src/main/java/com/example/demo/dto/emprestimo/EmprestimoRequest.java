package com.example.demo.dto.emprestimo;

import com.example.demo.entity.EpiEntity;
import com.example.demo.entity.FuncionarioEntity;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EmprestimoRequest {

    private long idFuncionario;
    private long idEpi;
    private long idEmprestimo;
    private boolean devolvido;
    private FuncionarioEntity funcionario;
    private EpiEntity epi;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

}
