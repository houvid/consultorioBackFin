package com.consultorioBackFin.consultorio.service;

import com.consultorioBackFin.consultorio.entity.Paciente;
import com.consultorioBackFin.consultorio.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PacienteService {
    
    @Autowired
    PacienteRepository pacienteRepository;

    public List<Paciente> list () {
             return pacienteRepository.findAll();
    }

    public Optional<Paciente> getOne(int id){
        return pacienteRepository.findById(id);
    }

    public Optional<Paciente> getByNombre (String nombre){
        return pacienteRepository.findByNombre(nombre);
    }

    public Optional<Paciente> getByCedula (String cedula){
        return pacienteRepository.findByCedula(cedula);
    }

    public void save (Paciente paciente) {
        pacienteRepository.save(paciente);
    }

    public void delete(int id){
        pacienteRepository.deleteById(id);

    }
    public boolean existById (int id){
        return pacienteRepository.existsById(id);
    }
    public boolean existByNombre (String nombre){
        return pacienteRepository.existsByNombre(nombre);
    }

    public boolean existByCedula (String cedula){
        return pacienteRepository.existsByCedula(cedula);
    }

}
