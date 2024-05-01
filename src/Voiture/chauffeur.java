
package Voiture;

public class chauffeur {
    public static void main(String[] args) {
       /* voitureEx2 voiture1=new voitureEx2("dacia", "logan","2013" );
        System.out.println(voiture1);
        System.out.println(voiture1.getVitess());
        for (int i = 0; i < 8; i++) {
             voiture1.accelrer();
        }
        System.out.println(voiture1.getVitess());
        voiture1.ralentir();
        System.out.println(voiture1.getVitess());
        voiture1.setVitess(100);
        System.out.println(voiture1.getVitess());
        voiture1.setVitess(0);
        System.out.println(voiture1.estArretee());*/
       //////////////////new b extends
       voitureEx2 voitur1=new voitureEx2("mercedes", "190", "1992");
        System.out.println(voitur1.getVitess());
         voitur1.ralentir();
         camion camio1=new camion("scania", "scann", "2019", 700000,10000);
         System.out.println(camio1);
         System.out.println(camio1.getPromo());
         
         
    }
    
}
