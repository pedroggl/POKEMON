
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

    public Entrenador(String nombre, Pokemon starter) {
        this.nombre = nombre;
        equipo[0] = starter;
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
