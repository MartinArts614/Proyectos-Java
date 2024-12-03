package com.PersonasMascotasHasMap.service;

import java.util.HashMap;
import com.mx.PersonasMascotasHasMap.entidad.Mascota;
import com.mx.PersonasMascotasHasMap.metodos.MetodosMascotas;

public class ImpMascotas implements MetodosMascotas {
	HashMap<String, Mascota> mascotas = new HashMap<String, Mascota>();

	@Override
	public void guardar(Mascota mascota) {
		if(mascotas.containsKey(mascota.getNombreM())) {
			System.out.println("La mascota ya esta agregada");
		}
		else {
			mascotas.put(mascota.getNombreM(), mascota);
		}
	}

	@Override
	public void editar(Mascota mascota) {
		mascotas.put(mascota.getNombreM(), mascota);
		
	}

	@Override
	public Mascota buscar(Mascota mascota) {
		if(mascotas.containsKey(mascota.getNombreM())) {
			return mascotas.get(mascota.getNombreM());
		}
		return null;
	}

	@Override
	public void eliminar(Mascota mascota) {
		if(mascotas.containsKey(mascota.getNombreM())) {
			mascotas.remove(mascota.getNombreM());
			System.out.println("La mascota fue eliminada exitosamente");
		}
		else {
			System.out.println("La mascota no existe");
		}
	}

	@Override
	public void mostrar() {
		if(mascotas.isEmpty()) {
			System.out.println("No hay datos");
		}
		else {
			System.out.println(mascotas);
		}
		
		
	}
	public void mostrarMascotasEsp(String especie) {
		for (Mascota m: mascotas.values()) {
			if(m.getEspecie().equals(especie)) {
				System.out.println(especie + " => " + m.getNombreM());
			}
		}
}

}

	