package com.consultorioBackFin.consultorio.entity;

import javax.persistence.*;

@Entity
public class AntecedentesPaciente {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "psicologicos")
    private String psicologicos;

    @Column(name = "medicos")
    private String medicos;

    @Column(name = "psquiatricos")
    private String psiquiatricos;

    @Column(name = "consumo")
    private String consumo;


    public AntecedentesPaciente() {
    }

    public AntecedentesPaciente(String psicologicos, String medicos, String psiquiatricos, String consumo, Paciente paciente) {
        this.psicologicos = psicologicos;
        this.medicos = medicos;
        this.psiquiatricos = psiquiatricos;
        this.consumo = consumo;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
