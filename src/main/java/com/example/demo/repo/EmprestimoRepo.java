package com.example.demo.repo;

import com.example.demo.entity.EmprestimoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepo extends JpaRepository<EmprestimoEntity,Long> {

    boolean existsByNome(String nome);
    boolean existsByIdEpi(long id);


}
