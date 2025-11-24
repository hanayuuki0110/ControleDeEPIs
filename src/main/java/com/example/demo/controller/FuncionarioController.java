package com.example.demo.controller;


import com.example.demo.dto.funcionario.FuncionarioRequest;
import com.example.demo.dto.funcionario.FuncionarioResponse;
import com.example.demo.service.FuncionarioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class FuncionarioController {

    private final FuncionarioService servicoFuncionario;

    public FuncionarioController(FuncionarioService servicoFuncionario) {
        this.servicoFuncionario = servicoFuncionario;

    }
    @PostMapping

    public ResponseEntity<Void> cadastrarEpi(@Valid @RequestBody FuncionarioRequest funcionarioRequest){

        servicoFuncionario.cadastrarFuncionario(funcionarioRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }
    @GetMapping

    public ResponseEntity<List<FuncionarioResponse>> listarEpi(){
        return ResponseEntity.status(HttpStatus.OK).body(servicoFuncionario.listarFuncionarios());
    }
}
