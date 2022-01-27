package objetos;

public class Cine {
	
	// ATRIBUTOS
	private String pelicula = "";
	private double precio = 0;
	private String[][] sala = {{"8A", "8B", "8C", "8D", "8E", "8F", "8G", "8H", "8I"},
								{"7A", "7B", "7C", "7D", "7E", "7F", "7G", "7H", "7I"},
								{"6A", "6B", "6C", "6D", "6E", "6F", "6G", "6H", "6I"},
								{"5A", "5B", "5C", "5D", "5E", "5F", "5G", "5H", "5I"},
								{"4A", "4B", "4C", "4D", "4E", "4F", "4G", "4H", "4I"},
								{"3A", "3B", "3C", "3D", "3E", "3F", "3G", "3H", "3I"},
								{"2A", "2B", "2C", "2D", "2E", "2F", "2G", "2H", "2I"},
								{"1A", "1B", "1C", "1D", "1E", "1F", "1G", "1H", "1I"}};
	
	// CONSTRUCTOR
	public Cine(String pelicula, double precio) {
		this.pelicula = pelicula;
		this.precio = precio;
	}
	
	// METODO PARA MOSTRAR LA SALA
	public void mostrarSala() {
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[i].length; j++) {
				System.out.print(this.sala[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	// METODO PARA SENTAR AL ESPECTADOR EN UN PUESTO DE LA SALA
	public void sentar(int fila, int columna, Espectador espectador, Pelicula pelicula) {
		
		// COMPRUEBO SI EL ESPECTADOR TIENE LA EDAD MINIMA
		if (espectador.getEdad() >= pelicula.getEdadMin()) {
			
			// COMPRUEBO SI EL ESPECTADOR TIENE DINERO SUFICIENTE
			if (espectador.getDinero() >= this.precio) {
				
				// COMPRUEBO SI EL ASIENTO ESTA OCUPADO, SI LO ESTA BUSCO UN ASIENTO LIBRE
				if (!this.sala[fila][columna].equals("@@")) {
					this.sala[fila][columna] = "@@";
					
				} else {
					int[] asientoLibre = buscarAsiento();
					this.sala[asientoLibre[0]][asientoLibre[1]] = "@@";					
					
				}
			} else {
				System.out.println(espectador.getNombre() + " no puede sentarse porque no tiene el dinero suficiente para la entrada.");
				
			}
			
		} else {
			System.out.println(espectador.getNombre() + " no puede sentarse porque no tiene la edad minima para ver la pelicula.");
		}
		
	}
	
	// METODO QUE BUSCA UN ASIENTO LIBRE
	public int[] buscarAsiento() {
		int[] asiento = new int[2];
		
		for (int i = 0; i < this.sala.length; i++) {
			for (int j = 0; j < this.sala[i].length; j++) {
				
				if (!this.sala[i][j].equals("@@")) {
					asiento[0] = i;
					asiento[1] = j;
					return asiento;
				}
			}
		}
		
		System.out.println("No quedan asientos libres.");
		
		return asiento;
		
	}

	// GETTERS Y SETTERS
	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String[][] getSala() {
		return sala;
	}

	public void setSala(String[][] sala) {
		this.sala = sala;
	}
	
}
