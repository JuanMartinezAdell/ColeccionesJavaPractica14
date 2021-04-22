/**
 * 
 */
package generica;

import java.time.LocalDate;

/**
 * @author Juan
 *
 */
public class Persona {
	
	private String din;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	
	
	/**
	 * 
	 */
	public Persona() {
		super();
	}

	/**
	 * @param din
	 * @param nombre
	 * @param apellidos
	 * @param fechaNacimiento
	 */
	public Persona(String din, String nombre, String apellidos, LocalDate fechaNacimiento) {
		super();
		this.din = din;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDin() {
		return din;
	}

	public void setDin(String din) {
		this.din = din;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [din=");
		builder.append(din);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
