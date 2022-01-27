/* 
 * Autores: Abel, Fernando, Raul
 * Ultima modificacion: 23/01/2022
 * */

package main;

import objetos.*;

public class MainApp {

	public static void main(String[] args) {
		
		Pelicula pelicula = new Pelicula("Harry Potter", 130, 5, "Paco");
		Cine cine = new Cine("Harry Potter", 5);
		Espectador e1 = new Espectador("Manuel", 20, 100);
		Espectador e2 = new Espectador("Paco", 3, 100);
		
		cine.mostrarSala();
		
		cine.sentar(0, 0, e1, pelicula);
		
		cine.mostrarSala();
		
		cine.sentar(0, 1, e2, pelicula);
		
		cine.mostrarSala();
	}

}
