package com.example.demo.dto.emprestimo;

import com.example.demo.entity.EpiEntity;
import com.example.demo.entity.FuncionarioEntity;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class EmprestimoRequest {

    private long idFuncionario;
    private long idEpi;
    private long idEmprestimo;
    private FuncionarioEntity funcionario;
    private EpiEntity epi;

}
