package com.example.demo.repo;

import com.example.demo.entity.EpiEntity;

import java.util.List;

public interface EpiRepo {

    boolean existsByIdEpiAndDisponivel(Long idEpi, int qtdDisponivel);

    List<EpiEntity> findAllByDisponivelTrue();
    List<EpiEntity> findAllByDisponivelFalse();





}
