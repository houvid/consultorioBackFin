package com.consultorioBackFin.consultorio.dto;

import com.sun.istack.NotNull;

import java.util.Date;

public class PacienteDto {
    @NotNull
    private String cedula;
    @NotNull
    private String nombre;
    @NotNull
    private String apellido;
    private String sexo;
    private String nivelEscolaridad;
    private String ocupacion;
    private String institucion;
    private Date fechaNacimiento;
    private String lugarNacimiento;
    private String direccion;
    private String municipio;
    private String telefono;
    private String celular;
    private String email;
    private String estadoCivil;
    private String estrato;
    private int tarifa;
    private String nombreAcudiente;
    private String edadAcudiente;
    private String telefonoAcudiente;
    private String celularAcudiente;
    private String direccionAcudiente;

    public PacienteDto() {
    }

    public PacienteDto(String cedula, String nombre, String apellido, String sexo, String nivelEscolaridad, String ocupacion, String institucion, Date fechaNacimiento, String lugarNacimiento, String direccion, String municipio, String telefono, String celular, String email, String estadoCivil, String estrato, int tarifa, String nombreAcudiente, String edadAcudiente, String telefonoAcudiente, String celularAcudiente, String direccionAcudiente) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.nivelEscolaridad = nivelEscolaridad;
        this.ocupacion = ocupacion;
        this.institucion = institucion;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
        this.direccion = direccion;
        this.municipio = municipio;
        this.telefono = telefono;
        this.celular = celular;
        this.email = email;
        this.estadoCivil = estadoCivil;
        this.estrato = estrato;
        this.tarifa = tarifa;
        this.nombreAcudiente = nombreAcudiente;
        this.edadAcudiente = edadAcudiente;
        this.telefonoAcudiente = telefonoAcudiente;
        this.celularAcudiente = celularAcudiente;
        this.direccionAcudiente = direccionAcudiente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNivelEscolaridad() {
        return nivelEscolaridad;
    }

    public void setNivelEscolaridad(String nivelEscolaridad) {
        this.nivelEscolaridad = nivelEscolaridad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public String getNombreAcudiente() {
        return nombreAcudiente;
    }

    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }

    public String getEdadAcudiente() {
        return edadAcudiente;
    }

    public void setEdadAcudiente(String edadAcudiente) {
        this.edadAcudiente = edadAcudiente;
    }

    public String getTelefonoAcudiente() {
        return telefonoAcudiente;
    }

    public void setTelefonoAcudiente(String telefonoAcudiente) {
        this.telefonoAcudiente = telefonoAcudiente;
    }

    public String getCelularAcudiente() {
        return celularAcudiente;
    }

    public void setCelularAcudiente(String celularAcudiente) {
        this.celularAcudiente = celularAcudiente;
    }

    public String getDireccionAcudiente() {
        return direccionAcudiente;
    }

    public void setDireccionAcudiente(String direccionAcudiente) {
        this.direccionAcudiente = direccionAcudiente;
    }
}
