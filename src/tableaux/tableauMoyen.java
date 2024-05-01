
package tableaux;

import java.util.Scanner;

public class tableauMoyen {

    public static void main(String[] args) {
        double somme = 0;
        double moyen;
        double max,min;
        double noteCercher;
        int conteur =0; 
        Scanner input = new Scanner(System.in);

        double[] notes = new double[10];

        System.out.println("entrer des nombre ");
        for (int i = 0; i < notes.length; i++) {
            notes[i] = input.nextDouble();
            somme = somme + notes[i];
        }
         min =notes[0];
         max =notes[0];
         for (int i = 1; i < notes.length; i++) {
           if (notes[i]<min)
           min=notes[i];
           if (notes[i]>max)
           max=notes[i];
        }
           System.out.println("enter number qui cherche");
           noteCercher=input.nextDouble();
           for (int i = 1; i < notes.length; i++) {
           if (noteCercher==notes[i]){
               conteur++;
           }
               
        }
           if(conteur==0)
               System.out.println("nombre qqui cercher n'exit pas !");
           else 
               System.out.println("nobre qui chercher il ya "+conteur+" fois");
         
        
        moyen = somme / notes.length;
        System.out.println("la somme des notes est " + somme);
        System.out.println("la moyen des notes est " + moyen);
        System.out.println("le max des notes est : "+max);
         System.out.println("le min des notes est : "+min);
    }
}
