package edu.jose.rey.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.jose.rey.entity.Matricula;

public interface IMatriculaRepository extends JpaRepository<Matricula, Integer> {

    List<Matricula> findByCalificacionGreaterThanEqual(boolean calificacion);

    @Query(value = "SELECT m.* FROM matricula m INNER JOIN estudiante e ON m.estudiante_id = e.id WHERE e.nombre = ?1", nativeQuery = true)
    List<Matricula> findByEstudianteNombre(String nombre);

}
