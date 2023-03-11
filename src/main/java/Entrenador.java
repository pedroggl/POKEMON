
/**
 *
 * @author DAW
 */
import java.util.ArrayList;

public class Entrenador {

    private final String nombre;
    private int medallas = 0;
    private Pokemon[] equipo = new Pokemon[6];
    private ArrayList<Pokemon> cajaPokemon = new ArrayList<Pokemon>();
    private ColeccionPokemon coleccion = new ColeccionPokemon();

    public Entrenador(String nombre, String starter) throws Exception {
        try {
            this.nombre = nombre;
            if (coleccion.getPokemon(starter) != null) {
                equipo[0] = coleccion.getPokemon(starter);
            }
        } catch (Exception e) {
            System.out.println("Error al iniciar entrenador");
            throw e;
        }
    }

    public void capturaPokemon(Pokemon pokemon) {
        boolean cond = true;
        int i = 0;
        try {
            while (cond) {
                if (equipo[i] == null) {
                    equipo[i] = pokemon;
                    cond = false;
                }
                i++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Equipo lleno, el pokemon se va a guardar en la caja");
            cajaPokemon.add(pokemon);
        }
    }
}
