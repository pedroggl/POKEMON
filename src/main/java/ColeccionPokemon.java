
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
        pokemones.add(new Pokemon(Pokedex.PIDGEY, 40, 45, 40, 35, 35, 56));
        pokemones.add(new Pokemon(Pokedex.PIDGEOTTO, 63, 60, 55, 50, 50, 71));
        pokemones.add(new Pokemon(Pokedex.PIDGEOT, 83, 80, 75, 70, 70, 101));
        pokemones.add(new Pokemon(Pokedex.RATTATA, 30, 56, 35, 25, 35, 72));
        pokemones.add(new Pokemon(Pokedex.RATICATE, 55, 81, 60, 50, 70, 97));
        pokemones.add(new Pokemon(Pokedex.SPEAROW, 40, 60, 30, 31, 31, 70));
        pokemones.add(new Pokemon(Pokedex.FEAROW, 65, 90, 65, 61, 61, 100));
        pokemones.add(new Pokemon(Pokedex.EKANS, 35, 60, 44, 40, 54, 55));
        pokemones.add(new Pokemon(Pokedex.ARBOK, 60, 95, 69, 65, 79, 80));
        pokemones.add(new Pokemon(Pokedex.PIKACHU, 45, 80, 50, 75, 60, 120));
        pokemones.add(new Pokemon(Pokedex.RAICHU, 60, 90, 55, 90, 80, 110));
        pokemones.add(new Pokemon(Pokedex.SANDSHREW, 50, 75, 85, 20, 30, 40));
        pokemones.add(new Pokemon(Pokedex.SANDSLASH, 75, 100, 110, 45, 55, 65));
        pokemones.add(new Pokemon(Pokedex.NIDORAN, 55, 47, 52, 40, 40, 41));
        pokemones.add(new Pokemon(Pokedex.NIDORINA, 70, 62, 67, 55, 55, 56));
        pokemones.add(new Pokemon(Pokedex.NIDOQUEEN, 90, 92, 87, 75, 85, 76));
        pokemones.add(new Pokemon(Pokedex.NIDORINO, 61, 72, 57, 55, 55, 65));
        pokemones.add(new Pokemon(Pokedex.NIDOKING, 81, 102, 77, 85, 75, 85));
        pokemones.add(new Pokemon(Pokedex.CLEFAIRY, 70, 45, 48, 60, 65, 35));
        pokemones.add(new Pokemon(Pokedex.CLEFABLE, 95, 70, 73, 95, 90, 60));
        pokemones.add(new Pokemon(Pokedex.VULPIX, 38, 41, 40, 50, 65, 65));
        pokemones.add(new Pokemon(Pokedex.NINETALES, 73, 76, 75, 81, 100, 100));
        pokemones.add(new Pokemon(Pokedex.JIGGLYPUFF, 115, 45, 20, 45, 25, 20));
        pokemones.add(new Pokemon(Pokedex.WIGGLYTUFF, 140, 70, 45, 85, 50, 45));
        pokemones.add(new Pokemon(Pokedex.ZUBAT, 40, 45, 35, 30, 40, 55));
        pokemones.add(new Pokemon(Pokedex.GOLBAT, 75, 80, 70, 65, 75, 90));
        pokemones.add(new Pokemon(Pokedex.ODDISH, 45, 50, 55, 75, 65, 30));
        pokemones.add(new Pokemon(Pokedex.GLOOM, 60, 65, 70, 85, 75, 40));
        pokemones.add(new Pokemon(Pokedex.VILEPLUME, 75, 80, 85, 110, 90, 50));
        pokemones.add(new Pokemon(Pokedex.PARAS, 35, 70, 55, 45, 55, 25));
        pokemones.add(new Pokemon(Pokedex.PARASECT, 60, 95, 80, 60, 80, 30));
        pokemones.add(new Pokemon(Pokedex.VENONAT, 60, 55, 50, 40, 55, 45));
        pokemones.add(new Pokemon(Pokedex.VENOMOTH, 70, 65, 60, 90, 75, 90));
        pokemones.add(new Pokemon(Pokedex.DIGLETT, 10, 55, 25, 35, 45, 95));
        pokemones.add(new Pokemon(Pokedex.DUGTRIO, 35, 100, 50, 50, 70, 120));
        pokemones.add(new Pokemon(Pokedex.MEOWTH, 40, 45, 35, 40, 40, 90));
        pokemones.add(new Pokemon(Pokedex.PERSIAN, 5, 70, 60, 65, 65, 115));
        pokemones.add(new Pokemon(Pokedex.PSYDUCK, 50, 52, 48, 65, 50, 55));
        pokemones.add(new Pokemon(Pokedex.GOLDUCK, 80, 82, 78, 95, 80, 85));
        pokemones.add(new Pokemon(Pokedex.MANKEY, 40, 80, 35, 35, 45, 70));
        pokemones.add(new Pokemon(Pokedex.PRIMEAPE, 65, 105, 60, 60, 70, 95));
        pokemones.add(new Pokemon(Pokedex.GROWLITHE, 55, 70, 45, 70, 50, 60));
        pokemones.add(new Pokemon(Pokedex.ARCANINE, 90, 110, 80, 100, 80, 95));
        pokemones.add(new Pokemon(Pokedex.POLIWAG, 40, 50, 40, 40, 40, 90));
        pokemones.add(new Pokemon(Pokedex.POLIWHIRL, 65, 65, 65, 50, 50, 90));
        pokemones.add(new Pokemon(Pokedex.POLIWRATH, 90, 95, 95, 70, 90, 70));
        pokemones.add(new Pokemon(Pokedex.ABRA, 25, 20, 15, 105, 55, 90));
        pokemones.add(new Pokemon(Pokedex.KADABRA, 40, 35, 30, 120, 70, 105));
        pokemones.add(new Pokemon(Pokedex.ALAKAZAM, 55, 50, 65, 175, 95, 150));
        pokemones.add(new Pokemon(Pokedex.MACHOP, 70, 80, 50, 35, 35, 35));
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
