package boletin29;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class Veleros extends Barco {
    
    private int mastiles;

    public Veleros() {
    }

    public Veleros(int mastiles, int eslora, String matricula) {
        super(eslora, matricula);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return super.toString()+" Mastiles :"+mastiles;
    }
    

    @Override
    public int alquiler(int dias) {
        return (10*dias*eslora*mastiles);
    }

}
