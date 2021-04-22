/**
 * 
 */
package generica;

import java.time.LocalDate;

/**
 * @author Juan
 * @param <T>
 *
 */
public class Generica<T extends Persona> {
	
	private T[][] matriz;
	private int longitud=5;

		
		
	/**
	 * @param matriz		 
	 * 
	 * */
	public Generica() {
		super();
		matriz = (T[][]) new Persona[longitud][longitud];
	}
	
	public void crear(T elemento) {
		for(int i=0; i<longitud; i++)
			for(int j=0; j<longitud; j++)
				matriz[i][j] = elemento;
	}
		
	public void pintar() {
		for(int i=0; i<longitud; i++) {
			for(int j=0; j<longitud; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
		
	public static void main(String[] args) {
		
		Generica<Persona> persona = new Generica<>();
		persona.crear(new Persona("334455y", "Joselito", "Rodriguez",  LocalDate.of(1980, 7, 20)));
		persona.pintar();
			
	}
		
	
	
	
	
	

}
