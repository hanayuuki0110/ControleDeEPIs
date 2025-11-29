package com.example.demo.repo;

import com.example.demo.entity.FuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepo extends JpaRepository<FuncionarioEntity, Long> {

    boolean existsById(Long id);
    boolean existsByEmail(String email);

}






