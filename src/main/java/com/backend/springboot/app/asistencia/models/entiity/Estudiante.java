package com.backend.springboot.app.asistencia.models.entiity;



import javax.persistence.*;

@Entity
@Table(name = "tma_estudiante")
public class Estudiante {

    @Id
    @Column(name = "id_estudiante")
    private Long idEstudiante;

    @Column(name = "no_codigo")
    private String codigo;

    @OneToOne
    @JoinColumn(name = "id_persona")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "id_facultad")
    // @JsonBackReference
    private Facultad facultad;

    public Long getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }
}
