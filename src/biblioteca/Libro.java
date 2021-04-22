/**
 * 
 */
package biblioteca;

/**
 * @author Juan
 *
 */
public class Libro extends Publicacion{
	
	
	/**
	 * 
	 */
	public Libro() {
		
	}

	/**
	 * @param isbn
	 * @param titulo
	 * @param anio
	 * @param paginas
	 * @param prestado
	 */
	public Libro(String isbn, String titulo, int anio, int paginas, boolean prestado) {
		super(isbn, titulo, anio, paginas, prestado);
		
	}

	
	

	
}
