
public class Celular {
	//Atributos
	private String modelo;
	private String marca;
	private double tamaño;
	private int almacenamiento;
	private double precio;
	
	//Constructores
	public Celular(String modelo, String marca, double tamaño, int almacenamiento, double precio) {
		this.modelo = modelo;
		this.marca = marca;
		this.tamaño = tamaño;
		this.almacenamiento = almacenamiento;
		this.precio = precio;
	}
	
	public Celular() {
	}
	
	//ToString
	@Override
	public String toString() {
		return "Celular [modelo=" + modelo + ", marca=" + marca + ", tamaño=" + tamaño + ", almacenamiento="
				+ almacenamiento + ", precio=" + precio + "]\n";
	}
	
	//Encapsulamiento
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getTamaño() {
		return tamaño;
	}
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
	public int getAlmacenamiento() {
		return almacenamiento;
	}
	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

}
