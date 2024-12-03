package pack1;

public class Pelicula {
	//Atributos
	String nombre;
	String genero;
	double duracion;
	String director;
	int año;
	String clasificacion;
	
	//Constructores
	public Pelicula(String nombre, String genero, double duracion, String director, int año, String clasificacion) {
		this.nombre = nombre;
		this.genero = genero;
		this.duracion = duracion;
		this.director = director;
		this.año = año;
		this.clasificacion = clasificacion;
	}
	public Pelicula() {
	}
	
	//ToString
	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", genero=" + genero + ", duracion=" + duracion + ", director=" + director
				+ ", año=" + año + ", clasificacion=" + clasificacion + "]\n";
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
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
}
