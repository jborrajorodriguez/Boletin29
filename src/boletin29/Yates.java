package boletin29;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class Yates extends Barco {
    
    private int potencia;
    private int camarotes;

    public Yates() {
    }

    public Yates(int potencia,int camarotes, int eslora, String matricula) {
        super(eslora, matricula);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public int getCamarotes() {
        return camarotes;
    }

    public void setCamorotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return super.toString()+" Potencia :"+potencia+" Camarotes : "+camarotes;
    }

  

    @Override
    public int alquiler(int dias) {
        return (10*dias*eslora)+(camarotes+potencia);
    }

}
