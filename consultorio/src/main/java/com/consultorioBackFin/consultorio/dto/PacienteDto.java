package com.consultorioBackFin.consultorio.dto;

import com.sun.istack.NotNull;

public class PacienteDto {
    @NotNull
    private String cedula;
    @NotNull
    private String nombre;
    @NotNull
    private String apellido;

    public PacienteDto() {
    }

    public PacienteDto(String cedula,String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
