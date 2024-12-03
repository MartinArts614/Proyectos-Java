import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		Casa casa1 = new Casa(50.0, 30.0, 2, 3, 2, 2001);
		Casa casa2 = new Casa(45.0, 25.0, 2, 4, 3, 2010);
		Casa casa3 = new Casa(60.0, 30.0, 3, 4, 3, 2015);
		
		List<Casa> listCasas = new ArrayList<Casa>();
		
		//Guardar
		listCasas.add(casa1);
		listCasas.add(casa2);
		listCasas.add(casa3);
		
		//Mostrar
		System.out.println(listCasas);
		
		//Editar
		Casa c4 = listCasas.get(0);
		c4.setRecamaras(4);
		listCasas.set(0, c4);
		
		
		//Borrar
		listCasas.remove(1);
		
		
		//Buscar
		c4 = listCasas.get(1);
	    System.out.println(c4);
		
		//Listar
		for(int i=0; i<listCasas.size(); i++) {
			System.out.printf("\n[%d] => " + listCasas.get(i),i);
		}
		
		for(Casa c : listCasas) {
			System.out.println("\n" + c.getAñoConstruccion());
		}
		
	}
}
