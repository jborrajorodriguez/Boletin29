package boletin29;

import java.util.ArrayList;

/**
 *
 * @author Juan Borrajo Rodriguez
 */
public class Boletin29 {

    public static void main(String[] args) {
        ArrayList<Barco> barcos = new ArrayList();

        barcos.add(new Veleros(3, 25, "0001"));
        barcos.add(new Deportivos(100, 25, "0002"));
        barcos.add(new Yates(50, 6, 25, "0003"));
        
        Factura fact=new Factura();
        fact.total(barcos.get(0), 10);
    }

}
