package com.consultorioBackFin.consultorio.repository;

import com.consultorioBackFin.consultorio.entity.Historia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoriaRepository extends JpaRepository<Historia, Integer> {
}
