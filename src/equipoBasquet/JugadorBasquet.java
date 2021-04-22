/**
 * 
 */
package equipoBasquet;

/**
 * @author Juan
 *
 */
public class JugadorBasquet {
	
	private String jugador;
	private String posicion;
	
	/**
	 * 
	 */
	public JugadorBasquet( ) {
		super();
		
	}
	
	/**
	 * @param jugador
	 * @param posicion
	 */
	public JugadorBasquet(String jugador, String posicion) {
		super();
		this.jugador = jugador;
		this.posicion = posicion;
	}

	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JugadorBasquet [jugador=");
		builder.append(jugador);
		builder.append(", posicion=");
		builder.append(posicion);
		builder.append("]");
		return builder.toString();
	}

}
