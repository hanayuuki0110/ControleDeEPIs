package com.example.demo.repo;

import com.example.demo.entity.EmprestimoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepo extends JpaRepository<EmprestimoEntity,Long> {

    boolean existsEmprestimoEntitiesByDevolvido(boolean devolvido);


    boolean existsByIdEmprestimo(long idEmprestimo);
}
