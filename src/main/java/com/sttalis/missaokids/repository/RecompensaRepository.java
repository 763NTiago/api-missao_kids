package com.sttalis.missaokids.repository;

import com.sttalis.missaokids.entity.Recompensa;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RecompensaRepository extends JpaRepository<Recompensa, Long> {
    List<Recompensa> findByFamiliaId(String familiaId);
}