package com.example.demo.service;

import com.example.demo.dto.funcionario.FuncionarioResponse;
import com.example.demo.entity.FuncionarioEntity;
import com.example.demo.repo.FuncionarioRepo;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Service
@Validated
@RequiredArgsConstructor
public class FuncionarioService {

    @Autowired
    private FuncionarioRepo funcionarioRepo;

    public void cadastrarFuncionario(long id, @Valid FuncionarioResponse cadastrarFuncionarioDto){
        if(funcionarioRepo.existsByEmail(cadastrarFuncionarioDto.getEmail())) {
            throw new RuntimeException("email de funcionario ja cadastrado");
        }
        FuncionarioEntity funcionario=new FuncionarioEntity();

        funcionario.setIdFuncionario(funcionario.getIdFuncionario());
        funcionario.setEmail(funcionario.getEmail());
        funcionario.setNomeFuncionario(funcionario.getNomeFuncionario());



}
public List<FuncionarioResponse> listarFuncionarios(){
        List<FuncionarioEntity> lista=funcionarioRepo.findAll();
        List<FuncionarioResponse> Resposta=new ArrayList<>();

        for(FuncionarioEntity e:lista) {

            FuncionarioResponse dto=new FuncionarioResponse();

            dto.setIdFuncionario(e.getIdFuncionario());
            dto.setEmail(e.getEmail());
            dto.setNomeFuncionario(e.getNomeFuncionario());

            Resposta.add(dto);

        }
        return Resposta;
}
public void atualizarFuncionario(Integer id, @Valid FuncionarioResponse atualizarFuncionarioDto){
        FuncionarioEntity funcionario=funcionarioRepo.findById(id).orElseThrow(()->new RuntimeException("Funcionario nao encontrado"));

        if(funcionarioRepo.existsByIdAndNome(atualizarFuncionarioDto.getNomeFuncionario(), id)){
            throw new RuntimeException("Funcionario ja cadastrado");

        }
        funcionario.setEmail(atualizarFuncionarioDto.getEmail());
        funcionario.setIdFuncionario(atualizarFuncionarioDto.getIdFuncionario());
        funcionario.setNomeFuncionario(atualizarFuncionarioDto.getNomeFuncionario());

        funcionarioRepo.save(funcionario);
}
public void deletarFuncionario(Integer id){
        if(!funcionarioRepo.existsById(id)) {
            throw new RuntimeException("Funcionario nao existe");

        }
        funcionarioRepo.deleteById(id);
}
}
