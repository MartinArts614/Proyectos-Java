
public class Casa {
	//Atributos
	private double largo;
	private double ancho;
	private int	pisos;
	private int recamaras;
	private int ba�os;
	private int a�oConstruccion;
	
	//Constructores
	public Casa(double largo, double ancho, int pisos, int recamaras, int ba�os, int a�oConstruccion) {
		this.largo = largo;
		this.ancho = ancho;
		this.pisos = pisos;
		this.recamaras = recamaras;
		this.ba�os = ba�os;
		this.a�oConstruccion = a�oConstruccion;
	}

	public Casa() {
	}
	
    //ToString
	@Override
	public String toString() {
		return "Casa [largo=" + largo + ", ancho=" + ancho + ", pisos=" + pisos + ", recamaras=" + recamaras
				+ ", ba�os=" + ba�os + ", a�oConstruccion=" + a�oConstruccion + "]";
	}
	
    //Encapsulamiento
	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public int getPisos() {
		return pisos;
	}

	public void setPisos(int pisos) {
		this.pisos = pisos;
	}

	public int getRecamaras() {
		return recamaras;
	}

	public void setRecamaras(int recamaras) {
		this.recamaras = recamaras;
	}

	public int getBa�os() {
		return ba�os;
	}

	public void setBa�os(int ba�os) {
		this.ba�os = ba�os;
	}

	public int getA�oConstruccion() {
		return a�oConstruccion;
	}

	public void setA�oConstruccion(int a�oConstruccion) {
		this.a�oConstruccion = a�oConstruccion;
	}
	
	
	
	

}
