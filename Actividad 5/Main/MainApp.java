package Main;

import Objetos.Aula;
import Objetos.Estudiante;
import Objetos.Materias;
import Objetos.Profesor;

public class MainApp {

	public static void main(String[] args) {
		// CREAMOS LOS OBJETOS
				Profesor p1 = new Profesor("Isma", 32, "H", Materias.Filosofia);
				Profesor p2 = new Profesor("Manuel", 32, "H", Materias.Fisica);
				Profesor p3 = new Profesor("Federico", 32, "H", Materias.Matematicas);
				Estudiante e1 = new Estudiante("Andrea", 34, "M", 8);
				Estudiante e2 = new Estudiante("Miguel", 25, "H", 7);
				Estudiante e3 = new Estudiante("Bea", 30, "M", 1);
				Estudiante e4 = new Estudiante("Luis", 24, "H", 2);
				Estudiante e5 = new Estudiante("Laia", 51, "M", 6);
				Estudiante e6 = new Estudiante("Juan", 30, "H", 9);
				Estudiante e7 = new Estudiante("Ramon", 43, "H", 3);
				Estudiante e8 = new Estudiante("Alba", 19, "M", 5);
				Estudiante e9 = new Estudiante("Maria", 22, "M", 1);

				// CREAMOS EL OBJETO AULA 1 Y AÑADIMOS ESTUDIANTES
				Aula a1 = new Aula(1, 6, Materias.Filosofia);
				a1.anadirAlumno(e1);
				a1.anadirAlumno(e2);
				a1.anadirAlumno(e3);

				// LLAMAMOS AL METODO hayClase(); PARA VER SI SE CUMPLEN LAS CONDICIONES Y SE PUEDE DAR LA CLASE 
				Aula.hayClase(p1, a1);
				Aula.hayClase(p2, a1);
				Aula.hayClase(p3, a1);

				// CREAMOS EL OBJETO AULA 2 Y AÑADIMOS ESTUDIANTES
				Aula a2 = new Aula(1, 16, Materias.Fisica);
				a2.anadirAlumno(e1);
				a2.anadirAlumno(e2);
				a2.anadirAlumno(e3);
				a2.anadirAlumno(e4);
				a2.anadirAlumno(e5);
				a2.anadirAlumno(e6);
				a2.anadirAlumno(e7);
				a2.anadirAlumno(e8);
				a2.anadirAlumno(e9);

				// LLAMAMOS AL METODO hayClase(); PARA VER SI SE CUMPLEN LAS CONDICIONES Y SE PUEDE DAR LA CLASE 
				Aula.hayClase(p1, a2);
				Aula.hayClase(p2, a2);
				Aula.hayClase(p3, a2);
			}
	}
