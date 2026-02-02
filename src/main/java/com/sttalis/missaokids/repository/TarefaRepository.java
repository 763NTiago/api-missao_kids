package com.sttalis.missaokids.repository;

import com.sttalis.missaokids.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    List<Tarefa> findByFamiliaId(String familiaId);
}