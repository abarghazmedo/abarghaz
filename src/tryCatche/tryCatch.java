/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tryCatche;

public class tryCatch {
    public static void main(String[] args) {
         int n1,n2,dev=0;
    n1=12;
    n2=0;
    try{
        dev=n1/n2;
    }catch(Exception e){
        e.printStackTrace();
    }
    
        System.out.println("devesion est "+dev);
    }
   
}
