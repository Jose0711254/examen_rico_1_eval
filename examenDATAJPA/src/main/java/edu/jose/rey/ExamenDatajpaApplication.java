package edu.jose.rey;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.jose.rey.entity.Estudiante;
import edu.jose.rey.entity.Matricula;
import edu.jose.rey.repository.IAsignaturaRepository;
import edu.jose.rey.repository.IEstudianteRepository;
import edu.jose.rey.repository.IMatriculaRepository;

@SpringBootApplication
public class ExamenDatajpaApplication {

	@Autowired
	IAsignaturaRepository asignaturaRepository;
	@Autowired
	IEstudianteRepository estudianteRepository;
	@Autowired
	IMatriculaRepository matriculaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ExamenDatajpaApplication.class, args);
	}

	public void run(String... args) throws Exception {

		Optional<Estudiante> estudiante1 = estudianteRepository.findByDni("12345678A");
		if (estudiante1.isPresent()) {
			System.out.println("Estudiante encontrado: " + estudiante1.get().getNombre());
		} else {
			System.out.println("Estudiante no encontrado");
		}

		List<Matricula> matriculasAprobadas = matriculaRepository.findByCalificacionGreaterThanEqual(true);
		for (Matricula matricula : matriculasAprobadas) {
			System.out.println("Fecha: " + matricula.getFecha() + ", Nota: " + matricula.getCalificacion()
					+ ", Alumno: " + estudiante1.get().getNombre());
		}

		Long contador = asignaturaRepository.countByCreditos(null);
		System.out.println("Número de asignaturas con 3 créditos: " + contador);

		List<Matricula> matriculasByEstudiante = matriculaRepository
				.findByEstudianteNombre(estudiante1.get().getNombre());
		for (Matricula matricula : matriculasByEstudiante) {
			System.out.println("Fecha: " + matricula.getFecha() + ", Nota: " + matricula.getCalificacion()
					+ ", Alumno: " + estudiante1.get().getNombre());
		}

	}

}