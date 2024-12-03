package com.mx.PersonasMascotasHasMap.entidad;

import java.util.List;

public class Persona {
	//Atributos
	String curp;
	String nombre;
	String apellido;
	int edad;
	String ciudad;
	List<Mascota> mascotas;
	
	//Constructores
	public Persona(String curp, String nombre, String apellido, int edad, String ciudad, List<Mascota> mascotas) {
		this.curp = curp;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.ciudad = ciudad;
		this.mascotas = mascotas;
	}
	public Persona() {
	}
	
	//ToString
	@Override
	public String toString() {
		return "Persona [curp=" + curp + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", ciudad=" + ciudad + ", \n mascotas=" + mascotas + "]\n";
	}
	
	//Encapsulamiento
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public List<Mascota> getMascotas() {
		return mascotas;
	}
	public void setMascotas(List<Mascota> mascotas) {
		this.mascotas = mascotas;
	}
}
