package Estudiantes.spring.modelsDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import Estudiantes.spring.modelentity.Estudiante;


public interface IEstudianteDAO extends JpaRepository<Estudiante, String> 
{

}
