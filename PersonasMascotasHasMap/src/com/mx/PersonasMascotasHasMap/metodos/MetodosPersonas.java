package com.mx.PersonasMascotasHasMap.metodos;


import com.mx.PersonasMascotasHasMap.entidad.Persona;

public interface MetodosPersonas {
	public void guardar(Persona persona);
	public void editar(Persona persona);
	public Persona buscar(Persona persona);
	public void eliminar(Persona persona);
	public void mostrar();
	public void mostrarMasMascotas();
	public void numMascotas();
	
}
