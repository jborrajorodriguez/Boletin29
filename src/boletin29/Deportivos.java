package boletin29;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class Deportivos extends Barco{

    private int potencia;

    public Deportivos() {
    }

    public Deportivos(int potencia, int eslora, String matricula) {
        super(eslora, matricula);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return super.toString()+" Potencia :"+potencia;
    }
    
    
    
    
    @Override
    public int alquiler(int dias) {
      return (10*dias*eslora)+potencia;
    }

}
