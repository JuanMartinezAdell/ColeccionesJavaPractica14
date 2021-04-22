/**
 * 
 */
package equipoBasquet;

import java.util.Arrays;

/**
 * @author Juan
 *
 */
public class TestJugador {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EquipoBasquet equipo = new EquipoBasquet();
		
		equipo.add(4, Arrays.asList("Gasol","pivot")); //Devuelve un List<String>
		equipo.add(22, Arrays.asList("Jordan", "alapivot"));
		equipo.add(10, Arrays.asList("Jose", "base"));
		equipo.add(1, Arrays.asList("Emilio", "escolta"));
		equipo.add(5, Arrays.asList("Manolo", "base"));
		
		System.out.println(equipo);
		System.out.println(equipo.buscar(22));
		System.out.println(equipo.claves());
		System.out.println(equipo.mostrar());
		
		equipo.remove(1);
		
		System.out.println(equipo);
		System.out.println(equipo.claves());
		System.out.println(equipo.mostrar());
		
	}

}
