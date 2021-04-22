/**
 * 
 */
package taller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import biblioteca.Autor;
import biblioteca.Publicacion;

/**
 * @author Juan
 *
 */
public class Taller {
	
	private List<Vehiculo> taller;

	/**
	 * @param reparado
	 */
	public Taller( ) {
		
		taller = new ArrayList<>();
		
	}

	
	//Metodo ingresar Vehiculo
	/**
	 * Añade una Publicacion (Libro o Revista) al catálogo de publicaciones
	 * @param unaPub
	 */
	public void addVehiculo (Vehiculo coche ) {
		if(!taller.contains(coche)) //No añadimos repetidos. Para la busqueda binaria
			taller.add(coche);
		
		//Ordenamos la lista cada vez que añado un elmemto
		Collections.sort(taller);
	}
	
	
	public void removeVehiculo (Vehiculo coche) {
		
		taller.remove(coche);
	}
	
	/**
	 * Busca por matricula  todos los Vehiculos por matricula dentro del taller. Lo reccorremos entero.
	 * 
	 * Se elige este metodo ordenacion ya que junto al TreeMap es el mas eficente, pero aun pensando que el TreeMap es todavia
	 * mas eficiente que este ya que poniendo la matricula de key no habria que recorrer todo el conjunto y con este si hay que recorrer
	 * toda la lista, me decanto por este por que hay varios ejercicios de TreeMap y queria probar hacerlo con este
	 * 
	 * @param coche
	 * @return
	 */
	public Vehiculo buscar(String matricula) {
		
		//Le paso la lista y un objeto publicacion y busca por el equals
		int posicion = Collections.binarySearch(taller, new Vehiculo(matricula));
		if (posicion >= 0)
			return taller.get(posicion);

		return null;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nTaller : ");
		for (Vehiculo v : taller)
			builder.append(v + System.getProperty("line.separator"));
		builder.append("]");
		return builder.toString();
	}

	
}
