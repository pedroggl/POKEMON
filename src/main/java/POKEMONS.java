
/**
 *
 * @author Pedro G Gallardo
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
