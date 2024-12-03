
public class Mascota {
	
	//Atributos
	private String nombre;
	private String raza;
	private int edad;
	private String color;
	private int cumplea�os;
	
	
	//Constructores
	public Mascota() {
	}

	public Mascota(String nombre, String raza, int edad, String color, int cumplea�os) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.color = color;
		this.cumplea�os = cumplea�os;
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", color=" + color + ", cumplea�os="
				+ cumplea�os + "]";
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

	public int getCumplea�os() {
		return cumplea�os;
	}

	public void setCumplea�os(int cumplea�os) {
		this.cumplea�os = cumplea�os;
	}
	

}
