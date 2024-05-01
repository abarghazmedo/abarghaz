package abarghaz;

import java.util.Scanner;
public class Abarghaz {          
    static double n1,n2,n3,moyyen;
    public static void main(String[] args) { 
        
                     //constructeur
        vers ver1= new vers();
        
       /*/////////////////////////////// 
        System.out.println(ver1.matier); 
        System.out.println(ver1.boisso); 
        System.out.println(ver1.capacite); 
        System.out.println(ver1.capacitema); */
       /////////////////////////////////
        ver1.matier="Bois";
        ver1.boisso="eau";
        ver1.capacite=100;
        ver1.capacitema=500;
                
        ver1.affichecapacite();
        ver1.remplirver();
        ver1.remplirver();
        ver1.remplirver();
        ver1.remplirver();
        ver1.affichecapacite();
        ver1.viderver();
        ver1.affichecapacite();
        
        
        saisir();
        moyen(n1, n2, n3);
    }
     public static void additio (int n1 ,int n2){
        int some=n1+n2;
            System.out.println("la somme de "+n1+" et "+n2+" = " +some);
    }
     public static void saisir() {
       Scanner scanner =new Scanner(System.in);
         System.out.println("entre premie nombr ");
         n1=scanner.nextDouble();//static int  global
         System.out.println("entre dexiem nombr ");
         n2=scanner.nextDouble();           
         System.out.println("entre troism nombr ");
         n3=scanner.nextDouble();
    }
     public static double moyen(double n1,double n2,double n3){        
         moyyen=(n1+n2+n3)/3;
         System.out.println("la moyen de "+n1+" et "+n2+" et " +n3+" = "+moyyen);
         return moyyen;
} 
}
