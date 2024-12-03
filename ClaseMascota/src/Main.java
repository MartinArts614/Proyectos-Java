
public class Main {
	public static void main(String[] args) {
	
		Mascota perro = new Mascota();
		Mascota gato = new Mascota("Michi", "Felino", 1, "Blanco", 2000);
		
		perro.setNombre("Drago");
		perro.setRaza("Canina");
		perro.setEdad(2);
		perro.setColor("Negro");
		perro.setCumpleaños(2001);
		
		System.out.println(perro);
		System.out.println("Nombre: " + gato.getNombre());
		System.out.println("Raza: " + gato.getRaza());
		System.out.println("Edad: " + gato.getColor());
		System.out.println("Cumpleaños: " + gato.getCumpleaños());
	}
}

