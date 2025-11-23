package com.example.demo.repo;

import com.example.demo.entity.FuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepo extends JpaRepository<FuncionarioEntity, Integer> {

    boolean existsById(long id);
    boolean existsByIdAndNome(String nome, int id);
    boolean existsByEmail(String email);

}






