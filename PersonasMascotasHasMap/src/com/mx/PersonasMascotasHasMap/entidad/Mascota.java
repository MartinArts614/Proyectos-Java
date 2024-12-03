package com.mx.PersonasMascotasHasMap.entidad;

public class Mascota {
	//Atributos
	String nombreM;
	int edadM;
	double peso;
	String especie;
	
	//Constructores
	public Mascota(String nombreM, int edadM, double peso, String especie) {
		this.nombreM = nombreM;
		this.edadM = edadM;
		this.peso = peso;
		this.especie = especie;
	}
	public Mascota() {
	}
	
	//ToString
	@Override
	public String toString() {
		return "Mascota [nombreM=" + nombreM + ", edadM=" + edadM + ", peso=" + peso + ", especie=" + especie + "]\n";
	}
	
	//Encapsulamiento
	public String getNombreM() {
		return nombreM;
	}
	public void setNombreM(String nombreM) {
		this.nombreM = nombreM;
	}
	public int getEdadM() {
		return edadM;
	}
	public void setEdadM(int edadM) {
		this.edadM = edadM;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
}
