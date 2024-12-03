
public class Celular {
	//Atributos
	private String modelo;
	private String marca;
	private double tama�o;
	private int almacenamiento;
	private double precio;
	
	//Constructores
	public Celular(String modelo, String marca, double tama�o, int almacenamiento, double precio) {
		this.modelo = modelo;
		this.marca = marca;
		this.tama�o = tama�o;
		this.almacenamiento = almacenamiento;
		this.precio = precio;
	}
	
	public Celular() {
	}
	
	//ToString
	@Override
	public String toString() {
		return "Celular [modelo=" + modelo + ", marca=" + marca + ", tama�o=" + tama�o + ", almacenamiento="
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
	public double getTama�o() {
		return tama�o;
	}
	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
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
