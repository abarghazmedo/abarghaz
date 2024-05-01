
package Voiture;
public class main {
    public static void main(String[] args) {
        voiture voiture1=new voiture("Dacia", 220, 150000);
        voiture voiture2=new voiture("mercides", 260, 350000);
        voiture voiture3=new voiture("hyndai", 230, 200000);
        voiture voiture4=new voiture("bmw", 280, 700000);
        
        
        System.out.println(voiture1.toString());
        System.out.println(voiture2.toString());
        System.out.println(voiture3.toString());
        System.out.println(voiture4.toString());
        voiture1.demarrer();
        voiture2.arreter();
        voiture1.etat();
        voiture2.etat();
        voiture3.etat();
    }
}
