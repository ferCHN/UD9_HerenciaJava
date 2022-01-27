/* 
 * Autores: Abel, Fernando, Raul
 * Ultima modificacion: 19/01/2022
 * */

package main;

import objetos.Electrodomesticos;
import objetos.Lavadora;
import objetos.Television;

public class mainApp {

	public static void main(String[] args) {

		//Crea un array de Electrodomesticos de 10 posiciones.
		Electrodomesticos[] electrodomesticos = new Electrodomesticos[10];

		//Asigna a cada posición un objeto de las clases anteriores con los valores que
		//desees.
		electrodomesticos[0] = new Lavadora(200, "amarillo", 'J', 12.4, 40);
		electrodomesticos[1] = new Television(250, "amarillo", 'J', 12.4, 41, true);
		electrodomesticos[2] = new Lavadora(160, "amarillo", 'J', 12.4, 20);
		electrodomesticos[3] = new Lavadora(560, "amarillo", 'J', 12.4, 15);
		electrodomesticos[4] = new Television(650, "amarillo", 'J', 12.4, 41, true);
		electrodomesticos[5] = new Lavadora(756, "amarillo", 'J', 12.4, 25);
		electrodomesticos[6] = new Television(675, "amarillo", 'J', 12.4, 41, true);
		electrodomesticos[7] = new Television(234, "amarillo", 'J', 12.4, 41, true);
		electrodomesticos[8] = new Lavadora(545, "amarillo", 'J', 12.4, 55);
		electrodomesticos[9] = new Television(356, "amarillo", 'J', 12.4, 41, true);

		//Ahora, recorre este array y ejecuta el método precioFinal
		int contTelevisiones = 0;
		int contLavadoras = 0;
		double sumaTotal = 0;

		// Calcula el precioFinal de cada electrodomestico del array y va sumando el precioFinal de cada uno a una variable
		for (int i = 0; i < electrodomesticos.length; i++) {
			electrodomesticos[i].precioFinal();
			sumaTotal += electrodomesticos[i].getPrecio();

			// Condicion que dependiendo del tipo de electrodomestico le suma 1 al contador que le corresponde
			if (electrodomesticos[i] instanceof Television) {
				contTelevisiones++;

			} else {
				contLavadoras++;
			}
		}

		// Declaro 2 arrays, uno de Television y otro de Lavadora usando los contadores anteriores para poner las medidas
		Television[] televisiones = new Television[contTelevisiones];
		Lavadora[] lavadoras = new Lavadora[contLavadoras];

		// Pongo los contadores a 0
		contTelevisiones = 0;
		contLavadoras = 0;

		// Meto en los arrays que he declarado las Televisiones y Lavadoras por separado, para poder mostrarlos por separado despues
		for (int i = 0; i < electrodomesticos.length; i++) {
			if (electrodomesticos[i] instanceof Television) {
				televisiones[contTelevisiones] = (Television) electrodomesticos[i];
				contTelevisiones++;

			} else {
				lavadoras[contLavadoras] = (Lavadora) electrodomesticos[i];
				contLavadoras++;
			}
		}

		// Muestro ambos arrays
		for (int i = 0; i < lavadoras.length; i++) {
			System.out.println("El precio de la lavadora " + i + " es: " + lavadoras[i].getPrecio());
		}

		System.out.println("------");

		for (int i = 0; i < televisiones.length; i++) {
			System.out.println("El precio de la television " + i + " es: " + televisiones[i].getPrecio());
		}

		// Muestro la suma total del precio de todos los electrodomesticos
		System.out.println("------");
		System.out.println("Suma total de todos los electrodomesticos = " + sumaTotal);

	}
}
