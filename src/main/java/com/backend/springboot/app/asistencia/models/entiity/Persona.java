package com.backend.springboot.app.asistencia.models.entiity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tca_persona")
public class Persona {

    @Id
    @Column(name = "id_persona")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;

    @Column(name = "no_persona")
    private String nombres;

    @Column(name = "ap_persona")
    private String apellidos;

    @Column(name = "fe_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "de_celular")
    private Integer numCelular;

    @Column(name = "de_sexo")
    private Character sexo;

    @Column(name = "co_dni")
    private Integer dni;

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(Integer numCelular) {
        this.numCelular = numCelular;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }
}
