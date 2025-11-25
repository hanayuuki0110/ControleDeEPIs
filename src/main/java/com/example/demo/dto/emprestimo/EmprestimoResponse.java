package com.example.demo.dto.emprestimo;

import com.example.demo.entity.EpiEntity;
import com.example.demo.entity.FuncionarioEntity;
import lombok.Data;

@Data
public class EmprestimoResponse {

    private long idFuncionario;
    private long idEpi;
    private long idEmprestimo;
    private FuncionarioEntity funcionario;
    private EpiEntity epi;
}
