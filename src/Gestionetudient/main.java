/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestionetudient;

public class main {
    static Etudiant etudiant1=new Etudiant("mohamed ", "Abarghaz", 2);
    static Etudiant etudiant2=new Etudiant("ahmed ", "fessali", 6);

    public static void main(String[] args) {
        System.out.println(etudiant1.toString());//return sout
        etudiant1.sereposer();
        etudiant2.sereposer();
    }
}
