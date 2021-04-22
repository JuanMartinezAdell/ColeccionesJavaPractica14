/**
 * 
 */
package agenda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import biblioteca.Publicacion;

/**
 * @author Juan
 *
 */
public class Agenda {
	
	/**
	 * Atributos
	 */
	//private ArrayList<Contacto> agenda;
	private TreeMap<String, String> contactos; //Creamos el atributo Trremap de telh, nombre y apellidos
	
	
	/**
	 * Constructor
	 */
	public Agenda() {
		//agenda = new ArrayList<Contacto>(Agenda.maximo);
		this.contactos = new TreeMap<>();
	}
	
	
	//Metodo añado contacto 
	public void addContacto(String contacto, String telf) {
		
		contactos.put(contacto, telf);
			
	}
	
	//Metodo buscar contactos por nombre
	public String buscar(String contac) {
		if (contactos.containsKey(contac)) { //Busco contacto por su nombre
			return contactos.get(contac);
		}
		
		return null;
	}
	
	/*Metodo buscar contactos por parte del nombre o apellidos
	public  List<String> buscarContactos(String nombreSubstr) {
		//boolean busqueda= nombreSubstr.contains.(contactos);   
		//if(contactos.containsKey(nombreSubstr))				
	//	if(busqueda)
			//return contactos.get(nombreSubstr);
		
		//return null;
		
	}*/
	
	//Metodo eliminar contactos
	public void eliminarContacto(String contac) {
		if (contactos.containsKey(contac))  //Elimino por nombre o por telefono
			contactos.remove(contac);	
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Agenda: \n");
		builder.append(contactos);
		builder.append("\n");
		return builder.toString();
	}


	
	

}
