package com.consultorioBackFin.consultorio.service;

import com.consultorioBackFin.consultorio.entity.AntecedentesPaciente;
import com.consultorioBackFin.consultorio.entity.Historia;
import com.consultorioBackFin.consultorio.entity.Paciente;
import com.consultorioBackFin.consultorio.repository.AntecedentesPacienteRepository;
import com.consultorioBackFin.consultorio.repository.HistoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class HistoriaService {
        @Autowired
        HistoriaRepository historiaRepository;
        public List<Historia> list () {
            return historiaRepository.findAll();
        }
        public Optional<Historia> getOne(int id){
        return historiaRepository.findById(id);
    }
        public void save (Historia historia) {
            historiaRepository.save(historia);
        }

}
