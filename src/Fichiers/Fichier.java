package Fichiers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Fichier {

    public static void main(String[] args)  {
       // ecriredansfichier("Fichier.txt", "this to add this wors  ", true);
       File fichier = new File ("Fichier.txt");
        try {
            Scanner scan=new Scanner(fichier);
            while (scan.hasNextLine()) {  //hasnextLine ach ba9i chu line dkol bou_cle             
                  String text= scan.nextLine();
            System.out.println(text);
            }
          
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
     } 
    ////////////////////////Methode//////////////////////////////////////
    public static void ecriredansfichier(String fichier, String message, boolean ajouter) {
        try {
            File f = new File(fichier);
            FileWriter fw = new FileWriter(fichier, ajouter);//true add words false modifier
            PrintWriter pw = new PrintWriter(fw);
            pw.print(message);
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
