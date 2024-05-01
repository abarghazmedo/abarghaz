
package tableaux;

import java.util.Scanner;

public class tableauxmultidimensionnels {
    public static void main(String[] args) {
       // int [][] tableaudm={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
      //  System.out.println(tableaudm[2][3]);
      
        int[][] tabln=new int[3][6];
        Scanner scan=new Scanner(System.in);
        //add to array
        for (int i=0;i<tabln.length;i++){//correct dont doit <=
            for (int j=0;j<tabln[i].length;j++){
                tabln[i][j]=scan.nextInt();
            }
        }
       // affichage array
         for (int i=0;i<tabln.length;i++){
            for (int j=0;j<tabln[i].length;j++){
                System.out.print(tabln[i][j]+"  ");
            }
             System.out.println();
        }
         //types primitives  int n=3; ==  integer n=new integer(3);
        
    }
    
}
