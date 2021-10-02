package Estudiantes.spring.estudianteservice;

import java.util.List;

import Estudiantes.spring.modelentity.Estudiante;


public interface IEstudianteService
{
	public List<Estudiante> findAll();
	public Estudiante save(Estudiante e);
	public void delete(String nombre);
	public Estudiante encontrarporNombre(String nombre);
}
