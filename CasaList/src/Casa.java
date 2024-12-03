
public class Casa {
	//Atributos
	private double largo;
	private double ancho;
	private int	pisos;
	private int recamaras;
	private int baños;
	private int añoConstruccion;
	
	//Constructores
	public Casa(double largo, double ancho, int pisos, int recamaras, int baños, int añoConstruccion) {
		this.largo = largo;
		this.ancho = ancho;
		this.pisos = pisos;
		this.recamaras = recamaras;
		this.baños = baños;
		this.añoConstruccion = añoConstruccion;
	}

	public Casa() {
	}
	
    //ToString
	@Override
	public String toString() {
		return "Casa [largo=" + largo + ", ancho=" + ancho + ", pisos=" + pisos + ", recamaras=" + recamaras
				+ ", baños=" + baños + ", añoConstruccion=" + añoConstruccion + "]";
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

	public int getBaños() {
		return baños;
	}

	public void setBaños(int baños) {
		this.baños = baños;
	}

	public int getAñoConstruccion() {
		return añoConstruccion;
	}

	public void setAñoConstruccion(int añoConstruccion) {
		this.añoConstruccion = añoConstruccion;
	}
	
	
	
	

}
