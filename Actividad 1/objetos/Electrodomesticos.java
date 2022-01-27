/*
 * Autores: Abel, Fernando, Raul
 * Ultima modificacion: 19/01/2022
 * */

package objetos;

import java.util.ArrayList;

public class Electrodomesticos {

	// CONSTANTES
	private final double PRECIO = 100;
	private final String COLOR = "blanco";
	private final char CONSUMO = 'F';
	private final double PESO = 5;

	// ATRIBUTOS
	protected double precio;
	protected String color;
	protected char consumo;
	protected double peso;

	// CONSTRUCTOR POR DEFECTO
	public Electrodomesticos() {
		this.precio = PRECIO;
		this.color = COLOR;
		this.consumo = CONSUMO;
		this.peso = PESO;
	}

	// CONSTRUCTOR CON PRECIO Y PESO
	public Electrodomesticos(double precio, double peso) {
		this.color = COLOR;
		this.consumo = CONSUMO;
		this.precio = precio;
		this.peso = peso;
	}

	// CONSTRUCTOR CON TODOS LOS ATRIBUTOS
	public Electrodomesticos(double precio, String color, char consumo, double peso) {
		this.precio = precio;
		this.color = comprobarColor(color);
		this.consumo = comprobarConsumo(consumo);
		this.peso = peso;
	}

	// METODO QUE COMPRUEBA QUE EL COLOR PASADO POR EL USUARIO ESTA ENTRE LOS PERMITIDOS Y SINO LO PONE POR DEFECTO
	private String comprobarColor(String color) {
		String colorUsuario = color;

		ArrayList<String> colores = new ArrayList<String>();
		colores.add("blanco");
		colores.add("negro");
		colores.add("rojo");
		colores.add("azul");
		colores.add("gris");

		boolean salir = false;
		int contador = 0;
		int sizeColores = colores.size() - 1;
		// Hago un bucle que recorre el arraylist comprobando si el color introducido
		// es un color valido, una vez lo encuentra hace un return del color, si no
		// lo encuentra pone el color por defecto
		do {
			if (colores.get(contador).equalsIgnoreCase(colorUsuario)) {
				color = colorUsuario;
				salir = true;
			} else {
				color = COLOR;
			}
			contador++;
		} while (!salir && contador < sizeColores);

		return color;
	}

	// METODO QUE COMPRUEBA QUE EL CONSUMO PASADO POR EL USUARIO ESTA ENTRE LOS PERMITIDOS Y SINO LO PONE POR DEFECTO
	private char comprobarConsumo(char consumo) {
		char consumos[] = new char[] { 'A', 'B', 'C', 'D', 'E', 'F' };
		char consumoUsuario = consumo;

		for (int i = 0; i < consumos.length; i++) {
			if (consumoUsuario == (consumos[i])) {
				consumo = consumoUsuario;
				return consumo;
			} else {
				consumo = CONSUMO;
			}
		}

		return consumo;
	}

	// METODO QUE CALCULA EL PRECIO FINAL SEGUN LAS CARACTERISTICAS DEL ELECTRODOMESTICO
	public void precioFinal() {
		if (this.consumo == 'A') {
			this.precio += 100;
		} else if (this.consumo == 'B') {
			this.precio += 80;
		} else if (this.consumo == 'C') {
			this.precio += 60;
		} else if (this.consumo == 'D') {
			this.precio += 50;
		} else if (this.consumo == 'E') {
			this.precio += 30;
		} else if (this.consumo == 'F') {
			this.precio += 10;
		}
		
		if (this.peso <= 19) {
			this.precio += 10;
		} else if (this.peso >= 20 && this.peso <= 49) {
			this.precio += 50;
		} else if (this.peso >= 50 && this.peso <= 79) {
			this.precio += 80;
		} else if (this.peso >= 80) {
			this.precio += 100;
		}
		
		
	}

	// METODO PARA MOSTRAR LOS VALORES DEL ELECTRODOMESTICO
	@Override
	public String toString() {
		return "Electrodomesticos: precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso
				+ "]";
	}

	// GETTERS Y SETTERS PARA ACCEDER Y MODIFICAR A LOS ATRIBUTOS DESDE OTRA CLASE
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;

	}

}
