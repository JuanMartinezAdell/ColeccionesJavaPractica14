/**
 * 
 */
package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;


/**
 * @author Juan
 *
 */
public class Publicacion implements Prestable, Comparable<Publicacion> {
	
	
	private boolean prestado;
	
	private String isbn;
	private String titulo;
	private int anio;
	private int paginas;

	private TreeSet<Autor> autor;
	

	//Compareto y bynariSearch mirar los ejemplos
	
	//Se utiliza comparable y se implemtea bynariserch
	
	/**
	 * 
	 */
	public Publicacion() {
		
	
	}
	

	/**
	 * @param isbn
	 * @param titulo
	 * @param anio
	 * @param paginas
	 * @param autores
	 */
	public Publicacion(String isbn, String titulo, int anio, int paginas, boolean prestado ) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.anio = anio;
		this.paginas = paginas;
		this.prestado = prestado;
		this.autor = new TreeSet<>();
	}


	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	

	public boolean isPrestado() {
		return prestado;
	}


	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	//Metodos prestado
	


	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Publicacion [prestado=");
		builder.append(prestado);
		builder.append(", isbn=");
		builder.append(isbn);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", anio=");
		builder.append(anio);
		builder.append(", paginas=");
		builder.append(paginas);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicacion other = (Publicacion) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
	@Override
	public void presta() {
		this.prestado = true;

	}

	@Override
	public void devuelve() {
		this.prestado = false;

	}

	@Override
	public boolean estaPrestado() {
		
		return prestado;
	}
	
	
	

	@Override
	public int compareTo(Publicacion o) {
		// TODO Auto-generated method stub
		return this.getTitulo().compareTo(o.getTitulo()); //Ordena las publicaciones por titulo alfabeticamente
	}
	
	//Metodo añadir autor
	public void addAutor(String nombre, String apellidos) {
		
		Autor a = new Autor(nombre, apellidos);
		//autor.add(new Autor(nombre, apellidos));      //Con este tendria dado un libro los autor  y dado un autot los libros
		autor.add(a);	 //No hace falta constains						
	}
	
	//Metodo delete Autor
	public boolean removeAutor(String nombre, String apellidos) {
		return autor.remove(new Autor(nombre, apellidos));
	}
	
	//Metodo getAutor
	/**
	* Devuelve el conjunto de autores
    * @return
    */
	public TreeSet<Autor> getAutores(){
		return autor;
	}
	
	
	
	
	
	
	/**
	 * Devuelve un conjunto ordenado de publicaciones,
	 * @param zona
	 * @return
	 *
	public TreeSet<Autor> buscarOrdenadoNombre(String nombre) {
		//Crear un TreeSet
		//Le paso el Comparator como una clase anónima con el método compare únicamente
		TreeSet<Autor> autor = new TreeSet<>( new Comparator<Autor>() {
				@Override
				public int compare(Autor o1, Autor o2) {
					return o1.getNombre().compareTo(o2.getNombre());
				}
		});
		
		//Recorrer todos los hoteles, y si coincide la zona meto ese hotel en el TreeSet
		for(Autor a : autor) {
			//Si coincide la zona lo añado al TreeSet
			if (a.getNombre().equals(nombre)) {
				autor.add(a); //Ya lo añade ordenado
			}
		}
		
		//Devolver el TreeSet
		return autor;
	}*/
}
