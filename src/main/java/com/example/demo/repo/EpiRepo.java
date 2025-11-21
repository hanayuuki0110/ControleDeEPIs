package com.example.demo.repo;

import com.example.demo.entity.EpiEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpiRepo extends JpaRepository<EpiEntity, Long> {

    boolean existsByNome(String nome);

    boolean existsByNomeAndIdEpiNot(String nome,long idEpi);




}
