/**
 * 
 */
package agenda;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


/**
 * @author Juan
 *
 */
public class TestAgenda {

	/**
	 * @param <UtilsMap>
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		String nombre;
		String telefono;
		
		
		Scanner opciones = new Scanner(System.in);
		
	    Agenda agen = new Agenda();
		
		do {
			System.out.println("AGENDA TELEF0NICA\n"
					+ "-----------------\n"
					+ "1. Añadir nuevo contacto\n"
					+ "2. Listar contactos\n"
					+ "3. Buscar contacto\n"
					+ "4. Eliminar contacto\n"
					+ "5. Salir\n"
					+ "Elige una opcion:");
			opcion = Integer.parseInt(opciones.nextLine());
			
			switch(opcion) {
				case 1:
					
					System.out.println("Introduce un nombre: ");
					nombre = opciones.nextLine();
					System.out.println("Introduce un numero de telefono: ");
					telefono = opciones.nextLine();
					agen.addContacto(nombre , telefono);
					break;
					
				case 2:
					System.out.println("Mostrar agenda: \n");
					System.out.println(agen);
					break;
					
				case 3:
					System.out.println("Introduce un nombre: ");
					nombre = opciones.nextLine();
					
					System.out.println(agen.buscar(nombre));
					
					break;
				case 4:
					System.out.println("Introduce un nombre: ");
					nombre = opciones.nextLine();						
					agen.eliminarContacto(nombre);
					
					break;
					
				case 5:
					System.out.println("Usted acaba de salir del programa.");
					break;
			}
		}while(!(opcion == 5));
	
	}

}
