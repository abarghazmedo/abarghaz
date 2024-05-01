package jeuxGan;


import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ibtissam
 */
public class jeuxluck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r= new Random();
        
        int entre,nmbrstr,cont=0;
        nmbrstr=r.nextInt(100)+1;
        System.out.println("entrer your numbre");
        do{
            entre=s.nextInt();
            cont++;
            if(entre==nmbrstr)
                System.out.println("you win you are best!!!!"+cont+" tentatives");
            else if(entre>nmbrstr)
                System.out.println("notre numbre plus petit");
            else 
                System.out.println("notre numbre plus grand");
        }while (entre!=nmbrstr);
               
        
            
        
    }
    
}
