/* 
 * Autores: Abel, Fernando, Raul
 * Ultima modificacion: 20/01/2022
 */
package main;

import objetos.Raices;

public class Actividad4App {

	public static void main(String[] args) {
		
		//ECUACION CON DOS SOLUCIONES
		Raices r1 = new Raices(2.54, 9.56, 7.65);
		//ECUACION CON UNA SOLUCION
		Raices r2 = new Raices(1, -2, 1);
		//ECUACION SIN SOLUCION
		Raices r3 = new Raices(5, -2, 1);
		
		System.out.println("Primera ecuacion");
		r1.calcular();
		System.out.println("\nSegunda ecuacion");
		r2.calcular();
		System.out.println("\nTercera ecuacion");
		r3.calcular();
	}

}
