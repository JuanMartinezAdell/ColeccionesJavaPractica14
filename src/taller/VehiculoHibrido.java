/**
 * 
 */
package taller;

/**
 * @author Juan
 *
 */
public class VehiculoHibrido extends Vehiculo{
	
	private int kw;
	private enum tipoFosil {GASOLINA,DIESEL};
	private int capacidadDep;
	/**
	 * 
	 */
	public VehiculoHibrido() {
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
	public VehiculoHibrido(String matricula, String marca, String modelo, String color, double precio, int caballos,
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
	public int getCapacidadDep() {
		return capacidadDep;
	}
	public void setCapacidadDep(int capacidadDep) {
		this.capacidadDep = capacidadDep;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VehiculoHibrido [kw=");
		builder.append(kw);
		builder.append(", capacidadDep=");
		builder.append(capacidadDep);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
