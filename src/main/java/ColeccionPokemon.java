
/**
 *
 * @author Pedro G Gallardo
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ColeccionPokemon {

    ArrayList<Pokemon> pokemones = new ArrayList<>();

    public ColeccionPokemon() {
        //Pokemon(Pokedex pokemon, int hp, int ataque, int defensa, int ataqueEsp, int defensaEsp, int velocidad) {
        pokemones.add(new Pokemon(Pokedex.BULBASAUR, 45, 49, 49, 65, 65, 45));
        pokemones.add(new Pokemon(Pokedex.IVYSAUR, 60, 62, 63, 80, 80, 60));
        pokemones.add(new Pokemon(Pokedex.VENUSAUR, 80, 82, 83, 100, 100, 80));
        pokemones.add(new Pokemon(Pokedex.CHARMANDER, 39, 52, 43, 60, 50, 65));
        pokemones.add(new Pokemon(Pokedex.CHARMELEON, 58, 64, 58, 80, 65, 80));
        pokemones.add(new Pokemon(Pokedex.CHARIZARD, 78, 84, 78, 109, 85, 100));
        pokemones.add(new Pokemon(Pokedex.SQUIRTLE, 44, 48, 65, 50, 64, 43));
        pokemones.add(new Pokemon(Pokedex.WARTORTLE, 59, 63, 80, 65, 80, 58));
        pokemones.add(new Pokemon(Pokedex.BLASTOISE, 79, 83, 100, 85, 105, 78));
        pokemones.add(new Pokemon(Pokedex.CATERPIE, 45, 30, 35, 20, 20, 45));
        pokemones.add(new Pokemon(Pokedex.METAPOD, 50, 20, 55, 25, 25, 30));
        pokemones.add(new Pokemon(Pokedex.BUTTERFREE, 60, 45, 50, 90, 80, 70));
        pokemones.add(new Pokemon(Pokedex.WEEDLE, 40, 35, 30, 20, 20, 50));
        pokemones.add(new Pokemon(Pokedex.KAKUNA, 45, 25, 50, 25, 25, 35));
        pokemones.add(new Pokemon(Pokedex.BEEDRILL, 65, 90, 40, 45, 80, 75));
    }

    public Pokemon getPokemon(String nombre) throws Exception {
        Iterator iter = pokemones.iterator();
        while (iter.hasNext()) {
            Pokemon pokemon = (Pokemon) iter.next();
            if (pokemon.getNombrePokemon().equals(nombre.toUpperCase())) {
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
            if (pokemon.getNombrePokemon().equals(nombre.toString())) {
                return pokemon;
            }
        }
        throw new Exception("Error, el pokemon que indicas no existe");
    }
}
