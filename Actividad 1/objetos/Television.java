/* 
 * Autores: Abel, Fernando, Raul
 * Ultima modificacion: 19/01/2022
 * */

package objetos;

public class Television extends Electrodomesticos{

	// CONSTANTES
	private final int PULGADAS = 20;
	private final boolean SINTONIZADORTDT = false;
	
	// ATRIBUTOS
	private int pulgadas;
	private boolean sintonizadorTDT;
	
	// CONSTRUCTOR POR DEFECTO
	public Television() {
		super();
		this.pulgadas = PULGADAS;
		this.sintonizadorTDT = SINTONIZADORTDT;
	}

	// CONSTRUCTOR CON PRECIO Y PESO
	public Television(double precio, double peso) {
		super(precio, peso);
		this.pulgadas = PULGADAS;
		this.sintonizadorTDT = SINTONIZADORTDT;
	}

	// CONSTRUCTOR CON TODOS LOS ATRIBUTOS
	public Television(double precio, String color, char consumo, double peso, int pulgadas, boolean sintonizadorTDT) {
		super(precio, color, consumo, peso);
		this.pulgadas = pulgadas;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	// METODO BOOLEAN QUE ME DEVUELVE SI LA TELEVISION TIENE SINTONIZADOR O NO
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	// GETTERS Y SETTERS
	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}
	
	// METODO PARA SUMAR AL PRECIO FINAL DEL ELECTRODOMESTICO LOS EXTRAS DE LA TELEVISION USANDO EL METODO DE LA CLASE PADRE
	public void precioFinal() {
		
		super.precioFinal();
		if (this.pulgadas > 40) {
			this.precio *= 1.30;
		}
		
		if (this.sintonizadorTDT) {
			this.precio += 50;
		}
	}

	// METODO PARA MOSTRAR LOS ATRIBUTOS DE TELEVISION
	@Override
	public String toString() {
		return "Television [pulgadas=" + pulgadas + ", sintonizadorTDT=" + sintonizadorTDT + ", precio=" + precio
				+ ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + "]";
	}
	
	
	
}
