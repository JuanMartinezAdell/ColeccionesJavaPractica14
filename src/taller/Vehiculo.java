/**
 * 
 */
package taller;

import biblioteca.Publicacion;

/**
 * @author Juan
 *
 */
public class Vehiculo implements Comparable<Vehiculo> {
	
	protected String matricula;
	protected String marca;
	protected String modelo;
	protected String color;
	protected double precio;
	protected int caballos;
	protected boolean reparacion=false;
	
	/**
	 *
	 */
	public Vehiculo( ) {
		super();
		
	}


	/**
	 * @param matricula
	 */
	public Vehiculo(String matricula) {
		super();
		this.matricula = matricula;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
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
		Vehiculo other = (Vehiculo) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getCaballos() {
		return caballos;
	}


	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}


	
	public boolean reparado() {
		
		return this.reparacion = true;
		
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
	public Vehiculo(String matricula, String marca, String modelo, String color, double precio, int caballos,
			boolean reparacion) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.caballos = caballos;
		this.reparacion = reparacion;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehiculo [matricula=");
		builder.append(matricula);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", color=");
		builder.append(color);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", caballos=");
		builder.append(caballos);
		builder.append(", reparado=");
		builder.append(reparacion);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int compareTo(Vehiculo o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
