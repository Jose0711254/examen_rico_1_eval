package edu.jose.rey.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "matriculas")

public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asignatura")
    private Long id;

    @Column(name = "fechaMatriculacion", nullable = false)
    private LocalDate fechaMatriculacion;

    @Column(name = "calificacion", nullable = true)
    private Integer calificacion;

    @Column(name = "codigos", nullable = false, unique = true)
    private String codigos;

    public Matricula() {
    }

    public Matricula(LocalDate fechaMatriculacion, Integer calificacion, String codigos) {
        this.fechaMatriculacion = fechaMatriculacion;
        this.calificacion = calificacion;
        this.codigos = codigos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public String getCodigos() {
        return codigos;
    }

    public void setCodigos(String codigos) {
        this.codigos = codigos;
    }

    public String getFecha() {
        throw new UnsupportedOperationException("No se emplea la fecha");
    }

}
