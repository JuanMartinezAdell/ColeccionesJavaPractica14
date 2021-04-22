/**
 * 
 */
package equipoBasquet;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

/**
 * @author Juan
 *
 */
public class EquipoBasquet {
	
	private TreeMap<Integer, List<String>> equipo; //Creo equipo de jugadores

	/**
	 * @param equipo
	 */
	public EquipoBasquet( ) {
		super();
		this.equipo = new TreeMap();
	}
	
	
	//Añado un jugador
	public void add(Integer dorsal, List<String> jugador) {
	     equipo.put(dorsal, jugador);
	}
	
	//Elimino un jugador
	public void remove(Integer dorsal) {
		equipo.remove(dorsal);
		
	}
	
	//Busco un jugador
	public List<String> buscar(Integer  dorsal) {
		if (equipo.containsKey(dorsal)) {
			return equipo.get(dorsal);
		}
		return null;
	}
	
	public Set<Integer> claves() {
		return equipo.keySet();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EquipoBasquet [equipo=");
		builder.append(equipo);
		builder.append("]");
		return builder.toString();
	}

	public String mostrar() {
		StringBuilder builder = new StringBuilder();
		//Manera 1 de recorrer un Map, a través de las claves
		
		//Saco todas las keys
		Set<Integer> keys = this.claves();
		//Recorro las keys y para cada clave saco su valor
		for(Integer k : keys) {
			builder.append(k + " -> ");
			builder.append(equipo.get(k) + "\n");
		}
		
		return builder.toString();
		
	}


}
