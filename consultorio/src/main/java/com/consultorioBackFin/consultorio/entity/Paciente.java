package com.consultorioBackFin.consultorio.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "cedula")
    private String cedula;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "nivelEscolaridad")
    private String nivelEscolaridad;

    @Column(name = "ocupacion")
    private String ocupacion;

    @Column(name = "institucion")
    private String institucion;

    @Column(name = "fechaNacimiento")
    private Date fechaNacimiento;

    @Column(name = "lugarNacimiento")
    private String lugarNacimiento;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "municipio")
    private String municipio;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "celular")
    private String celular;

    @Column(name = "email")
    private String email;

    @Column(name = "estadoCivil")
    private String estadoCivil;

    @Column(name = "estrato")
    private String estrato;

    @Column(name = "tarifa")
    private int tarifa;

    @Column(name = "nombreAcudiente")
    private String nombreAcudiente;

    @Column(name = "edadAcudiente")
    private String edadAcudiente;

    @Column(name = "telefonoAcudiente")
    private String telefonoAcudiente;

    @Column(name = "celularAcudiente")
    private String celularAcudiente;

    @Column(name = "direccionAcudiente")
    private String direccionAcudiente;

    @JoinColumn(name = "fk_paciente", referencedColumnName = "id")
    @OneToMany(cascade = CascadeType.ALL)
    private List<AntecedentesPaciente> antecedentes = new ArrayList<>();

    @JoinColumn(name = "fk_paciente", referencedColumnName = "id")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Historia> historia = new ArrayList<>();

    @Column(name = "usuarioRegistra")
    private String usuarioRegistra;

    public Paciente(){
        
    }

    public Paciente(String cedula, String nombre, String apellido, String sexo, String nivelEscolaridad, String ocupacion, String institucion, Date fechaNacimiento, String lugarNacimiento, String direccion, String municipio, String telefono, String celular, String email, String estadoCivil, String estrato, int tarifa, String nombreAcudiente, String edadAcudiente, String telefonoAcudiente, String celularAcudiente, String direccionAcudiente, String usuarioRegistra) {
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
        this.usuarioRegistra = usuarioRegistra;
    }

    public String getUsuarioRegistra() {
        return usuarioRegistra;
    }

    public void setUsuarioRegistra(String usuarioRegistra) {
        this.usuarioRegistra = usuarioRegistra;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        institucion = institucion;
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

    public List<AntecedentesPaciente> getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(List<AntecedentesPaciente> antecedentes) {
        this.antecedentes = antecedentes;
    }

    public List<Historia> getHistoria() {
        return historia;
    }

    public void setHistoria(List<Historia> historia) {
        this.historia = historia;
    }
}
