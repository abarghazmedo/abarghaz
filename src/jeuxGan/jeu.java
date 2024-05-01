
package jeuxGan;

import java.util.Random;

public class jeu {
    public static void main(String[] args) {
        Random nmbr=new Random();
         int j1,j2;
        int c1=0,c2=0;
        while(c1<3&&c2<3){
          j1=nmbr.nextInt(100)+1;
          j2=nmbr.nextInt(100)+1;
            System.out.println("joueur 1 a choisir "+j1+" joueur 2 a choisir "+j2);
          if(j1>j2){
            System.out.println("le joueur 1 a gagne");
            c1++;
          }else if (j2>j1){
               System.out.println("le joueur 2 a gagne");
               c2++;
          }else {
              System.out.println("egalite");
          }  
        }
        if (c1==3) System.out.println("joueur numbre 1 you win");    
        if (c2==3) System.out.println("joueur numbre 2 you win");
           
        
       
    }
    
}
