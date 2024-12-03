package pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Atributos
		String nombre;
		String genero;
		double duracion;
		String director;
		int a�o;
		String clasificacion;
		
		List<Pelicula> peliculas = new ArrayList<Pelicula>();
		Scanner scanner;
		int menu, indice, submenu, buscar, mostrar;
		
		do {
			System.out.println("Menu de pel�culas");
			System.out.println("1. Guardar");
			System.out.println("2. Editar");
			System.out.println("3. Buscar");
			System.out.println("4. Eliminar");
			System.out.println("5. Mostrar");
			System.out.println("6. Listar");
			System.out.println("7. Salir");
			scanner = new Scanner(System.in);
			menu = scanner.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("Ingrese el nombre de la pel�cula");
				scanner = new Scanner(System.in);
				nombre = scanner.nextLine();
				
				System.out.println("Ingrese el genero de la pel�cula");
				scanner = new Scanner(System.in);
				genero = scanner.nextLine();
				
				System.out.println("Ingrese la duraci�n de la pel�cula");
				scanner = new Scanner(System.in);
				duracion = scanner.nextDouble();
				
				System.out.println("Ingrese el director de la pel�cula");
				scanner = new Scanner(System.in);
				director = scanner.nextLine();
				
				System.out.println("Ingrese el a�o de lanzamiento de la pel�cula");
				scanner = new Scanner(System.in);
				a�o = scanner.nextInt();
				
				System.out.println("Ingrese la clasificaci�n de la pel�cula");
				scanner = new Scanner(System.in);
				clasificacion = scanner.nextLine();
				
				Pelicula pelicula = new Pelicula(nombre, genero, duracion, director, a�o, clasificacion);
				peliculas.add(pelicula);
				System.out.println("La pel�cula fue creada exitosamente");
				break;
			case 2:
				System.out.println("Ingrese el �ndice de la pel�cula a editar");
				scanner = new Scanner(System.in);
				indice = scanner.nextInt();
				pelicula = peliculas.get(indice);
				do {
					System.out.println("Submenu editar");
					System.out.println("1. Editar nombre");
					System.out.println("2. Editar genero");
					System.out.println("3. Editar duraci�n");
					System.out.println("4. Editar director");
					System.out.println("5. Editar a�o");
					System.out.println("6. Editar clasificaci�n");
					System.out.println("7. Salir");
					scanner = new Scanner(System.in);
					submenu = scanner.nextInt();
					
					switch (submenu) {
					case 1:
						System.out.println("Ingrese el nuevo nombre");
						scanner = new Scanner(System.in);
						nombre = scanner.nextLine();
						pelicula.setNombre(nombre);
						break;
					case 2:
						System.out.println("Ingrese el nuevo genero");
						scanner = new Scanner(System.in);
						genero = scanner.nextLine();
					    pelicula.setGenero(genero);
						break;
					case 3:
						System.out.println("Ingrese la nueva duraci�n");
						scanner = new Scanner(System.in);
						duracion = scanner.nextDouble();
						pelicula.setDuracion(duracion);
						break;
					case 4:
						System.out.println("Ingrese el nuevo director");
						scanner = new Scanner(System.in);
						director = scanner.nextLine();
						pelicula.setDirector(director);
						break;
					case 5:
						System.out.println("Ingrese el nuevo a�o de lanzamiento");
						scanner = new Scanner(System.in);
						a�o = scanner.nextInt();
						pelicula.setA�o(a�o);
						break;
					case 6:
						System.out.println("Ingrese la nueva clasificaci�n");
						scanner = new Scanner(System.in);
						clasificacion = scanner.nextLine();
						pelicula.setClasificacion(clasificacion);
						break;
					case 7:
						System.out.println("Regresando al menu principal...");
						break;

					default:
						System.out.println("Opci�n invalida, intente de nuevo.");
						break;
					}
					
				} while (submenu !=7 );
				peliculas.set(indice, pelicula);
				System.out.println("La pel�cula fue editada exitosamente.");
				
				break;
			case 3:
				System.out.println("Submenu buscar");
				System.out.println("1. Buscar por �ndice de pel�cula");
				System.out.println("2. Buscar por nombre de la pel�cula");
				System.out.println("3. Salir");
				scanner = new Scanner(System.in);
				buscar = scanner.nextInt();
				
				switch (buscar) {
				case 1:
					System.out.println("Ingrese el �ndice a buscar");
					scanner = new Scanner(System.in);
					indice = scanner.nextInt();
					pelicula = peliculas.get(indice);
					System.out.println("Se encontro la pelicula:");
					System.out.println(pelicula);
					break;
				case 2:
					System.out.println("Ingrese el nombre a buscar");
					scanner = new Scanner(System.in);
					nombre = scanner.nextLine();
					for(Pelicula p: peliculas) {	
						if(p.getNombre().equals(nombre)) {
							System.out.println("Se encontro la pelicula:");
							System.out.println(p);
						}						
					}
					break;
				case 3:
					System.out.println("Regresando al menu principal...");
					break;				
				default:
					System.out.println("Opci�n invalida, intentelo de nuevo");
					break;
				}				
				break;
			case 4:
				System.out.println("Ingrese el �ndice de la pel�cula a eliminar");
				scanner = new Scanner(System.in);
				indice = scanner.nextInt();
				peliculas.remove(indice);
				System.out.println("La pel�cula fue eliminda exitosamente");
				break;
			case 5:
				System.out.println("Submenu mostrar");
				System.out.println("1. Mostrar pel�culas");
				System.out.println("2. Mostrar mismo dierector");
				System.out.println("3. Salir");
				scanner = new Scanner(System.in);
				mostrar = scanner.nextInt();
				switch (mostrar) {
				case 1:
					System.out.println(peliculas);
					break;
				case 2:
					System.out.println("Ingrese la busqueda por director");
					scanner = new Scanner(System.in);
					director = scanner.nextLine();
					for(Pelicula p: peliculas) {	
						if(p.getDirector().equals(director)) {
							System.out.println("Se encontro la pelicula:");
							System.out.println(p);
						}						
					}
					break;
				case 3:
					System.out.println("Regresando al menu principal...");
					break;
                    
				default:
					System.out.println("Opci�n invalida, intente de nuevo.");
					break;
				}
				
				break;
			case 6:
				for(Pelicula p: peliculas) {
					System.out.println(p);
				}
				break;
			case 7:
				System.out.println("Saliendo del programa.");
				break;

			default:
				System.out.println("Opci�n invalida, intente de nuevo.");
				break;
			}
		} while (menu != 7);
		
	}

}
