import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Celular celular1 = new Celular("G9", "Motorola", 7, 1, 5000 );
		Celular celular2 = new Celular("M10", "Iusacell", 8, 2, 6000 );
		Celular celular3 = new Celular("Iphone15", "Apple", 9, 5, 20000 );
	
		List<Celular> listCelulares = new ArrayList<Celular>();
		 
		//Guardar
		listCelulares.add(celular1);
		listCelulares.add(celular2);
		listCelulares.add(celular3);
		
		//Mostrar
		System.out.println(listCelulares);
		
		//Editar
		// Obtiene el objeto en el índice 0 de la lista y la reemplaza por cel
		Celular cel = listCelulares.get(0); 
		cel.setPrecio(15000.0);
		//En la lista agrega en el índice 0 el objeto cel
		listCelulares.set(0, cel);
		System.out.println(listCelulares);
		
		//Borrar
		listCelulares.remove(2);
		System.out.println(listCelulares);
		
		//Buscar
		cel= listCelulares.get(1);
		System.out.println(cel);
		
		//Listar
		for(int i=0; i<listCelulares.size(); i++) {
			System.out.printf("\n[%d] => " + listCelulares.get(i),i);
		}
		for(Celular c : listCelulares) {
			System.out.println(c.getModelo());
		}
		
		
		
		
		
	}
	
	

}
