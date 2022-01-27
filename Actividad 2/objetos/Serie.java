/* 
 * Autores: Abel, Fernando, Raul
 * Ultima modificacion: 20/01/2022
 * */

package objetos;

import interfaces.Entregable;

public class Serie implements Entregable {

	// CONSTANTES CON VALORES POR DEFECTO
	private final int TEMPORADAS = 3;
	private final boolean ENTREGADO = false;
	
	// ATRIBUTOS
	private String titulo = "";
	private int temporadas = TEMPORADAS;
	private boolean entregado = ENTREGADO;
	private String genero = "";
	private String creador = "";
	
	// CONSTRUCTOR POR DEFECTO
	public Serie() {
	}
	
	// CONSTRUCTOR CON TITULO Y CREADOR
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	// CONSTRUCTOR CON TODOS LOS ATRIBUTOS
	public Serie(String titulo, int temporadas, boolean entregado, String genero, String creador) {
		this.titulo = titulo;
		this.temporadas = temporadas;
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

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	
	public boolean isEntregado() {
		return entregado;
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
		return "Serie [titulo=" + titulo + ", temporadas=" + temporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}

	@Override
	public void entregar() {
		this.entregado = true;
	}

	@Override
	public void devolver() {
		this.entregado = false;
		
	}

	// METODO QUE COMPARA LAS TEMPORADAS DE UNA SERIE CON OTRA
	// Y DEVUELVE TRUE EN CASO DE TENER MAS TEMPORADAS O FALSE EN CASO DE TENER MENOS
	// (EN CASO DE TENER LAS MISMAS DEVUELVE FALSE)
	@Override
	public boolean compareTo(Object object) {
		Serie serieComparada = new Serie();
		serieComparada = (Serie) object;
		
		boolean tieneMasTemporadas = false;

		if(this.temporadas > serieComparada.getTemporadas()) {
			tieneMasTemporadas = true;
			return tieneMasTemporadas;
		} else if (this.temporadas < serieComparada.getTemporadas()) {
			tieneMasTemporadas = false;
			return tieneMasTemporadas;
		}
		
		return tieneMasTemporadas;
		
	}
	
}
