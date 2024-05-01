/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package getset;
public class main {
    public static void main(String[] args) {
        GetSet test1=new GetSet();
        test1.setNom("mohamed");//set modifier les variable 
        test1.setPrenom("abarhaz");
        test1.setAge(23);
        System.out.println(test1.getNom());
        System.out.println(test1.getPrenom());
        System.out.println(test1.getAge());
    }
    
}
