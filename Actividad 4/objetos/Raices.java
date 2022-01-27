/* 
 * Autores: Abel, Fernando, Raul
 * Ultima modificacion: 20/01/2022
 */
package objetos;

public class Raices {
	
	//DEFINIR ATRIBUTOS
	private double a;
	private double b;
	private double c;

	//CREAR CONSTRUCTOR
	public Raices(double a, double b, double c) {

		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	//METODO QUE CALCULA Y DEVUELVE EL DISCRIMINANTE
	private double getDiscriminante() {

		double discriminante;
		
		discriminante = Math.pow(this.b, 2) - 4 * this.a * this.c;
		return discriminante;
	}

	//METODO QUE COMPRUEBA SI TIENE DOS SOLUCIONES
	private boolean tieneRaices() {

		if (getDiscriminante() > 0) {
			return true;
		}
		
		return false;
		
	}
	
	//METODO QUE COMPRUEBA SI TIENE UNA SOLUCION
	private boolean tieneRaiz() {

		if (getDiscriminante() == 0) {
			return true;
		}
		
		return false;
		
	}
	
	//METODO QUE CALCULA LAS DOS SOLUCIONES
	private void obtenerRaices() {
		
		double solucion1;
		double solucion2;
		
		solucion1 = (-this.b + (Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c)))) / (2 * this.a);
		solucion2 = (-this.b - (Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c)))) / (2 * this.a);
		
		System.out.println("La primera solucion es " + solucion1);
		System.out.println("La segunda solucion es " + solucion2);
	}
	
	//METODO QUE CALCULA UNA UNICA SOLUCION
	private void obtenerRaiz() {
		
		double solucion;
		
		solucion = (-this.b + (Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c)))) / (2 * this.a);
		
		System.out.println("La solucion es " + solucion);
	}
	
	//METODO QUE SEGUN LAS SOLUCIONES QUE TENGA LLAMA A LOS METODOS QUE LAS CALCUNAN E IMPRIMEN
	public void calcular() {
		
		if(tieneRaices()) {
			obtenerRaices();
		}else if(tieneRaiz()){
			obtenerRaiz();
		}else {
			System.out.println("La operacion no tiene solucion");
		}
	}
	
}
