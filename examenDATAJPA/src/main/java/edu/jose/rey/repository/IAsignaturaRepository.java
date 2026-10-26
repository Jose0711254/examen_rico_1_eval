package edu.jose.rey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jose.rey.entity.Asignatura;

public interface IAsignaturaRepository extends JpaRepository<Asignatura, Long> {

    Long countByCreditos(Integer creditos);

}
