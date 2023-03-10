
/**
 *
 * @author galla
 */
//import java.util.ArrayList;
public class Pokemon {

    private String mote;
    private final int hp, ataque, defensa, ataqueEsp, defensaEsp, velocidad;
    private final char sexo;          //Hembra-->H; Macho-->M
//    ArrayList<Ataques> ataques = new ArrayList<Ataques>();

    public Pokemon(int hp, int ataque, int defensa, int ataqueEsp, int defensaEsp, int velocidad) {
        this.hp = hp;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEsp = ataqueEsp;
        this.defensaEsp = defensaEsp;
        this.velocidad = velocidad;
        //genera el sexo aleatorio entre hembra o macho, mas adelante se puede implementar pokemon sin sexo
        if (Math.random() < 0.5) {
            this.sexo = 'H';
        } else {
            this.sexo = 'M';
        }
    }

    public void setMote(String mote) {
        this.mote = mote;
    }

    public void muestraStats() {
        System.out.println("Pokemon " + mote);
        System.out.println("Vida: " + hp + ", Atauqe: " + ataque + ", Defensa: " + defensa + "\nAtaque Especial: " + ataqueEsp + ", Defensa Especial: " + defensaEsp + ", Velocidad: " + velocidad);
    }
    
    public void muestraNombre(){
        System.out.println("Pokemon "+mote+"\n");
    }
}
