/* 
 * Autores: Abel, Fernando, Raul
 * Ultima modificacion: 19/01/2022
 * */

package objetos;

public class Lavadora extends Electrodomesticos {

	// CONSTANTES
	private final int CARGA = 5;

	// ATRIBUTOS
	private int carga;

	// CONSTRUCTOR POR DEFECTO
	public Lavadora() {
		super();
		this.carga = CARGA;
	}

	// CONSTRUCTOR CON PRECIO Y PESO
	public Lavadora(int precio, double peso) {
		super(precio, peso);
		this.carga = CARGA;
	}

	// CONSTRUCTOR CON TODOS LOS ATRIBUTOS
	public Lavadora(double precio, String color, char consumo, double peso, int carga) {
		super(precio, color, consumo, precio);
		this.carga = carga;
	}

	// METODO PARA MOSTRAR LOS ATRIBUTOS DE LAVADORA
	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", toString()=" + super.toString() + "]";
	}

	// GETTER Y SETTERS
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	// METODO PARA SUMAR AL PRECIO FINAL DEL ELECTRODOMESTICO LOS EXTRAS DE LA LAVADORA USANDO EL METODO DE LA CLASE PADRE
	public void precioFinal() {
		super.precioFinal();
		if (this.carga > 30) {
			this.precio = this.precio + 50;
		}
	}
}
