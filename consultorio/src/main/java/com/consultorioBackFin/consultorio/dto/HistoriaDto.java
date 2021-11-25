package com.consultorioBackFin.consultorio.dto;

import java.util.Date;

public class HistoriaDto {
    private String antecedenteMedicoPac;
    private String antecedenteConsumoPac;
    private String antecedentePsicologico;
    private String antecedentePsiquiatrico;
    private String antecedenteMedicoFam;
    private String antecedenteConsumoFam;
    private String antecedentePsicologicoFam;
    private String antecedentePsiquiatricoFam;
    private String motivoDeConsulta;
    private String diagnostico;
    private Date fechaRegistro;

    public HistoriaDto() {
    }

    public HistoriaDto(String antecedenteMedicoPac, String antecedenteConsumoPac, String antecedentePsicologico, String antecedentePsiquiatrico, String antecedenteMedicoFam, String antecedenteConsumoFam, String antecedentePsicologicoFam, String antecedentePsiquiatricoFam, String motivoDeConsulta, String diagnostico, Date fechaRegistro) {
        this.antecedenteMedicoPac = antecedenteMedicoPac;
        this.antecedenteConsumoPac = antecedenteConsumoPac;
        this.antecedentePsicologico = antecedentePsicologico;
        this.antecedentePsiquiatrico = antecedentePsiquiatrico;
        this.antecedenteMedicoFam = antecedenteMedicoFam;
        this.antecedenteConsumoFam = antecedenteConsumoFam;
        this.antecedentePsicologicoFam = antecedentePsicologicoFam;
        this.antecedentePsiquiatricoFam = antecedentePsiquiatricoFam;
        this.motivoDeConsulta = motivoDeConsulta;
        this.diagnostico = diagnostico;
        this.fechaRegistro = fechaRegistro;
    }

    public String getAntecedenteMedicoPac() {
        return antecedenteMedicoPac;
    }

    public void setAntecedenteMedicoPac(String antecedenteMedicoPac) {
        this.antecedenteMedicoPac = antecedenteMedicoPac;
    }

    public String getAntecedenteConsumoPac() {
        return antecedenteConsumoPac;
    }

    public void setAntecedenteConsumoPac(String antecedenteConsumoPac) {
        this.antecedenteConsumoPac = antecedenteConsumoPac;
    }

    public String getAntecedentePsicologico() {
        return antecedentePsicologico;
    }

    public void setAntecedentePsicologico(String antecedentePsicologico) {
        this.antecedentePsicologico = antecedentePsicologico;
    }

    public String getAntecedentePsiquiatrico() {
        return antecedentePsiquiatrico;
    }

    public void setAntecedentePsiquiatrico(String antecedentePsiquiatrico) {
        this.antecedentePsiquiatrico = antecedentePsiquiatrico;
    }

    public String getAntecedenteMedicoFam() {
        return antecedenteMedicoFam;
    }

    public void setAntecedenteMedicoFam(String antecedenteMedicoFam) {
        this.antecedenteMedicoFam = antecedenteMedicoFam;
    }

    public String getAntecedenteConsumoFam() {
        return antecedenteConsumoFam;
    }

    public void setAntecedenteConsumoFam(String antecedenteConsumoFam) {
        this.antecedenteConsumoFam = antecedenteConsumoFam;
    }

    public String getAntecedentePsicologicoFam() {
        return antecedentePsicologicoFam;
    }

    public void setAntecedentePsicologicoFam(String antecedentePsicologicoFam) {
        this.antecedentePsicologicoFam = antecedentePsicologicoFam;
    }

    public String getAntecedentePsiquiatricoFam() {
        return antecedentePsiquiatricoFam;
    }

    public void setAntecedentePsiquiatricoFam(String antecedentePsiquiatricoFam) {
        this.antecedentePsiquiatricoFam = antecedentePsiquiatricoFam;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getMotivoDeConsulta() {
        return motivoDeConsulta;
    }

    public void setMotivoDeConsulta(String motivoDeConsulta) {
        this.motivoDeConsulta = motivoDeConsulta;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
