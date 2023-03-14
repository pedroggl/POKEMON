
/**
 *
 * @author galla
 */
//import java.util.ArrayList;
public class Pokemon {

    private Pokedex pokemon;
    private String mote = "";
    private final int hp, ataque, defensa, ataqueEsp, defensaEsp, velocidad;
    private final char sexo;          //Hembra-->H; Macho-->M
//    ArrayList<Ataques> ataques = new ArrayList<Ataques>();

    public Pokemon(Pokedex pokemon, int hp, int ataque, int defensa, int ataqueEsp, int defensaEsp, int velocidad) {
        this.pokemon = pokemon;
        this.hp = hp;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEsp = ataqueEsp;
        this.defensaEsp = defensaEsp;
        this.velocidad = velocidad;
        //se puede implementar pokemon sin sexo       
        switch (compruebaGeneros()) {
            //inicia el genero con un valor aleatorio
            case 0:
                if (Math.random() < 0.5) {
                    this.sexo = 'H';
                } else {
                    this.sexo = 'M';
                }
                break;
            //inica el sexo como macho por defecto
            case 1:
                this.sexo = 'M';
                break;
            //inicia el sexo como hembra por defecto
            case 2:
                this.sexo = 'H';
                break;
            //en caso d error inica el sexo vacio
            default:
                this.sexo = ' ';
                break;
        }
    }

    public String getNombrePokemon() {
        return pokemon.toString().toUpperCase();
    }

    public void setMote(String mote) {
        this.mote = mote;
    }

    public String getMote() {
        return mote;
    }

    public void muestraStats() {
        if (mote.equals("")) {
            System.out.println("Pokemon " + pokemon.toString());
        } else {
            System.out.println("Pokemon " + pokemon.toString() + ", alias: " + mote);
        }
        System.out.println("HP: " + hp + ", Ataque: " + ataque + ", Defensa: " + defensa
                + "\nAtaque Especial: " + ataqueEsp + ", Defensa Especial: " + defensaEsp
                + ", Velocidad: " + velocidad);
    }

    //devuelve true si el pokemon es alguno d estos
    private int compruebaGeneros() {
        switch (pokemon) {
            case NIDORINO:
            case NIDOKING:
                return 1;       //devuelve 1 cuando el genero debe ser macho
            case NIDORINA:
            case NIDOQUEEN:
                return 2;       //devuelve 2 cuando el genero debe ser hembra
            default:
                return 0;       //devuelve 0 cuando no es un genero predefinido
        }
    }
}
