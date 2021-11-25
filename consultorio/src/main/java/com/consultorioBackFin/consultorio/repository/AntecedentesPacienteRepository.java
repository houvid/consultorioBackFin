package com.consultorioBackFin.consultorio.repository;

import com.consultorioBackFin.consultorio.entity.AntecedentesPaciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AntecedentesPacienteRepository extends JpaRepository<AntecedentesPaciente, Integer> {


}
