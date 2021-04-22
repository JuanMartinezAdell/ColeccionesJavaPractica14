/**
 * 
 */
package paises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * @author Juan
 *
 */
public class Visitado {
	
		private HashMap<String, List<String>> misCiudades;
	
		public Visitado() {
			misCiudades = new HashMap<>();
		}
	
		public void addPais(String nombre) {
			misCiudades.put(nombre, new ArrayList<String>());
		}
	
		public void addCiudad(String pais, String ciudad) {
			if (!misCiudades.get(pais).contains(ciudad)) //Si no la he visitado, la a�ado
				misCiudades.get(pais).add(ciudad);
		}
	
		public void mostrarVisitados() {
			//Lo recorremos a trav�s de sus claves. Un Set de lo que sea la clave del Map
			Set<String> paises = misCiudades.keySet();
			for(String pais : paises) {
				System.out.println("- " + pais + ": " + misCiudades.get(pais));
			}
		}

		public boolean heVisitado(String pais, String ciudad) {
			Set<String> paises = misCiudades.keySet();
			if (!paises.contains(pais)) {
				//No he estado ni siquiera en ese pa�s
				return false;
			} else {
				//He visitado el pa�s, y la ciudad?
				if(misCiudades.get(pais).contains(ciudad))
					return true;
				else 
					return false;
			}
		
		}

}
