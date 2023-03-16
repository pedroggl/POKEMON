
/**
 *
 * @author Pedro G Gallardo
 * @version 1.0
 * @see
 * <a href="https://www.wikidex.net/wiki/Lista_de_Pok%C3%A9mon_de_la_primera_generaci%C3%B3n">Pokedex</a>
 */
import java.util.Scanner;
import java.util.Random;

public class POKEMONS {

    public static Scanner in = new Scanner(System.in);

    public static void menu() {
        System.out.println("1.Ver tu equipo pokemon\n2.Ver la caja pokemon\n3.Capturar un pokemon\n4.Combate pokemon\n5.Salir del programa");
    }

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

        System.out.println("Ahora es tu turno");
        try {
            int opc;
            Random aleatorio = new Random();
            ColeccionPokemon pokedex = new ColeccionPokemon();
            System.out.println("\n-------------------------------------------------------------------\n");
            System.out.println("¿Como te llamas entrenador?");
            String nombre = in.nextLine();
            System.out.println("De acuerdo y cual de estos 3 pokemon inicales vas a elegir:");
            System.out.println("Charmander de tipo fuego\nSquirtle de tipo agua\nBulbasaur de tipo planta");
            String starter = in.nextLine();
            Entrenador entrenador1 = new Entrenador(nombre, starter);
            System.out.println("\n-------------------------------------------------------------------\n");
            System.out.println("Muy bien entrenador, este es tu equipo actualmente:");
            System.out.println("\n-------------------------------------------------------------------\n");
            do {
                menu();
                opc = in.nextInt();
                in.next();
                switch (opc) {
                    case 1:
                        System.out.println();
                        entrenador1.muestraEquipo();
                        break;
                    case 2:
                        System.out.println();
                        entrenador1.muestraCaja();
                        break;
                    case 3:
                        System.out.println();
                        int random = aleatorio.nextInt(151);
                        Pokemon salvaje = pokedex.pokemon(random);
                        System.out.println("Vaya, un " + salvaje.getNombrePokemon() + " salvaje ha aparecido\n¿Deseas capturarlo?");
                        String respuesta = in.nextLine();
                        if (respuesta.toUpperCase().equals("SI")) {
                            entrenador1.capturaPokemon(salvaje.getNombrePokemon());
                        } else {
                            System.out.println("Bueno no pasa nada");
                        }
                        break;
                    case 4:
                        break;
                    case 5:
                        System.out.println("Muchas gracias por probar el programa\nUN SALUDO!!");
                        break;
                    default:
                        System.out.println("Opcion seleccionada incorrecta");
                        break;
                }
            } while (opc != 5);
            System.out.println("\n-------------------------------------------------------------------\n");

            System.out.println("\n-------------------------------------------------------------------\n");

            System.out.println("\n-------------------------------------------------------------------\n");
            System.out.println("Empieza la temporada regular de la liga de Kanto");
            System.out.println("Se disponen en el primer combate el " + entrenador1.getPokemon("Charmander").getNombrePokemon() + " de " + pedro.getNombre() + " vs " + ramon.getPokemon("Bulbasaur").getNombrePokemon() + " de " + ramon.getNombre() + "\nVamos a mirar de cerca a ver quien gana\n");
            System.out.println(Entrenador.combatePokemon(pedro.getPokemon("Charmander"), ramon.getPokemon("Bulbasaur")));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
