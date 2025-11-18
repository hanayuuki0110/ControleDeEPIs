package com.example.demo.repo;

import com.example.demo.entity.FuncionarioEntity;
import org.springframework.data.repository.CrudRepository;

public interface FuncionarioRepo extends CrudRepository<FuncionarioEntity,Integer> {

    boolean existsById(int id);
    boolean existsByIdAndNome(String nome, int id);
    boolean existsByEmail(String email);

}






