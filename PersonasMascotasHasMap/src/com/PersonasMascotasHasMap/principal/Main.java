package com.PersonasMascotasHasMap.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.PersonasMascotasHasMap.service.ImpMascotas;
import com.PersonasMascotasHasMap.service.ImpPersonas;
import com.mx.PersonasMascotasHasMap.entidad.Mascota;
import com.mx.PersonasMascotasHasMap.entidad.Persona;

public class Main {
public static void main(String[] args) {
	    //Atributos Mascota
		String nombreM;
		int edadM;
		double peso;
		String especie;
		
		//Atributos Personas
		String curp;
		String nombre;
		String apellido;
		int edad;
		String ciudad;
		List<Mascota> mascotas;
		
		int menu, menuM, menuP, submenuM, submenuP, submenuMP, submenuMM;
		Scanner scanner;
		Mascota mascota;
		Persona persona;
		ImpMascotas impM = new ImpMascotas();
		ImpPersonas impP = new ImpPersonas();
		
		do {
			System.out.println("Menu principal");
			System.out.println("1. Menu mascotas");
			System.out.println("2. Menu personas");
			System.out.println("3. Salir");
			scanner = new Scanner(System.in);
			menu = scanner.nextInt();
			
			switch (menu) {
			case 1:
				do {
					//Menu mascotas
					System.out.println("Menu de mascotas");
					System.out.println("1. Guardar");
					System.out.println("2. Editar");
					System.out.println("3. Buscar");
					System.out.println("4. Eliminar");
					System.out.println("5. Mostrar");
					System.out.println("6. Salir");
					scanner = new Scanner(System.in);
					menuM = scanner.nextInt();
					
					switch (menuM) {
					case 1:
						System.out.println("Ingrese el nombre");
						scanner = new Scanner(System.in);
						nombreM = scanner.nextLine();
						System.out.println("Ingrese la edad");
						scanner = new Scanner(System.in);
						edadM = scanner.nextInt();
						System.out.println("Ingrese el peso");
						scanner = new Scanner(System.in);
						peso = scanner.nextDouble();
						System.out.println("Ingrese la especie");
						scanner = new Scanner(System.in);
						especie = scanner.nextLine();
						mascota = new Mascota(nombreM, edadM, peso, especie);
						impM.guardar(mascota);
						break;
					case 2:
						System.out.println("Ingrese el nombre a editar");
						scanner = new Scanner(System.in);
						nombreM = scanner.nextLine();
						mascota = new Mascota();
						mascota.setNombreM(nombreM); // Asignar nombre a la mascota
						mascota = impM.buscar(mascota);
						if(mascota == null) {
							System.out.println("No existe la mascota");
						}
						else {
							do {
								System.out.println("Menu edición mascota");
								System.out.println("1. Nombre");
								System.out.println("2. Edad");
								System.out.println("3. Peso");
								System.out.println("4. Especie");
								System.out.println("5. Salir");
								scanner = new Scanner(System.in);
								submenuM = scanner.nextInt();
								
								switch (submenuM) {
								case 1:
									System.out.println("Ingrese el nuevo nombre");
									scanner = new Scanner(System.in);
									nombreM = scanner.nextLine();
									mascota.setNombreM(nombreM);
									break;
								case 2:
									System.out.println("Ingrese la nueva edad");
									scanner = new Scanner(System.in);
									edadM = scanner.nextInt();
									mascota.setEdadM(edadM);
									break;
								case 3:
									System.out.println("Ingrese el nuevo peso");
									scanner = new Scanner(System.in);
									peso = scanner.nextDouble();
									mascota.setPeso(peso);
									break;
								case 4:
									System.out.println("Ingrese la nueva especie");
									scanner = new Scanner(System.in);
									especie = scanner.nextLine();
									mascota.setEspecie(especie);
									break;
								case 5:
									System.out.println("Regresando al menu principal");
									break;

								default:
									System.out.println("Opción inválida, intente de nuevo");
									break;
								}
							} while (submenuM != 5);
							impM.editar(mascota);
							System.out.println("La mascota fue editada exitosamente");
						}
						break;
					case 3:
						System.out.println("Ingrese el nombre a buscar");
						scanner = new Scanner(System.in);
						nombreM = scanner.nextLine();
						mascota = new Mascota();
						mascota.setNombreM(nombreM);
						mascota = impM.buscar(mascota);
						if(mascota == null) {
							System.out.println("No existe la mascota");
						}
						else {
							System.out.println(mascota);
						}
						break;
					case 4:
						System.out.println("Ingrese el nombre de la mascota a eliminar");
						scanner = new Scanner(System.in);
						nombreM = scanner.nextLine();
						mascota = new Mascota();
						mascota.setNombreM(nombreM);
						impM.eliminar(mascota);
						break;
					case 5:
						impM.mostrar();
						break;
					case 6:
						System.out.println("Regresando el menu principal...");
						break;

					default:
						System.out.println("Opción inválida, intente de nuevo");
						break;
					}
				} while (menuM != 6);
				break;
			case 2:
				do {
					//Menu personas
					System.out.println("Menu de personas");
					System.out.println("1. Guardar");
					System.out.println("2. Editar");
					System.out.println("3. Buscar");
					System.out.println("4. Eliminar");
					System.out.println("5. Mostrar");
					System.out.println("6. Agregar mascota");
					System.out.println("7. Salir");
					scanner = new Scanner(System.in);
					menuP = scanner.nextInt();
					
					switch (menuP) {
					case 1:
						System.out.println("Ingrese la CURP");
						scanner = new Scanner(System.in);
						curp = scanner.nextLine();
						System.out.println("Ingrese el nombre");
						scanner = new Scanner(System.in);
						nombre = scanner.nextLine();
						System.out.println("Ingrese el apellido");
						scanner = new Scanner(System.in);
						apellido = scanner.nextLine();
						System.out.println("Ingrese la edad");
						scanner = new Scanner(System.in);
						edad = scanner.nextInt();
						System.out.println("Ingrese la ciudad");
						scanner = new Scanner(System.in);
						ciudad = scanner.nextLine();
						persona = new Persona(curp, nombre, apellido, edad, ciudad, new ArrayList<Mascota>());
						impP.guardar(persona);
						break;
					case 2:
						System.out.println("Ingrese la CURP de la persona a editar");
						scanner = new Scanner(System.in);
						curp = scanner.nextLine();
						persona = new Persona();
						persona.setCurp(curp);
						persona = impP.buscar(persona);
						if(persona == null) {
							System.out.println("La persona no existe");
						}
						else {
							do {
								System.out.println("Menu edición persona");
								System.out.println("1. CURP");
								System.out.println("2. Nombre");
								System.out.println("3. Apellido");
								System.out.println("4. Edad");
								System.out.println("5. Ciudad");
								System.out.println("6. Salir");
								scanner = new Scanner(System.in);
								submenuP = scanner.nextInt();
								switch (submenuP) {
								case 1:
									System.out.println("Ingrese la nueva CURP");
									scanner = new Scanner(System.in);
									curp = scanner.nextLine();
									persona.setCurp(curp);
									break;
								case 2:
									System.out.println("Ingrese el nuevo nombre");
									scanner = new Scanner(System.in);
									nombre = scanner.nextLine();
									persona.setNombre(nombre);
									break;
								case 3:
									System.out.println("Ingrese el nuevo apellido");
									scanner = new Scanner(System.in);
									apellido = scanner.nextLine();
									persona.setApellido(apellido);
									break;
								case 4:
									System.out.println("Ingrese la nueva edad");
									scanner = new Scanner(System.in);
									edad = scanner.nextInt();
									persona.setEdad(edad);
									break;
								case 5:
									System.out.println("Ingrese la nueva ciudad");
									scanner = new Scanner(System.in);
									ciudad = scanner.nextLine();
									persona.setCiudad(ciudad);
									break;
								case 6:
									System.out.println("Regresando al menu principal...");
									break;

								default:
									System.out.println("Opción inválida, intente de nuevo");
									break;
								}
							} while (submenuP != 6);
							impP.editar(persona);
							System.out.println("La persona fue editada exitosamente");
						}
						break;
					case 3:
						System.out.println("Ingresa la CURP de la persona a buscar");
						scanner = new Scanner(System.in);
						curp = scanner.nextLine();
						persona = new Persona();
						persona.setCurp(curp);
						persona = impP.buscar(persona);
						if(persona == null) {
							System.out.println("No existe la persona");
						}
						else {
							System.out.println(persona);
						}
						break;
					case 4:
						System.out.println("Ingrese la CURP de la persona a eliminar");
						scanner = new Scanner(System.in);
						curp = scanner.nextLine();
						persona = new Persona();
						persona.setCurp(curp);
						impP.eliminar(persona);
						break;
					case 5:
						do {
							System.out.println("Menu mostrar persona");
							System.out.println("1. Normal");
							System.out.println("2. Persona con mas mascotas");
							System.out.println("3. Número de mascotas de una persona");
							System.out.println("4. Mascotas de una misma especie");
							System.out.println("5. Salir");
							scanner = new Scanner(System.in);
							submenuMP = scanner.nextInt();
							
							switch (submenuMP) {
							case 1:
								impP.mostrar();
								break;
							case 2:
								impP.mostrarMasMascotas();
								break;
							case 3:
								impP.numMascotas();
								break;
							case 4:
								System.out.println("Ingrese la especie a buscar: ");
								scanner = new Scanner(System.in);
								especie = scanner.nextLine();
								impM.mostrarMascotasEsp(especie);
								break;
							case 5:
								System.out.println("Regresando al menu principal...");
								break;
							default:
								System.out.println("Opción inválida, intente de nuevo");
								break;
							}
							
						} while (submenuMP != 5);
						break;
					case 6:
						System.out.println("Ingrese el nombre de la mascota");
						scanner = new Scanner(System.in);
						nombreM = scanner.nextLine();
						mascota = new Mascota();
						mascota.setNombreM(nombreM);
						
						System.out.println("Ingrese la CURP de la persona");
						scanner = new Scanner(System.in);
						curp = scanner.nextLine();
						persona = new Persona();
						persona.setCurp(curp);
						persona = impP.buscar(persona);
						persona.getMascotas().add(mascota);
						System.out.println("La mascota fue agregada exitosamente");
						break;
					case 7:
						System.out.println("Regrsando el menu principal...");
						break;
						
					default:
						System.out.println("Opción inválida, intente de nuevo");
						break;
					}
				} while (menuP != 7);
				
				
				break;
			case 3:
				System.out.println("Saliendo del programa.");
				break;
				

			default:
				System.out.println("Opción inválida, intente de nuevo");
				break;
			}
			
		} while (menu !=3 );
}
}
