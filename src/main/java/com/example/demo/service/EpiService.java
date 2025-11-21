package com.example.demo.service;


import com.example.demo.dto.EpiDto;
import com.example.demo.entity.EpiEntity;
import com.example.demo.repo.EpiRepo;
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
public class EpiService {


    @Autowired
    private EpiRepo epiRepo;

    //CREATE

    public void cadastrarEpi(@Valid EpiDto dto) {
        if(epiRepo.existsByNome(dto.getNome())) {
            throw new RuntimeException("Epi já cadastrado!");
        }

        EpiEntity epi = new EpiEntity();

        epi.setNome(dto.getNome());
        epi.setDevolvido(dto.getDevolvido());
        epi.setDataDevolucao(dto.getDataDevolucao());
        epi.setDataEmprestimo(dto.getDataEmprestimo());
        epiRepo.save(epi);


    }
    //READ
    public List<EpiDto.EpiResponseDto> listarEpis() {
        List<EpiEntity> lista = epiRepo.findAll();
        List<EpiDto.EpiResponseDto> resposta = new ArrayList<>();

        for (EpiEntity e : lista) {
            EpiDto.EpiResponseDto dto = new EpiDto.EpiResponseDto();
            dto.setIdEpi(e.getIdEpi());
            dto.setNome(e.getNome());
            dto.setQtdDisponivel(e.getQtdDisponivel());
            dto.setQtdTotal(e.getQtdTotal());
            resposta.add(dto);
        }
        return resposta;
    }
    //UPTADE
    public void atualizarEpi(long id, @Valid EpiDto dto) {
        EpiEntity epi = epiRepo.findById(id).orElseThrow(() -> new RuntimeException("Epi não encontrado"));

        if (epiRepo.existsByNomeAndIdEpiNot(dto.getNome(), id)){
            throw new RuntimeException("Nome do Epi já cadastrado");
        }

        epi.setNome(dto.getNome());
        epi.setQtdDisponivel(dto.getQtdDisponivel());
        epi.setQtdTotal(dto.getQtdTotal());

        epiRepo.save(epi);
    }
    //DELETE
    public void deletarEpi(long id) {
        if(!epiRepo.existsById(id)) {
            throw new RuntimeException("Epi não existe!");
        }

        epiRepo.deleteById(id);
    }


}
