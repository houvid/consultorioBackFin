package com.consultorioBackFin.consultorio.controller;

import com.consultorioBackFin.consultorio.dto.Mensaje;
import com.consultorioBackFin.consultorio.dto.PacienteDto;
import com.consultorioBackFin.consultorio.entity.Paciente;
import com.consultorioBackFin.consultorio.security.jwt.JwtEntryPoint;
import com.consultorioBackFin.consultorio.service.PacienteService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")
@CrossOrigin(origins = "http://localhost:4200")
public class PacienteController {
    private final static Logger logger = LoggerFactory.getLogger(JwtEntryPoint.class);
    @Autowired
    PacienteService pacienteService;
    @GetMapping("/lista")
    public ResponseEntity<List<Paciente>> list(){
        List<Paciente> list = pacienteService.list();
        return new ResponseEntity<List<Paciente>>(list, HttpStatus.OK);
    }

    @GetMapping ("/detalle/{id}")
    public ResponseEntity<Paciente> getById(@PathVariable("id") int id){
        if (!pacienteService.existById(id))
            return new ResponseEntity( new Mensaje("No Existe"), HttpStatus.NOT_FOUND);
        Paciente paciente = pacienteService.getOne(id).get();
        return new ResponseEntity(paciente, HttpStatus.OK);
    }

    @GetMapping ("/detalle/cedula/{cedula}")
    public ResponseEntity<Paciente> getByCedula(@PathVariable("cedula") String cedula){
        if (!pacienteService.existByCedula(cedula))
            return new ResponseEntity( new Mensaje("No Existe"), HttpStatus.NOT_FOUND);
        Paciente paciente = pacienteService.getByCedula(cedula).get();
        return new ResponseEntity(paciente, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<?> create (@RequestBody PacienteDto pacienteDto){
        if ( StringUtils.isBlank(pacienteDto.getCedula()) )
            return new ResponseEntity<>(new Mensaje("La cedula es obligatoria "), HttpStatus.BAD_REQUEST);

        if ( StringUtils.isBlank(pacienteDto.getNombre()) )
            return new ResponseEntity<>(new Mensaje("El nombre es obligatorio "), HttpStatus.BAD_REQUEST);

        if( StringUtils.isBlank(pacienteDto.getApellido()))
            return new ResponseEntity<>(new Mensaje("El Apellido es obligatorio "), HttpStatus.BAD_REQUEST);

        if (pacienteService.existByCedula(pacienteDto.getCedula()))
            return new ResponseEntity<>(new Mensaje("El paciente ya existe  "), HttpStatus.BAD_REQUEST);
        logger.info(String.valueOf(pacienteDto));
        Paciente paciente = new Paciente (
                pacienteDto.getCedula(),
                pacienteDto.getNombre(),
                pacienteDto.getApellido(),
                pacienteDto.getSexo(),
                pacienteDto.getNivelEscolaridad(),
                pacienteDto.getOcupacion(),
                pacienteDto.getInstitucion(),
                pacienteDto.getFechaNacimiento(),
                pacienteDto.getLugarNacimiento(),
                pacienteDto.getDireccion(),
                pacienteDto.getMunicipio(),
                pacienteDto.getTelefono(),
                pacienteDto.getCelular(),
                pacienteDto.getEmail(),
                pacienteDto.getEstadoCivil(),
                pacienteDto.getEstrato(),
                pacienteDto.getTarifa(),
                pacienteDto.getNombreAcudiente(),
                pacienteDto.getEdadAcudiente(),
                pacienteDto.getTelefonoAcudiente(),
                pacienteDto.getCelularAcudiente(),
                pacienteDto.getDireccionAcudiente());
        pacienteService.save(paciente);
        return new ResponseEntity<>(new Mensaje("Paciente creado exitosamente"), HttpStatus.OK);
    }

    @PutMapping ("/update/{id}")
    public ResponseEntity<?> update (@PathVariable("id") int id ,@RequestBody PacienteDto pacienteDto){
        if (!pacienteService.existById(id))
            return new ResponseEntity( new Mensaje("No Existe"), HttpStatus.NOT_FOUND);
        if (pacienteService.existByCedula(pacienteDto.getCedula()) && pacienteService.getByCedula(pacienteDto.getCedula()).get().getId() != id)
            return new ResponseEntity<>(new Mensaje("El paciente con esta cedula ya existe  "), HttpStatus.BAD_REQUEST);
        if ( StringUtils.isBlank(pacienteDto.getNombre()) )
            return new ResponseEntity<>(new Mensaje("El nombre es obligatorio "), HttpStatus.BAD_REQUEST);
        if( StringUtils.isBlank(pacienteDto.getApellido()))
            return new ResponseEntity<>(new Mensaje("El Apellido es obligatorio "), HttpStatus.BAD_REQUEST);
        if (pacienteService.existByCedula(pacienteDto.getCedula()))
            return new ResponseEntity<>(new Mensaje("El paciente ya existe  "), HttpStatus.BAD_REQUEST);
        Paciente paciente = pacienteService.getOne(id).get();
        paciente.setCedula(pacienteDto.getCedula());
        paciente.setNombre(pacienteDto.getNombre());
        paciente.setApellido(pacienteDto.getApellido());

        pacienteService.save(paciente);
        return new ResponseEntity<>(new Mensaje("Paciente Actualizado exitosamente"), HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete (@PathVariable("id") int id){
        if (!pacienteService.existById(id))
            return new ResponseEntity( new Mensaje("No Existe"), HttpStatus.NOT_FOUND);
        pacienteService.delete(id);
        return new ResponseEntity<>(new Mensaje("Paciente eliminado exitosamente"), HttpStatus.OK);
    }


}
