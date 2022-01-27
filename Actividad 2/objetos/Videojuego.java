/* 
 * Autores: Abel, Fernando, Raul
 * Ultima modificacion: 20/01/2022
 * */

package objetos;

import interfaces.Entregable;

public class Videojuego implements Entregable {

	// CONSTANTES CON VALORES POR DEFECTO
	private final int HORASESTIMADAS = 10;
	private final boolean ENTREGADO = false;
	
	// ATRIBUTOS
	private String titulo = "";
	private int horasEstimadas = HORASESTIMADAS;
	private boolean entregado = ENTREGADO;
	private String genero = "";
	private String creador = "";
	
	// CONSTRUCTOR POR DEFECTO
	public Videojuego() {
	}
	
	// CONSTRUCTOR CON TITULO Y CREADOR
	public Videojuego(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}
	
	// CONSTRUCTOR CON TODOS LOS ATRIBUTOS
	public Videojuego(String titulo, int horasEstimadas, boolean entregado, String genero, String creador) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}

	// GETTERS Y SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	// METODO toString PARA VER LOS ATRIBUTOS CON UN SYSTEM.OUT.PRINT
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}

	// METODO QUE CAMBIA EL ESTADO DE ENTREGADO A TRUE
	@Override
	public void entregar() {
		this.entregado = true;
		
	}

	// METODO QUE CAMBIA EL ESTADO DE ENTREGADO A FALSE
	@Override
	public void devolver() {
		this.entregado = false;
		
	}

	// METODO QUE COMPARA LAS HORAS QUE DURA UN JUEGO CON OTRO
	// Y DEVUELVE TRUE EN CASO DE DURAR MAS O FALSE EN CASO DE DURAR MENOS
	// (EN CASO DE TENER LAS MISMAS DEVUELVE FALSE)
	@Override
	public boolean compareTo(Object object) {
		Videojuego videojuegoComparado = new Videojuego();
		videojuegoComparado = (Videojuego) object;
		
		boolean duraMas = false;

		if(this.horasEstimadas > videojuegoComparado.getHorasEstimadas()) {
			duraMas = true;
			return duraMas;
		} else if (this.horasEstimadas < videojuegoComparado.getHorasEstimadas()) {
			duraMas = false;
			return duraMas;
		}
		
		return duraMas;
		
	}

	
	
}
