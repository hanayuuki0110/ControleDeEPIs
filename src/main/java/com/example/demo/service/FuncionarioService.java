package com.example.demo.service;

import com.example.demo.dto.funcionario.FuncionarioRequest;
import com.example.demo.dto.funcionario.FuncionarioResponse;
import com.example.demo.entity.FuncionarioEntity;
import com.example.demo.repo.FuncionarioRepo;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Service
@Validated
@RequiredArgsConstructor
public class FuncionarioService {


    private final FuncionarioRepo funcionarioRepo;

    public void cadastrarFuncionario(@Valid FuncionarioRequest cadastrarFuncionarioDto){
        if(funcionarioRepo.existsByEmail(cadastrarFuncionarioDto.getEmail())) {
            throw new RuntimeException("email de funcionario ja cadastrado");
        }
        FuncionarioEntity funcionario=new FuncionarioEntity();

        funcionario.setEmail(cadastrarFuncionarioDto.getEmail());
        funcionario.setNomeFuncionario(cadastrarFuncionarioDto.getNomeFuncionario());

        funcionarioRepo.save(funcionario);



}
public List<FuncionarioResponse> listarFuncionarios(){
        List<FuncionarioEntity> lista=funcionarioRepo.findAll();
        List<FuncionarioResponse> Resposta=new ArrayList<>();

        for(FuncionarioEntity e:lista) {

            FuncionarioResponse dto=new FuncionarioResponse();

            dto.setIdFuncionario(e.getId());
            dto.setEmail(e.getEmail());
            dto.setNomeFuncionario(e.getNomeFuncionario());

            Resposta.add(dto);

        }
        return Resposta;
}
public void atualizarFuncionario(Long id, @Valid FuncionarioRequest atualizarFuncionarioDto){
        FuncionarioEntity funcionario=funcionarioRepo.findById(id).orElseThrow(()->new RuntimeException("Funcionario nao encontrado"));

        funcionario.setEmail(atualizarFuncionarioDto.getEmail());
        funcionario.setNomeFuncionario(atualizarFuncionarioDto.getNomeFuncionario());

        funcionarioRepo.save(funcionario);
}
public void deletarFuncionario(Long id) {
    if (!funcionarioRepo.existsById(id)) {
        throw new RuntimeException("Funcionario nao existe");

    }
    funcionarioRepo.deleteById(id);

}


}




