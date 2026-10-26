package edu.jose.rey.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jose.rey.entity.Estudiante;

public interface IEstudianteRepository extends JpaRepository<Estudiante, Long> {

    Optional<Estudiante> findByDni(String dni);

}
