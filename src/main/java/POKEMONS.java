
/**
 *
 * @author Pedro G Gallardo
 * @see <a href="https://www.wikidex.net/wiki/Lista_de_Pok%C3%A9mon_de_la_primera_generaci%C3%B3n">Pokedex</a>
 */
public class POKEMONS {

    public static void main(String[] args) {
        //Creo entrenador con un starter
        try {
            Entrenador pedro = new Entrenador("Pedro", Pokedex.CHARMANDER);
            pedro.muestraEquipo();
            Entrenador ramon = new Entrenador("Ramon", "Bulbasaur");
            ramon.muestraEquipo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
