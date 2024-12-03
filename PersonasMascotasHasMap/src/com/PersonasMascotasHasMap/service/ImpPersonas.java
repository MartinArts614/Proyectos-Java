package com.PersonasMascotasHasMap.service;


import java.util.HashMap;


import com.mx.PersonasMascotasHasMap.entidad.Persona;
import com.mx.PersonasMascotasHasMap.metodos.MetodosPersonas;

/**
 * 
 * @author ASUS
 *
 */
public class ImpPersonas implements MetodosPersonas {
	HashMap<String, Persona> personas = new HashMap<String, Persona>();
	
	
	/**
	 *Método guardar, nos permite guardar lo parametros de 
	 *una persona
	 *@param persona
	 *@category - Categorias de personas
	 *{@code} codigo 1
	 */
	@Override
	public void guardar(Persona persona) {
		if (personas.containsKey(persona.getCurp())) {
			System.out.println("La persona ya existe");
		} else {
			personas.put(persona.getCurp(), persona);
		}
	}

	
	/**
	 *Método que nos permite editar los datos de una persona
	 *@param persona
	 */
	@Override
	public void editar(Persona persona) {
		personas.put(persona.getCurp(), persona);

	}

	@Override
	public Persona buscar(Persona persona) {
		if (personas.containsKey(persona.getCurp())) {
			return personas.get(persona.getCurp());
		}
		return null;
	}

	@Override
	public void eliminar(Persona persona) {
		if (personas.containsKey(persona.getCurp())) {
			personas.remove(persona.getCurp());
		} else {
			System.out.println("La persona no existe");
		}

	}

	@Override
	public void mostrar() {
		if (personas.isEmpty()) {
			System.out.println("No hay datos");
		} else {
			System.out.println(personas);
		}

	}

	
	/**
	 *Método que nos permiete saber que persona tiene más mascotas asignadas
	 *
	 */
	public void mostrarMasMascotas() {
		Persona persona = new Persona();
		int temp = 0;
		for (Persona p : personas.values()) {
			if (p.getMascotas().size() >= temp) {
				temp = p.getMascotas().size();
				persona = p;
			}
		}
		System.out.println(persona);
	}
	public void numMascotas() {
			for (Persona p : personas.values()) {
				System.out.println(p.getNombre() + " = " + p.getMascotas().size());
			}
	}
	

}
