/**
 * 
 */
package taller;

import java.util.Scanner;


/**
 * @author Juan
 * 
 * Se elige le metodo de ordenacion de de binarySearch  ya que junto al TreeMap es el mas eficente, pero aun pensando que el TreeMap que es todavia
 * mas eficiente para este ejercico, ya que poniendo la matricula de key no habria que recorrer todo el conjunto y con este si hay que recorrer
 * toda la lista, me decanto por este por que hay varios ejercicios de TreeMap y queria probar hacerlo con este
 *
 */
public class TestTaller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taller taller = new Taller();
		Vehiculo coche;
		String matricula, marca, modelo, color;
		double precio;
		int caballos;
		boolean reparacion = false;
		
		
		int opcion;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("*--TALLER--*");
			System.out.println("1. Ingresar Coche");
			System.out.println("2. Coche reparado");
			System.out.println("3. Buscar matricula");
			System.out.println("4. Listar coches");
			System.out.println("5. Salir");
			opcion = Integer.parseInt(sc.nextLine()); //Si no escribes un número salta error
			
			switch (opcion) {
			case 1: {
				
				//Introducimos un vehiculo en el taller
				
				System.out.println("Introduce la matricula del vehiculo: ");
				matricula = sc.nextLine();
				System.out.println("Introduce la marca: ");
				marca = sc.nextLine();
				System.out.println("Intorduce el modelo: ");
				modelo = sc.nextLine();
				System.out.println("Introduce el color: ");
				color = sc.nextLine();
				System.out.println("Introduce el precio: ");
				precio = Integer.parseInt(sc.nextLine());
				System.out.println("Introduce los caballos: ");
				caballos = Integer.parseInt(sc.nextLine());
				coche = new Vehiculo(matricula, marca, modelo, color, precio, caballos, reparacion);
				
				taller.addVehiculo(coche);
				
				break;
			}
			
			case 2: {
				//Intorducimos la matricula del coche a buscar
				System.out.println("Introduce la matricula: ");
				matricula = sc.nextLine();
				
				Vehiculo v = taller.buscar(matricula);  //Buscamos el vehiculo en el taller 
				if(v != null && v.getMatricula().equals(matricula)) {//Comprobamos el vehiculo existe
					    v.reparado();
						System.out.println("El vehiculo con matricula " +matricula+" esta reprado");
				}else {
					System.out.println("El vehiculo no esta en el taller");
				}
				
				break;
			}
			case 3: {
				//Intorducimos la matricula del coche a buscar
				System.out.println("Introduce la matricula: ");
				matricula = sc.nextLine();
				
				Vehiculo c = taller.buscar(matricula); //Buscamos el vehiculo en el taller 
				if(c != null && c.getMatricula().equals(matricula)) //Comprobamos el vehiculo existe
						System.out.println("El vehiculo con matricula " +matricula+" esta en el taller");
				else 
					System.out.println("El vehiculo no esta en el taller");
				
				
				break;
			}
			case 4: {
				
				//Imprimimos los vehiculos que hay en taller
				System.out.println(taller);
				
				break;	
			}
			case 5: {
				System.out.println("Hasta pronto");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
			
		} while (opcion != 5);
		
		
	}
	

}
