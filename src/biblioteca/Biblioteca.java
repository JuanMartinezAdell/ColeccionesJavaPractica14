/**
 * 
 */
package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.List;

/**
 * @author Juan
 *
 */
public class Biblioteca {
	
	//Añadir una Puvlicacion (Libro o Revista) al catalogo de publicaciones con TreeSet
	
	//No hace falta utilizar el HashSet se pude hacer todo con TreeSet
	
	private List<Publicacion> catalogo;
	private String direccion;
	
		
	public Biblioteca() {
		catalogo = new ArrayList<>();
	}

	
	/**
	 * @param catalogo
	 * @param direccion
	 */
	public Biblioteca(String direccion) {
		super();
		this.catalogo = new ArrayList<>();
		this.direccion = direccion;
	}



	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}


	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	/**
	 * @return the catalogo
	 */
	public List<Publicacion> getCatalogo() {
		return catalogo;
	}
	
	
	/**
	 * Añade una Publicacion (Libro o Revista) al catálogo de publicaciones
	 * @param unaPub
	 */
	public void adquirirMaterial(Publicacion unaPub) {
		if(!catalogo.contains(unaPub)) //No añadimos repetidos. Para la busqueda binaria
			catalogo.add(unaPub);
		
		//Ordenamos la lista cada vez que añado un elmemto
		Collections.sort(catalogo);
	}
	
	
	/**
	 * Busca por título una Publicación dentro del catálogo. Lo reccorremos entero.
	 * @param titulo
	 * @return
	 */
	public Publicacion buscar(String titulo) {
		/*
		for(Publicacion pub : catalogo) {
			if (pub.getTitulo().equals(titulo))
				return pub;
		}
		*/
		
		//Le paso la lista y un objeto publicacion y busca por el equals
		int posicion = Collections.binarySearch(catalogo, new Publicacion("",titulo,2021,100, false));
		if (posicion >= 0)
			return catalogo.get(posicion);


		return null;
	}
	
	/**
	 * Busca por título una Publicación dentro del catálogo. Lo reccorremos entero.
	 * @param titulo
	 * @return
	 
	public List<Publicacion> buscar(String nombre, String apellidos) {
		
		List<Publicacion> lista = new ArrayList<>();
		//Si hay que recorrer todas las publicaciones no es del todo eficiente
		
		for(Publicacion p : catalogo) {
			if (p.getAutor().contains(new Autor(nombre,apellidos))) {
				lista.add(p);
			}
		}
	}*/
	
	
	/**
	 * Se recorre todas las publicaciones y devuelve una lista con aquellas
	 * en las que aparece el autor como autor de la misma
	 * @param autor
	 * @return
	 */
	public List<Publicacion> buscar(Autor autor){
		List<Publicacion> pubs = new ArrayList<>();
		boolean encontrado = false;
		//No es realmente eficiente
		for(Publicacion p: catalogo) {
			encontrado = false;
			for(Autor a : p.getAutores()) {
				if(a.equals(autor)) {
					//Añadimos la publicacion a la que ha escrito el autror
					pubs.add(p);
					break;
				}
			}
			
				
				
			/*System.out.println("Publicacion" + p);
			System.out.println("Autores: ");
			for(Autor  a : p.getAutor()) {
				System.out.println(" "Publis: "+ a + a.getPublicaciones());
			}
			System.out.println("Autores" + p.getAutor());*/
		}
		
		
		return pubs;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Biblioteca [catalogo=");
		for(Publicacion p : catalogo)
			builder.append(p + System.getProperty("line.separator")); 
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append("]");
		return builder.toString();
	}
	

}
