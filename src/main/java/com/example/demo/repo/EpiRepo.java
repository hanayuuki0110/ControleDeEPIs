package com.example.demo.repo;

import com.example.demo.entity.EpiEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpiRepo extends JpaRepository<EpiEntity, Long> {

    boolean existsByNomeEpi(String nomeEpi);

    boolean existsByIdEpi(Long idEpi);




}
