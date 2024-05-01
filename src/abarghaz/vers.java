/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abarghaz;
public class vers {
  public  String matier;
  public  String boisso;
  public  int capacite;
  public  int capacitema;
  /*  public vers(){/////////////////////////
     matier="drink";
     boisso="water";
     capacite=100;        
     capacitema=150;        
    }
  */////////////////////////////////////////
    public void affichecapacite(){//void maktb9ach tstafd m constricteur parametre
        System.out.println("la capacite de ver est "+capacite);
    }
    public void remplirver(){
        capacite+=5;
 }
    public void viderver(){
        capacite-=5;
 }
}
