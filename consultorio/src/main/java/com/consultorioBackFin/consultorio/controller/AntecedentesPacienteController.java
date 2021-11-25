package com.consultorioBackFin.consultorio.controller;

import com.consultorioBackFin.consultorio.entity.AntecedentesPaciente;
import com.consultorioBackFin.consultorio.entity.Paciente;
import com.consultorioBackFin.consultorio.security.jwt.JwtEntryPoint;
import com.consultorioBackFin.consultorio.service.AntecedentesPacienteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/antecedentesPaciente")
@CrossOrigin(origins = "http://localhost:4200")
public class AntecedentesPacienteController {
    private final static Logger logger = LoggerFactory.getLogger(JwtEntryPoint.class);

    @Autowired
    AntecedentesPacienteService antecedentesPacienteService;

    @GetMapping("/lista")
    public ResponseEntity<List<AntecedentesPaciente>> list(){
        List<AntecedentesPaciente> list = antecedentesPacienteService.list();
        return new ResponseEntity<List<AntecedentesPaciente>>(list, HttpStatus.OK);
    }

}
