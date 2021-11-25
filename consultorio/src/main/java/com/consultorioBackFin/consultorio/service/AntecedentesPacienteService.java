package com.consultorioBackFin.consultorio.service;

import com.consultorioBackFin.consultorio.entity.AntecedentesPaciente;
import com.consultorioBackFin.consultorio.entity.Paciente;
import com.consultorioBackFin.consultorio.repository.AntecedentesPacienteRepository;
import com.consultorioBackFin.consultorio.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AntecedentesPacienteService {
    @Autowired
    AntecedentesPacienteRepository antecedentesPacienteRepository;
    public List<AntecedentesPaciente> list () {
        return antecedentesPacienteRepository.findAll();
    }
    public void save (AntecedentesPaciente antecedentesPaciente) {
        antecedentesPacienteRepository.save(antecedentesPaciente);
    }
}
