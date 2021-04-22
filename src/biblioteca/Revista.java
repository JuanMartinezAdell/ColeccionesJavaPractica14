/**
 * 
 */
package biblioteca;

/**
 * @author Juan
 *
 */
public class Revista extends Publicacion {

	private int numero;
	
	
	/**
	 * @param
	 */
	public Revista( ) {
		
	}

	

	/**
	 * @param isbn
	 * @param titulo
	 * @param anio
	 * @param paginas
	 * @param prestado
	 */
	public Revista(String isbn, String titulo, int anio, int paginas, int numero, boolean prestado) {
		super(isbn, titulo, anio, paginas, prestado);
		// TODO Auto-generated constructor stub
		this.numero = numero;
	}



	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Revista [numero=");
		builder.append(numero);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}


}
