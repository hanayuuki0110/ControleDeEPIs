package com.example.demo.service;

import com.example.demo.dto.emprestimo.EmprestimoResponse;
import com.example.demo.entity.EmprestimoEntity;
import com.example.demo.repo.EmprestimoRepo;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
@RequiredArgsConstructor
public class EmprestimoService {

    @Autowired
    private EmprestimoRepo emprestimoRepo;

    public void cadastrarEmprestimo(@Valid EmprestimoResponse cadastrarEmprestimoDto){
        if(emprestimoRepo.existsByIdEpi(cadastrarEmprestimoDto.getIdEpi())){
            throw new RuntimeException("epi ja emprestada");


        }
        EmprestimoEntity emprestimo = new EmprestimoEntity();

        emprestimo.setEpi(cadastrarEmprestimoDto.getEpi());
        emprestimo.setIdEmprestimo(cadastrarEmprestimoDto.getIdEmprestimo());
        emprestimo.setFuncionario(cadastrarEmprestimoDto.getFuncionario());
        emprestimo.setDataEmprestimo(cadastrarEmprestimoDto.);
    }
}
