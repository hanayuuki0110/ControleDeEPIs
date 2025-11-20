package com.example.demo.repo;

import com.example.demo.entity.EpiEntity;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.Optional;

public interface EpiRepo {

    boolean existsByIdEpiAndDisponivel(Long idEpi, int qtdDisponivel);

    List<EpiEntity> findAllByDisponivelTrue();
    List<EpiEntity> findAllByDisponivelFalse();
    Optional<Entity> findById(Integer id);
    Optional<Entity> deleteById(int id);
}
