package pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Atributos
		String nombre;
		String continente;
		String capital;
		int poblacion;
		String idioma;
		double territorio;

		List<Pais> paises = new ArrayList<Pais>();
		Pais pais1 = new Pais();
		Scanner scanner;
		int menu, indice, submenu;
		boolean bandera;

		do {
			System.out.println("Menu de paises");
			System.out.println("1. Guardar");
			System.out.println("2. Editar");
			System.out.println("3. Buscar");
			System.out.println("4. Eliminar");
			System.out.println("5. Mostrar");
			System.out.println("6. Listar");
			System.out.println("7. Salir");
			scanner = new Scanner(System.in);
			while (!scanner.hasNextInt()) {
				System.out.println("Neseita un entero. Intente de nuevo");
				scanner.next();
			}
			menu = scanner.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Ingrese el nombre del país");
				scanner = new Scanner(System.in);
				nombre = scanner.nextLine();

				System.out.println("Ingrese el continente del país");
				scanner = new Scanner(System.in);
				continente = scanner.nextLine();

				System.out.println("Ingrese la capital del país");
				scanner = new Scanner(System.in);
				capital = scanner.nextLine();

				System.out.println("Ingrese la población del país");
				scanner = new Scanner(System.in);
				poblacion = scanner.nextInt();

				System.out.println("Ingrese el idioma del país");
				scanner = new Scanner(System.in);
				idioma = scanner.nextLine();

				System.out.println("Ingrese el territorio del país");
				scanner = new Scanner(System.in);
				territorio = scanner.nextDouble();

				Pais pais = new Pais(nombre, continente, capital, poblacion, idioma, territorio);
				bandera = false;
				for (Pais p : paises) {
					if (p.getNombre().equals(nombre)) {
						bandera = true;
						break;
					}
				}
				if (bandera) {
					System.out.println("El pais ya existe, intente con otro pais");
				} else {
					paises.add(pais);
					System.out.println("El país fue agregado exitosamente");
				}

				break;
			case 2:
				if (paises.isEmpty()) {
					System.out.println("No hay datos");
				} else {
					System.out.println("Ingrese el índice del pais a editar");
					scanner = new Scanner(System.in);
					indice = scanner.nextInt();
					if (indice < 0 || indice >= paises.size()) {
						System.out.println("El indice es invalido, intente de nuevo");
					}

					else {
						pais = paises.get(indice);
						do {
							System.out.println("Menu edición");
							System.out.println("1. Nombre");
							System.out.println("2. Continente");
							System.out.println("3. Capital");
							System.out.println("4. Población");
							System.out.println("5. Idioma");
							System.out.println("6. Extensión territorial");
							System.out.println("7. Salir");
							scanner = new Scanner(System.in);
							submenu = scanner.nextInt();
							switch (submenu) {
							case 1:
								System.out.println("Ingrese el nuevo nombre");
								scanner = new Scanner(System.in);
								nombre = scanner.nextLine();
								pais.setNombre(nombre);
								break;
							case 2:
								System.out.println("Ingrese el nuevo continente");
								scanner = new Scanner(System.in);
								continente = scanner.nextLine();
								pais.setContinente(continente);
								break;
							case 3:
								System.out.println("Ingrese la nueva capital");
								scanner = new Scanner(System.in);
								capital = scanner.nextLine();
								pais.setCapital(capital);
								break;
							case 4:
								System.out.println("Ingrese la nueva población");
								scanner = new Scanner(System.in);
								poblacion = scanner.nextInt();
								pais.setPoblacion(poblacion);
								break;
							case 5:
								System.out.println("Ingrese el nuevo idioma");
								scanner = new Scanner(System.in);
								idioma = scanner.nextLine();
								pais.setIdioma(idioma);
								break;
							case 6:
								System.out.println("Ingrese la nueva extensión territorial");
								scanner = new Scanner(System.in);
								territorio = scanner.nextDouble();
								pais.setTerritorio(territorio);
								break;
							case 7:
								System.out.println("Regresando al menu principal...");
								break;

							default:
								System.out.println("Opción invalida, intente denuevo");
								break;
							}

						} while (submenu != 7);
						paises.set(indice, pais);
						System.out.println("El pais fue editado exitosamente");
					}
				}
				break;
			case 3:
				if (paises.isEmpty()) {
					System.out.println("No hay datos");
				} else {
					System.out.println("Ingrese el índice a buscar");
					scanner = new Scanner(System.in);
					indice = scanner.nextInt();
					if (indice < 0 || indice >= paises.size()) {
						System.out.println("El indice es invalido, intente de nuevo");
					} else {
						pais = paises.get(indice);
						System.out.println("Se encontro el pais");
						System.out.println(pais);
					}
				}
				break;
			case 4:
				if (paises.isEmpty()) {
					System.out.println("No hay datos");
				} else {
					System.out.println("Ingrese el índice a eliminar");
					scanner = new Scanner(System.in);
					indice = scanner.nextInt();
					if (indice < 0 || indice >= paises.size()) {
						System.out.println("El indice es invalido, intente de nuevo");
					} else {
						paises.remove(indice);
						System.out.println("El pais fue eliminado exitosamente");
					}
				}
				break;
			case 5:
				if (paises.isEmpty()) {
					System.out.println("No hay datos");
				} else {
					System.out.println(paises);
				}
				break;
			case 6:
				if (paises.isEmpty()) {
					System.out.println("No hay datos");
				} else {
					for (Pais p : paises) {
						System.out.println(p);
					}
				}

				break;
			case 7:
				System.out.println("Saliendo del programa");

				break;

			default:
				System.out.println("Valor invalido, intente de nuevo");
				break;
			}
		} while (menu != 7);

	}

}
