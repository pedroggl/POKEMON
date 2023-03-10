
/**
 *
 * @author DAW
 */
public class Ataque {

    private String nombre;
    private TipoAtaque tipo;
    private TipoPokemon stab;
    private Integer potencia;
    private int precision;
    //hace falta implementar efectos secundarios en algunos ataques

    public Ataque(String nombre, String tipopokemon, String tipoataque, Integer potencia, int precision) {
        this.nombre = nombre.toUpperCase();
        stab = TipoPokemon.valueOf(tipopokemon.toUpperCase());
        tipo = TipoAtaque.valueOf(tipoataque.toUpperCase());
        this.potencia = potencia;
        this.precision = precision;
        //con este if aseguro que si el movimiento es de estado o su potencia sea 0 se corresponda con el mismo
        if (potencia == null || tipo.toString().equals("ESTADO")) {
            this.potencia = 0;
            tipo = TipoAtaque.ESTADO;
        }
    }

    public String getNombre() {
        return nombre.toUpperCase();
    }

    public TipoAtaque getTipo() {
        return tipo;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public int getPrecision() {
        return precision;
    }

}
