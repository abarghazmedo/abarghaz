
package gestioncompte;
public class main {
    public static void main(String[] args) {
         compte comp1=new compte("ahmed abarghaz");
         compte comp2=new compte("mohamed abarghaz");
        comp1.deposer(1000);
        comp2.deposer(5000);
        comp1.retirer(500);
        comp2.verment(1000, comp1);
        comp1.Afficher();
        comp2.Afficher();
        
    }
    
}
