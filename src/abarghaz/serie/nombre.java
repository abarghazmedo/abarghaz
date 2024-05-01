
package abarghaz.serie;

import java.util.Random;

public class nombre {
    int nAleatoir;
    Random r=new Random();
    
    public nombre(){
    nAleatoir=r.nextInt(101);
}
    public void afichhernal(){
        System.out.println("la nombre aleatoir est "+nAleatoir);
    }
}
