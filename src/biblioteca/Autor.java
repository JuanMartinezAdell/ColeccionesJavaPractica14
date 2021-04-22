/**
 * 
 */
package biblioteca;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

/**
 * @author Juan
 *
 */
public class Autor implements Comparable<Autor>{
	
	//En vez de un array List un TreeSet
	private String nombre;
	private String apellidos;
	private String ciudad;
	private int edad;
	private String email;
	private List<Publicacion> librosPublicados;
	//private TreeSet<Publicacion> publicaiones;

	
	//Constructores
	/**
	 *
	 */
	public Autor( ) {
		super();
		
	}
	
	//Cuando hagamos binariSearch hacerlo igual que el equals si no no funciona la busqueda
	/**
	 * Constructor se le pasa solo nombre y apellidos para utilizarlo para la busqueda
	 * 
	 * @param nombre
	 * @param apellidos
	 * 
	 */
	public Autor(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ciudad = " ";
		this.edad = 0;
		this.email =" ";
		//this.publicaiones= new TreeSet<>(); //Al ser Trreset  Autor tiene que implemear comparable 
			
	}
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param ciudad
	 * @param edad
	 * @param email
	 */
	public Autor(String nombre, String apellidos, String ciudad, int edad, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ciudad = ciudad;
		this.edad = edad;
		this.email = email;
	}


	//Getters y Setters

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
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	//Metodo V1
	/*public List<Publicacion> getLibrosPublicados() {
		return librosPublicados;
	}*/
	
	/**
	 * Devuelve el conjunto de libros publicados
	 * @return
	 */
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autor [nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", ciudad=");
		builder.append(ciudad);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", email=");
		builder.append(email);		
		builder.append("]");
		return builder.toString();
	} 
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Autor other = (Autor) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	
   //Se le pasa nombre y apellidos por que equals se ha hecho con nombre y apellidos
	public List<Publicacion> getLibrosPublicados() {
		return librosPublicados;
	}
	
	/*public void addAutor(String Nombre, String Apellidos) {
		if(!autores.constains(new Autor(nombre, apellido)))
			
	}*/
	
	public int compareTo(Autor o) {
		return this.getApellidos().compareTo(o.getApellidos());
	}
	
	
}
