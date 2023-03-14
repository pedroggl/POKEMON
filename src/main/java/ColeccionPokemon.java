
/**
 *
 * @author galla
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ColeccionPokemon {

    ArrayList<Pokemon> pokemones = new ArrayList<>();

    public ColeccionPokemon() {
        //Pokemon(Pokedex pokemon, int hp, int ataque, int defensa, int ataqueEsp, int defensaEsp, int velocidad) {
        pokemones.add(new Pokemon(Pokedex.BULBASAUR, 45, 49, 49, 65, 65, 45));
        pokemones.add(new Pokemon(Pokedex.CHARMANDER, 39, 52, 43, 60, 50, 65));
        pokemones.add(new Pokemon(Pokedex.SQUIRTLE, 44, 48, 65, 50, 64, 43));
    }

    public Pokemon getPokemon(String nombre) throws Exception {
        Iterator iter = pokemones.iterator();
        while (iter.hasNext()) {
            Pokemon pokemon = (Pokemon) iter.next();
            if (pokemon.getNombrePokemon().equals(nombre)) {
                return pokemon;
            }
        }
        throw new Exception("Error, el pokemon que indicas no existe");
    }

    //definicion del metodo por polimorfismo
    public Pokemon getPokemon(Pokedex nombre) throws Exception {
        Iterator iter = pokemones.iterator();
        while (iter.hasNext()) {
            Pokemon pokemon = (Pokemon) iter.next();
            if (pokemon.getNombrePokemon().equals(nombre)) {
                return pokemon;
            }
        }
        throw new Exception("Error, el pokemon que indicas no existe");
    }
}
