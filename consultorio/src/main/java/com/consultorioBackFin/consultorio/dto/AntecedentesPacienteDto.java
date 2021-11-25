package com.consultorioBackFin.consultorio.dto;

import com.consultorioBackFin.consultorio.entity.Paciente;

public class AntecedentesPacienteDto {
    private Long id;
    private String psicologicos;
    private String medicos;
    private String psiquiatricos;
    private String consumo;
    private Paciente paciente;

    public AntecedentesPacienteDto() {
    }

    public AntecedentesPacienteDto(String psicologicos, String medicos, String psiquiatricos, String consumo, Paciente paciente) {
        this.psicologicos = psicologicos;
        this.medicos = medicos;
        this.psiquiatricos = psiquiatricos;
        this.consumo = consumo;
        this.paciente = paciente;
    }

    public String getPsicologicos() {
        return psicologicos;
    }

    public void setPsicologicos(String psicologicos) {
        this.psicologicos = psicologicos;
    }

    public String getMedicos() {
        return medicos;
    }

    public void setMedicos(String medicos) {
        this.medicos = medicos;
    }

    public String getPsiquiatricos() {
        return psiquiatricos;
    }

    public void setPsiquiatricos(String psiquiatricos) {
        this.psiquiatricos = psiquiatricos;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
