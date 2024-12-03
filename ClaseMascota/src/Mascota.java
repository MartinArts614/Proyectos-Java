
public class Mascota {
	
	//Atributos
	private String nombre;
	private String raza;
	private int edad;
	private String color;
	private int cumpleaños;
	
	
	//Constructores
	public Mascota() {
	}

	public Mascota(String nombre, String raza, int edad, String color, int cumpleaños) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.color = color;
		this.cumpleaños = cumpleaños;
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", color=" + color + ", cumpleaños="
				+ cumpleaños + "]";
	}

	
	//Encapsulamiento
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCumpleaños() {
		return cumpleaños;
	}

	public void setCumpleaños(int cumpleaños) {
		this.cumpleaños = cumpleaños;
	}
	

}
