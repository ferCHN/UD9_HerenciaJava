/* Autores: Abel, Fernando, Raul
 * Ultima modificacion: 20/01/2022
 * */

package main;

import objetos.*;

public class Actividad2App {

	public static void main(String[] args) {
//		• Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada 
//		uno.
		Videojuego videojuegos[] = new Videojuego[5];
		Serie series[] = new Serie[5];

//		• Crea un objeto en cada posición del array, con los valores que desees, puedes 
//		usar distintos constructores.
		videojuegos[0] = new Videojuego("Dark Souls", 40, false, "RPG", "From Software");
		videojuegos[1] = new Videojuego("Dark Souls 2", 70, false, "RPG", "From Software");
		videojuegos[2] = new Videojuego("Dark Souls 3", 30, false, "RPG", "From Software");
		videojuegos[3] = new Videojuego("Sekiro", 25, false, "RPG", "From Software");
		videojuegos[4] = new Videojuego("Elden Ring", 30, false, "RPG", "From Software");

		series[0] = new Serie("Juego de Tronos", 8, false, "Fantasia epica", "George R. R. Martin");
		series[1] = new Serie("Arcane", 2, false, "Fantasia", "Riot Games");
		series[2] = new Serie("Shingeki no Kyojin", 6, false, "Fantasia", "Japon");
		series[3] = new Serie("Dragon Ball", 1, false, "Fantasia", "Japon");
		series[4] = new Serie("Dragon Ball Z", 1, false, "Fantasia", "Japon");

//		• Entrega algunos Videojuegos y Series con el método entregar().
		videojuegos[0].entregar();
		videojuegos[4].entregar();
		series[0].entregar();
		series[2].entregar();

//		• Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, 
//		devuélvelos.
		int videojuegosEntregados = 0;
		int seriesEntregadas = 0;

		for (int i = 0; i < 5; i++) {
			if (videojuegos[i].isEntregado()) {
				videojuegosEntregados++;
				System.out.println(videojuegos[i].getTitulo() + " esta entregado.");
			}

			if (series[i].isEntregado()) {
				seriesEntregadas++;
				System.out.println(series[i].getTitulo() + " esta entregada.");
			}

		}
		
		System.out.println();
		System.out.println("Hay " + videojuegosEntregados + " videojuegos entregados.\n" + "Hay "
				+ seriesEntregadas + " series entregadas.");

//		• Por último, indica el Videojuego tiene más horas estimadas y la serie con mas 
//		temporadas. Muestralos en pantalla con toda su información (usa el método 
//		toString()).
		Videojuego videojuegoMasLargo = new Videojuego("", 0, false, "", "");
		Serie serieMasLarga = new Serie("", 0, false, "", "");

		for (int i = 0; i < videojuegos.length; i++) {
			if (!videojuegoMasLargo.compareTo(videojuegos[i])) {
				videojuegoMasLargo = videojuegos[i];

			}

			if (!serieMasLarga.compareTo(series[i])) {
				serieMasLarga = series[i];
			}

		}
		
		// Muestro el videojuego y la serie mas largos
		System.out.println();
		System.out.println("El videojuego mas largo es: " + videojuegoMasLargo.toString());
		System.out.println("La serie mas larga es: " + serieMasLarga.toString());

	}

}
