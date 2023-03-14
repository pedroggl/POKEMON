
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
            e = new Exception("Error al iniciar entrenador");
            throw e;
        }
    }

    public Entrenador(String nombre, Pokedex starter) throws Exception {
        try {
            this.nombre = nombre;
            if (coleccion.getPokemon(starter) != null) {
                equipo[0] = coleccion.getPokemon(starter);
            }
        } catch (Exception e) {
            e = new Exception("Error al iniciar entrenador");
            throw e;
        }
    }

    public void capturaPokemon(Pokedex pokemon) throws Exception {
        boolean cond = true;
        int i = 0;
        try {
            while (cond) {
                if (equipo[i] == null) {
                    equipo[i] = coleccion.getPokemon(pokemon);
                    cond = false;
                }
                i++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Equipo lleno, el pokemon se va a guardar en la caja");
            cajaPokemon.add(coleccion.getPokemon(pokemon));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    //metodo aplicado por polimorfismo
    public void capturaPokemon(String pokemon) throws Exception {
        boolean cond = true;
        int i = 0;
        try {
            while (cond) {
                if (equipo[i] == null) {
                    equipo[i] = coleccion.getPokemon(pokemon);
                    cond = false;
                }
                i++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Equipo lleno, el pokemon se va a guardar en la caja");
            cajaPokemon.add(coleccion.getPokemon(pokemon));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void muestraEquipo() {
        int i = 0;
        while (equipo[i] != null) {
            equipo[i].muestraStats();
            i++;
        }
    }

}
