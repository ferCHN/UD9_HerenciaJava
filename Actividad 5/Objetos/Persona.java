package Objetos;

public abstract class Persona {

	//DEFINIR ATRIBUTOS DE LAS PERSONAS
	protected String nombre = "";
	protected int edad = 0;
	protected String sexo;

	//CONSTRUCTOR DE UNA PERSONA
	public Persona(String nombre, int edad, String sexo) {

		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	//METODO TO STRING
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}

}
