package main;

import objetos.Libro;

public class mainAppp {

	public static void main(String[] args) {
		Libro libro1 = new Libro("1235428KS", "JavaAdvanced", "Raul", 300);
		Libro libro2 = new Libro("1234567JK", "JavaBasics", "Raul", 200);

		comprobarPaginas(libro1, libro2);

		System.out.println();
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
	}

	public static void comprobarPaginas(Libro libro1, Libro libro2) {

		if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
			System.out.println(libro1.getTitulo() + " tiene mas paginas que " + libro2.getTitulo());
		} else if (libro1.getNumPaginas() == libro2.getNumPaginas()) {
			System.out.println(libro1.getTitulo() + " tienen el mismo numero de paginas " + libro2.getTitulo());
		} else {
			System.out.println(libro2.getTitulo() + " tiene mas paginas que " + libro1.getTitulo());
		}

	}

}
