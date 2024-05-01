
package PolymorphismeEx;

import java.util.ArrayList;

public class Payement {
    public static void main(String[] args) {
        Derecteur mohamed=new Derecteur("mohamed");
        Chef amin=new Chef("amin");
        Ouvrier jamal=new Ouvrier("jamal");
        ArrayList<Salary> salair=new ArrayList<>();
        salair.add(mohamed);
        salair.add(amin);
        salair.add(jamal);
        for (Salary salary : salair) {
            salary.AfficherSalair();
        }
//abstrac 
        
        
        
        
        
    }
    
}
