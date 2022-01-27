package Objetos;

import Interfaces.Novillable;
public class Estudiante extends Persona implements Novillable {
	//DEFINIR ATRIBUTOS DE LOS ESTUDIANTES
		public double calificacion;
		public boolean novillos;

		//CONSTRUCTOR DE UN ESTUDIANTE
		public Estudiante(String nombre, int edad, String sexo, double calificacion) {
			super(nombre, edad, sexo);
			this.calificacion = calificacion;
			this.novillos = disponibilidad();
		}

		//METODO PARA VERIFICAR LA EDAD DE LOS ESTUDIANTES
		public boolean limiteEdad() {
			
			if (edad >= 18 && edad <= 50) {
				return true;
			}
			
			return false;
		}
		
		//METODO PARA VERIFICAR LA ASISTENCIA DE LOS ESTUDIANTES
		public boolean disponibilidad(){
			
			double numRandom = Math.floor(Math.random() * 10 + 0);
			
			if(numRandom >= 0 && numRandom <= 5) {
				return false;
			}else if (numRandom > 5 && numRandom <= 10) {
				
			}
			return true;	
		}

		//METODO TO STRING
		@Override
		public String toString() {
			return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", calificacion=" + calificacion + "]";		
		}
}
