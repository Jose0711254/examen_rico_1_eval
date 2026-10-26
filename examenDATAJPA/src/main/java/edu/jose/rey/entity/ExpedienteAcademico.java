package edu.jose.rey.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "expedientes_academicos")

public class ExpedienteAcademico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_expediente")
    private Long id;

    @Column(name = "numeroExpediente", nullable = false, unique = true)
    private String numeroExpediente;

    @Column(name = "fechaApertura", nullable = false)
    private LocalDate fechaApertura;

    @Column(name = "notaMediaAcceso", nullable = false)
    private Integer notaMediaAcceso;

    public ExpedienteAcademico() {
    }

    public ExpedienteAcademico(String numeroExpediente, LocalDate fechaApertura, Integer notaMediaAcceso) {
        this.numeroExpediente = numeroExpediente;
        this.fechaApertura = fechaApertura;
        this.notaMediaAcceso = notaMediaAcceso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(String numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Integer getNotaMediaAcceso() {
        return notaMediaAcceso;
    }

    public void setNotaMediaAcceso(Integer notaMediaAcceso) {
        this.notaMediaAcceso = notaMediaAcceso;
    }

}
