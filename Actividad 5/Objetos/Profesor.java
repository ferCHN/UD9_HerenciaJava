package Objetos;

import Interfaces.Novillable;

public class Profesor extends Persona implements Novillable {
	
	//DEFINIR ATRIBUTOS DE LOS PROFESORES
	public Materias materia;
	public boolean novillos;
	
	//CONSTRUCTOR DE UN PROFESOR 
	public Profesor(String nombre, int edad, String sexo, Materias materia) {
		super(nombre, edad, sexo);
		this.materia = materia;
		this.novillos = disponibilidad();
	}

	//METODO PARA VERIFICAR LA ASISTENCIA DE LOS PROFESORES
	public boolean disponibilidad(){
		
		double numRandom = Math.floor(Math.random() * 10 + 0);
		
		if(numRandom >= 0 && numRandom <= 2) {
			return false;
		}else if (numRandom > 2 && numRandom <= 10) {
			return true;
		}
					
		return false;
	}

	//METODO TO STRING
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "materia=" + materia + ", novillos=" + novillos + "]";	
	}
	
}
