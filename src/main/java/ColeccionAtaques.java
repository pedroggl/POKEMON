
/**
 *
 * @author DAW
 */
import java.util.HashMap;

public class ColeccionAtaques {

    private HashMap<String, Ataque> ataques;

    public ColeccionAtaques() {
        //inicializamos nombre de ataque, potencia de ataque y tipo de ataque
//        Ataque ataque;
//        ataques.put(ataque.getNombre(), ataque);
        ataques.put("PLACAJE", new Ataque("placaje", "normal", "fisico", 40, 100));
    }

    public void addAtaque(Ataque ataque) {
        //añadimos nombre de ataque y potencia de ataque
        ataques.put(ataque.getNombre(), ataque);
    }

    public Ataque getAtaque(String nombre) throws Exception {
        try {
            return ataques.get(nombre);
        } catch (Exception e) {
            e = new Exception("Error, no existe el mvmto indicado");
            throw e;
        }
    }
}
