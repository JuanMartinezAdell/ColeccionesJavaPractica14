/**
 * 
 */
package taller;

/**
 * @author Juan
 *
 */
public class VehiculoElectrico extends Vehiculo{
	
	private int kw;

	/**
	 * 
	 */
	public VehiculoElectrico() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param precio
	 * @param caballos
	 * @param reparacion
	 */
	public VehiculoElectrico(String matricula, String marca, String modelo, String color, double precio, int caballos,
			boolean reparacion) {
		super(matricula, marca, modelo, color, precio, caballos, reparacion);
		// TODO Auto-generated constructor stub
	}

	public int getKw() {
		return kw;
	}

	public void setKw(int kw) {
		this.kw = kw;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VehiculoElectrico [kw=");
		builder.append(kw);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}
