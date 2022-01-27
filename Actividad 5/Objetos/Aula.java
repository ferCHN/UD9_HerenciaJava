package Objetos;

public class Aula {
	// DEFINIR ATRIBUTOS DE UN AULA
		private int identificadorAula;
		private int aforo;
		private Materias materia;
		private static Estudiante alumnos[];
		private static Estudiante chicas[];
		private static Estudiante chicos[];
		private static int contador = 0;

		// CREAR EL CONSTRUCTOR
		public Aula(int identificadorAula, int aforo, Materias materia) {

			this.identificadorAula = identificadorAula;
			this.materia = materia;
			this.aforo = aforo;
			Aula.alumnos = new Estudiante[aforo];
			Aula.chicas = new Estudiante[aforo];
			Aula.chicos = new Estudiante[aforo];
		}

		// METODO PARA AÑADIR ALUMNOS AL ARRAY DE ALUMNOS
		public void anadirAlumno(Estudiante e) {

			alumnos[contador] = e;
			contador++;
		}

		// METODO QUE ALMACENA LOS ALUMNOS EN EL ARRAY DEL SEXO CORRESPONDIENTE
		public static void separarSexos() {

			int contadorH = 0;
			int contadorM = 0;

			for (int i = 0; i < alumnos.length; i++) {
				if (alumnos[i] != null) {
					if (alumnos[i].sexo.contains("M")) {
						chicas[contadorM] = alumnos[i];
						contadorM++;
					} else {
						chicos[contadorH] = alumnos[i];
						contadorH++;
					}
				}
			}

			listaAlumnos();
		}

		// METODO QUE MUESTRA A LOS ALUMNOS POR SEXO Y SI HAN APROBADO
		public static void listaAlumnos() {

			System.out.println("\nListado de chicas");
			for (int i = 0; i < chicas.length; i++) {
				if (chicas[i] != null) {
					if (chicas[i].calificacion >= 5) {
						if(chicas[i].limiteEdad()) {
							System.out.println(chicas[i]);
						}
					}
				}	
			}

			System.out.println("\nListado de chicos");
			for (int i = 0; i < chicos.length; i++) {
				if (chicos[i] != null)
					if (chicos[i].calificacion >= 5) {
						if(chicos[i].limiteEdad()) {
							System.out.println(chicos[i]);
						}
						
					}
				}
			}

		public static int apuntados() {

			int contador = 0;

			for (int i = 0; i < alumnos.length; i++) {
				if (alumnos[i] != null) {
					contador++;
				}
			}

			return contador;
		}

		public static void hayClase(Profesor p, Aula a) {

			if (p.disponibilidad() == true) {
				if (p.materia.equals(a.materia)) {
					if (a.aforo < (apuntados() * 2)) {
						System.out.println("\nLa clase se puede realizar");
						separarSexos();
					} else {
						System.out.println("\nLa clase no tiene mas de un 50% de asistencia");
					}
				} else {
					System.out.println("\nLa clase no corresponde a su asignatura");
				}
			} else {
				System.out.println("\nEl profesor no esta disponible");
			}
		}

		// METODO PARA MOSTRAR TODA LA INFORMACION
		@Override
		public String toString() {
			for (int i = 0; i < alumnos.length; i++) {
				System.out.println(alumnos[i]);
			}
			return "aula [id=" + identificadorAula + ", aforo=" + aforo + ", materia=" + materia + "]";
		}
}
