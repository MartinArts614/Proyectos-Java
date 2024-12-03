package pack1;

public class Pais {
	//Atributos
	String nombre;
	String continente;
	String capital;
	int poblacion;
	String idioma;
	double territorio;
	
	//Constructores
	public Pais(String nombre, String continente, String capital, int poblacion, String idioma, double territorio) {
		this.nombre = nombre;
		this.continente = continente;
		this.capital = capital;
		this.poblacion = poblacion;
		this.idioma = idioma;
		this.territorio = territorio;
	}
	public Pais() {
	}
	
	//ToString
	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", continente=" + continente + ", capital=" + capital + ", poblacion="
				+ poblacion + ", idioma=" + idioma + ", territorio=" + territorio + "]\n";
	}
	
	//Encapsulamiento
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContinente() {
		return continente;
	}
	public void setContinente(String continente) {
		this.continente = continente;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public double getTerritorio() {
		return territorio;
	}
	public void setTerritorio(double territorio) {
		this.territorio = territorio;
	}
	
	

}
