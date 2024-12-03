package pack1;

public class Pelicula {
	//Atributos
	String nombre;
	String genero;
	double duracion;
	String director;
	int a�o;
	String clasificacion;
	
	//Constructores
	public Pelicula(String nombre, String genero, double duracion, String director, int a�o, String clasificacion) {
		this.nombre = nombre;
		this.genero = genero;
		this.duracion = duracion;
		this.director = director;
		this.a�o = a�o;
		this.clasificacion = clasificacion;
	}
	public Pelicula() {
	}
	
	//ToString
	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", genero=" + genero + ", duracion=" + duracion + ", director=" + director
				+ ", a�o=" + a�o + ", clasificacion=" + clasificacion + "]\n";
	}
	
	//Encapsulamiento
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
}
