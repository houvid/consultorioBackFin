package com.consultorioBackFin.consultorio.repository;

import com.consultorioBackFin.consultorio.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
    Optional<Paciente> findByNombre (String nombre);

    boolean existsByNombre( String nombre);

    Optional<Paciente> findByCedula(String cedula);

    boolean existsByCedula( String cedula);

    List<Paciente> findAllByUsuarioRegistra(String usuarioRegistra);
}
