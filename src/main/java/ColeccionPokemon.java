
/**
 *
 * @author Pedro G Gallardo
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ColeccionPokemon {
    
    private ArrayList<Pokemon> pokemones = new ArrayList<>();
    
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
        pokemones.add(new Pokemon(Pokedex.MACHOKE, 80, 100, 70, 50, 60, 45));
        pokemones.add(new Pokemon(Pokedex.MACHAMP, 90, 130, 80, 65, 85, 55));
        pokemones.add(new Pokemon(Pokedex.BELLSPROUT, 50, 75, 35, 70, 30, 40));
        pokemones.add(new Pokemon(Pokedex.WEEPINBELL, 65, 90, 50, 85, 45, 55));
        pokemones.add(new Pokemon(Pokedex.VICTREEBEL, 80, 105, 65, 100, 70, 70));
        pokemones.add(new Pokemon(Pokedex.TENTACOOL, 40, 40, 35, 50, 100, 70));
        pokemones.add(new Pokemon(Pokedex.TENTACRUEL, 80, 70, 65, 80, 120, 100));
        pokemones.add(new Pokemon(Pokedex.GEODUDE, 40, 80, 100, 30, 30, 20));
        pokemones.add(new Pokemon(Pokedex.GRAVELER, 55, 95, 115, 45, 45, 35));
        pokemones.add(new Pokemon(Pokedex.GOLEM, 80, 110, 130, 55, 65, 45));
        pokemones.add(new Pokemon(Pokedex.PONYTA, 50, 85, 55, 65, 65, 90));
        pokemones.add(new Pokemon(Pokedex.RAPIDASH, 65, 100, 70, 80, 80, 105));
        pokemones.add(new Pokemon(Pokedex.SLOWPOKE, 90, 65, 65, 40, 40, 15));
        pokemones.add(new Pokemon(Pokedex.SLOWBRO, 95, 75, 110, 100, 80, 30));
        pokemones.add(new Pokemon(Pokedex.MAGNEMITE, 25, 35, 70, 95, 55, 45));
        pokemones.add(new Pokemon(Pokedex.MAGNETON, 50, 60, 95, 120, 70, 70));
        pokemones.add(new Pokemon(Pokedex.FARFETCH, 52, 90, 55, 58, 62, 60));
        pokemones.add(new Pokemon(Pokedex.DODUO, 35, 85, 45, 35, 35, 75));
        pokemones.add(new Pokemon(Pokedex.DODRIO, 60, 110, 70, 60, 60, 100));
        pokemones.add(new Pokemon(Pokedex.SEEL, 65, 45, 55, 45, 70, 45));
        pokemones.add(new Pokemon(Pokedex.DEWGONG, 90, 70, 80, 70, 95, 70));
        pokemones.add(new Pokemon(Pokedex.GRIMER, 80, 80, 50, 40, 50, 25));
        pokemones.add(new Pokemon(Pokedex.MUK, 105, 105, 75, 65, 100, 50));
        pokemones.add(new Pokemon(Pokedex.SHELLDER, 30, 65, 100, 45, 25, 40));
        pokemones.add(new Pokemon(Pokedex.CLOYSTER, 50, 95, 180, 85, 45, 70));
        pokemones.add(new Pokemon(Pokedex.GASTLY, 30, 35, 30, 100, 35, 80));
        pokemones.add(new Pokemon(Pokedex.HAUNTER, 45, 50, 45, 115, 55, 95));
        pokemones.add(new Pokemon(Pokedex.GENGAR, 60, 65, 60, 130, 75, 110));
        pokemones.add(new Pokemon(Pokedex.ONIX, 35, 45, 160, 30, 45, 70));
        pokemones.add(new Pokemon(Pokedex.DROWZEE, 60, 48, 45, 43, 90, 42));
        pokemones.add(new Pokemon(Pokedex.HYPNO, 85, 73, 70, 73, 115, 67));
        pokemones.add(new Pokemon(Pokedex.KRABBY, 30, 105, 90, 25, 25, 50));
        pokemones.add(new Pokemon(Pokedex.KINGLER, 55, 130, 115, 50, 50, 75));
        pokemones.add(new Pokemon(Pokedex.VOLTORB, 40, 30, 50, 55, 55, 100));
        pokemones.add(new Pokemon(Pokedex.ELECTRODE, 60, 50, 70, 80, 80, 150));
        pokemones.add(new Pokemon(Pokedex.EXEGGCUTE, 60, 40, 80, 60, 45, 40));
        pokemones.add(new Pokemon(Pokedex.EXEGGUTOR, 95, 95, 85, 125, 75, 55));
        pokemones.add(new Pokemon(Pokedex.CUBONE, 50, 50, 95, 40, 50, 35));
        pokemones.add(new Pokemon(Pokedex.MAROWAK, 60, 80, 110, 50, 80, 45));
        pokemones.add(new Pokemon(Pokedex.HITMONLEE, 50, 120, 53, 35, 110, 87));
        pokemones.add(new Pokemon(Pokedex.HITMONCHAN, 50, 105, 79, 35, 110, 76));
        pokemones.add(new Pokemon(Pokedex.LICKITUNG, 90, 55, 75, 60, 75, 30));
        pokemones.add(new Pokemon(Pokedex.KOFFING, 40, 65, 95, 60, 45, 35));
        pokemones.add(new Pokemon(Pokedex.WEEZING, 65, 90, 120, 85, 70, 60));
        pokemones.add(new Pokemon(Pokedex.RHYHORN, 80, 85, 95, 30, 30, 25));
        pokemones.add(new Pokemon(Pokedex.RHYDON, 105, 130, 120, 45, 45, 40));
        pokemones.add(new Pokemon(Pokedex.CHANSEY, 250, 5, 5, 35, 105, 50));
        pokemones.add(new Pokemon(Pokedex.TANGELA, 65, 55, 115, 100, 40, 60));
        pokemones.add(new Pokemon(Pokedex.KANGASKHAN, 105, 95, 80, 40, 80, 90));
        pokemones.add(new Pokemon(Pokedex.HORSEA, 30, 40, 70, 70, 25, 60));
        pokemones.add(new Pokemon(Pokedex.SEADRA, 55, 65, 95, 95, 45, 85));
        pokemones.add(new Pokemon(Pokedex.GOLDEEN, 45, 67, 60, 35, 50, 63));
        pokemones.add(new Pokemon(Pokedex.SEAKING, 80, 92, 65, 65, 80, 68));
        pokemones.add(new Pokemon(Pokedex.STARYU, 30, 45, 55, 70, 55, 85));
        pokemones.add(new Pokemon(Pokedex.STARMIE, 60, 75, 85, 100, 85, 115));
        pokemones.add(new Pokemon(Pokedex.MRMINE, 40, 45, 65, 100, 120, 90));
        pokemones.add(new Pokemon(Pokedex.SCYTHER, 70, 110, 80, 55, 80, 105));
        pokemones.add(new Pokemon(Pokedex.JYNX, 65, 50, 35, 115, 95, 95));
        pokemones.add(new Pokemon(Pokedex.ELECTABUZZ, 65, 83, 57, 95, 85, 105));
        pokemones.add(new Pokemon(Pokedex.MAGMAR, 65, 95, 57, 100, 85, 93));
        pokemones.add(new Pokemon(Pokedex.PINSIR, 65, 125, 100, 55, 70, 85));
        pokemones.add(new Pokemon(Pokedex.TAUROS, 75, 100, 95, 40, 70, 110));
        pokemones.add(new Pokemon(Pokedex.MAGIKARP, 20, 10, 55, 15, 20, 80));
        pokemones.add(new Pokemon(Pokedex.GYARADOS, 95, 125, 79, 60, 100, 81));
        pokemones.add(new Pokemon(Pokedex.LAPRAS, 130, 85, 80, 85, 95, 60));
        pokemones.add(new Pokemon(Pokedex.DITTO, 48, 48, 48, 48, 48, 48));
        pokemones.add(new Pokemon(Pokedex.EEVEE, 55, 55, 50, 45, 65, 55));
        pokemones.add(new Pokemon(Pokedex.VAPOREON, 130, 65, 60, 110, 95, 65));
        pokemones.add(new Pokemon(Pokedex.JOLTEON, 65, 65, 60, 110, 95, 130));
        pokemones.add(new Pokemon(Pokedex.FLAREON, 65, 130, 60, 95, 110, 65));
        pokemones.add(new Pokemon(Pokedex.PORYGON, 65, 60, 70, 85, 75, 40));
        pokemones.add(new Pokemon(Pokedex.OMANYTE, 35, 40, 100, 90, 55, 35));
        pokemones.add(new Pokemon(Pokedex.OMASTAR, 70, 60, 125, 115, 70, 55));
        pokemones.add(new Pokemon(Pokedex.KABUTO, 30, 80, 90, 55, 45, 55));
        pokemones.add(new Pokemon(Pokedex.KABUTOPS, 60, 115, 105, 65, 70, 80));
        pokemones.add(new Pokemon(Pokedex.AERODACTYL, 80, 105, 65, 60, 75, 130));
        pokemones.add(new Pokemon(Pokedex.SNORLAX, 160, 110, 65, 65, 110, 30));
        pokemones.add(new Pokemon(Pokedex.ARTICUNO, 90, 85, 100, 95, 125, 85));
        pokemones.add(new Pokemon(Pokedex.ZAPDOS, 90, 90, 85, 125, 90, 100));
        pokemones.add(new Pokemon(Pokedex.MOLTRES, 90, 100, 90, 125, 85, 90));
        pokemones.add(new Pokemon(Pokedex.DRATINI, 41, 64, 45, 50, 50, 50));
        pokemones.add(new Pokemon(Pokedex.DRAGONAIR, 61, 84, 65, 70, 70, 70));
        pokemones.add(new Pokemon(Pokedex.DRAGONITE, 91, 134, 95, 100, 100, 80));
        pokemones.add(new Pokemon(Pokedex.MEWTWO, 106, 110, 90, 154, 90, 130));
        pokemones.add(new Pokemon(Pokedex.MEW, 100, 100, 100, 100, 100, 100));
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
    
    public Pokemon pokemon(int index) {
        return this.pokemones.get(index);
    }
}
