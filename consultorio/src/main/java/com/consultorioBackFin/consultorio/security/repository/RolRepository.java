package com.consultorioBackFin.consultorio.security.repository;

import com.consultorioBackFin.consultorio.security.entity.Rol;
import com.consultorioBackFin.consultorio.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}