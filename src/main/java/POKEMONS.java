
/**
 *
 * @author galla
 */
public class POKEMONS {

    //probando un git push desde el ordenador de clase
    public static void main(String[] args) {
        //Creo entrenador con un starter
        try {
            Entrenador pedro = new Entrenador("Pedro", Pokedex.CHARMANDER);
            Entrenador ramon = new Entrenador("Ramon", "Bulbasaur");
            pedro.muestraEquipo();
            ramon.muestraEquipo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
