
/**
 *
 * @author Pedro G Gallardo
 * @version 1.0
 * @see
 * <a href="https://www.wikidex.net/wiki/Lista_de_Pok%C3%A9mon_de_la_primera_generaci%C3%B3n">Pokedex</a>
 */
public class POKEMONS {

    public static void main(String[] args) {
        //Creo entrenador con un starter
        try {
            System.out.println("\n-------------------------------------------------------------------\n");
            Entrenador pedro = new Entrenador("Pedro", Pokedex.CHARMANDER);
            pedro.muestraEquipo();
            Entrenador ramon = new Entrenador("Ramon", "Bulbasaur");
            ramon.muestraEquipo();
            System.out.println("\n-------------------------------------------------------------------\n");
            ramon.capturaPokemon("Abra");
            ramon.capturaPokemon("Kadabra");
            ramon.capturaPokemon("Alakazam");
            ramon.capturaPokemon("Magikarp");
            ramon.capturaPokemon("Gyarados");
            System.out.println("\n-------------------------------------------------------------------\n");
            ramon.capturaPokemon(Pokedex.SEEL);
            ramon.capturaPokemon(Pokedex.DEWGONG);
            ramon.capturaPokemon(Pokedex.ARTICUNO);
            ramon.capturaPokemon(Pokedex.JYNX);
            ramon.capturaPokemon(Pokedex.ARCANINE);
            System.out.println("\n-------------------------------------------------------------------\n");
            ramon.muestraEquipo();
            ramon.muestraCaja();
            System.out.println("\n-------------------------------------------------------------------\n");
            System.out.println("¿Ramon tiene el siguiente pokemon?");
            System.out.println("\nBulbasaur:");
            ramon.muestraPokemon("Bulbasaur");
            System.out.println("\nArticuno:");
            ramon.muestraPokemon("Articuno");
            System.out.println("\nCharmander:");
            ramon.muestraPokemon("Charmander");
            System.out.println("\n-------------------------------------------------------------------\n");
            System.out.println("Empieza la temporada regular de la liga de Kanto");
            System.out.println("Se disponen en el primer combate el " + pedro.getPokemon("Charmander").getNombrePokemon() + " de " + pedro.getNombre() + " vs " + ramon.getPokemon("Bulbasaur").getNombrePokemon() + " de " + ramon.getNombre() + "\nVamos a mirar de cerca a ver quien gana\n");
            System.out.println(Entrenador.combatePokemon(pedro.getPokemon("Charmander"), ramon.getPokemon("Bulbasaur")));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
