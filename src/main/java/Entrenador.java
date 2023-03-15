
/**
 *
 * @author Pedro G Gallardo
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Entrenador {

    private final String nombre;
    private int medallas = 0;
    private Pokemon[] equipo = new Pokemon[6];
    private ArrayList<Pokemon> cajaPokemon = new ArrayList<Pokemon>();
    private ColeccionPokemon coleccion = new ColeccionPokemon();

 /**
 *Constructor que recibe 2 elementos
 * @param nombre que corresponde al nombre del entrenador
 * @param starter que corresponde al primer pokemon que podemos escoger
 * @exception Exception puede devolver excepciones si se recibe de manera incorrecta los datos respecto a lo que espera recibir
 */
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

    //quiero que muesrte unicamente un pokemon del entrenador
    public void muestraPokemon(String pokemon) {
        boolean cond = true;
        int i = 0;
        //primero miro en el equipo pokemon(el array de tamaño 6 para comprobar si existe o no el pokemon), si no existe saltara un error y entra en el catch
        try {
            while (cond) {
                if (equipo[i].getNombrePokemon().equals(pokemon.toUpperCase())) {
                    equipo[i].muestraStats();
                    cond = false;
                }
                i++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            //si falla buscando en el equipo, buscara en el arraylist pokemon, de manera que si tampoco lo encuentra recogera de nuevo el error y saldra
            System.out.println("El pokemon no se encuentra en el equipo, se comprobara la caja pokemon");
            try {
                Iterator iter = cajaPokemon.iterator();
                while (iter.hasNext()) {
                    Pokemon buscador = (Pokemon) iter.next();
                    //si existe en la caja un pokemon de nombre igual al que recibe el metodo, imprime sus stats por teclado
                    if (buscador.getNombrePokemon().equals(pokemon.toUpperCase())) {
                        buscador.muestraStats();
                        cond = false;
                    }
                }
                //si al terminar el bucle, no lo ha encontrado, lanzara una excepcion que indicara al usuario que el pokemon que busca no lo ha capturado
                if (cond) {
                    throw new Exception("Error, el pokemon que buscas no lo has capturado aun");
                }
            } catch (Exception exc) {
                System.out.println(exc.getMessage());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void muestraEquipo() {
        System.out.println("\nEntrenador pokemon " + nombre);
        int i = 0;
        while (equipo[i] != null) {
            equipo[i].muestraStats();
            i++;
        }
    }

}
