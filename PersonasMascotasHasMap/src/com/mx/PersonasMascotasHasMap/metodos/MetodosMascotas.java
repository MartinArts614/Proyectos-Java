package com.mx.PersonasMascotasHasMap.metodos;

import com.mx.PersonasMascotasHasMap.entidad.Mascota;

public interface MetodosMascotas {
	public void guardar(Mascota mascota);
	public void editar(Mascota mascota);
	public Mascota buscar(Mascota mascota);
	public void eliminar(Mascota mascota);
	public void mostrar();
	public void mostrarMascotasEsp(String especie);
}
