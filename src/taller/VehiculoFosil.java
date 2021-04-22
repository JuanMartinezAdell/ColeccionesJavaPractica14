/**
 * 
 */
package taller;

/**
 * @author Juan
 *
 */
public class VehiculoFosil extends Vehiculo {
	
	private enum tipoFosil {GASOLINA,DIESEL};
	private int capacidadDep;
	/**
	 * 
	 */
	public VehiculoFosil() {
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
	public VehiculoFosil(String matricula, String marca, String modelo, String color, double precio, int caballos,
			boolean reparacion) {
		super(matricula, marca, modelo, color, precio, caballos, reparacion);
		// TODO Auto-generated constructor stub
	}
	
	public int getCapacidadDep() {
		return capacidadDep;
	}
	public void setCapacidadDep(int capacidadDep) {
		this.capacidadDep = capacidadDep;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VehiculoFosil [capacidadDep=");
		builder.append(capacidadDep);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	

}
