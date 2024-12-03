package com.mx.PersonasMascotasHasMap.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.mx.PersonasMascotasHasMap.entidad.Mascota;
import com.mx.PersonasMascotasHasMap.entidad.Persona;

public class PersonasMascotasTest {
	@Test
	@DisplayName("GettersMascota")
	public void testGettersMascota() {
		Mascota mascota = new Mascota("Drago", 2, 15, "Canina");
		assertAll(
				() -> assertEquals("Drago", mascota.getNombreM()),
				() -> assertEquals(2, mascota.getEdadM()),
				() -> assertEquals("Canina", mascota.getEspecie())
				);
		
	}
	
	@Test
	@DisplayName("GettersPersona")
	public void testGettersPersona() {
		Mascota mascota1 = new Mascota("DRAGO", 2, 15, "Canina");
		Mascota mascota2 = new Mascota("POPY", 2, 15, "FELINO");
		Mascota mascota3 = new Mascota("FIRULAIS", 2, 15, "Canina");
		
		List<Mascota> mascotas = new ArrayList<Mascota>();
		mascotas.add(mascota1);
		mascotas.add(mascota2);
		mascotas.add(mascota3);
		
		Persona persona = new Persona("123","Julio", "Garcia", 10, "CDMX", mascotas);
		
		assertAll(
				() -> assertEquals("123",persona.getCurp()),
				() -> assertEquals("Julio", persona.getNombre()),
				() -> assertEquals("Garcia", persona.getApellido()),
				() -> assertEquals(10, persona.getEdad()),
				() -> assertEquals("CDMX", persona.getCiudad()),
				() -> assertEquals(mascotas, persona.getMascotas())
				);
	
	}
	

}
