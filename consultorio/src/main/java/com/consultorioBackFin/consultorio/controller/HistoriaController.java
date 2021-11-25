package com.consultorioBackFin.consultorio.controller;

import com.consultorioBackFin.consultorio.entity.AntecedentesPaciente;
import com.consultorioBackFin.consultorio.entity.Historia;
import com.consultorioBackFin.consultorio.security.jwt.JwtEntryPoint;
import com.consultorioBackFin.consultorio.service.AntecedentesPacienteService;
import com.consultorioBackFin.consultorio.service.HistoriaService;
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
@RequestMapping("/historia")
@CrossOrigin(origins = "http://localhost:4200")
public class HistoriaController {

    private final static Logger logger = LoggerFactory.getLogger(JwtEntryPoint.class);

    @Autowired
    HistoriaService historiaService;

    @GetMapping("/lista")
    public ResponseEntity<List<Historia>> list(){
        List<Historia> list = historiaService.list();
        return new ResponseEntity<List<Historia>>(list, HttpStatus.OK);
    }

}
