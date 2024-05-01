
package gestioncompte;
public class compte {
    int Sold=0;
    String Titulair;
    public compte(){  
    }
    public compte(String t){
        Titulair=t;
    }
    public void Afficher(){
        System.out.println("la solde de mosieu "+Titulair+" est "+ Sold);
    }
    public void deposer(int montant){
        Sold+=montant;
    }
    public void retirer(int montant){
        Sold-=montant;
    }
    public void verment(int montant,compte another){
        this.retirer(montant);
        another.deposer(montant);
    }
}