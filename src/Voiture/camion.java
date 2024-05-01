
package Voiture;

public class camion extends vehicule{
    int prix;
    int promo;
    public camion(String marque, String modele, String annee,int prix, int promo) {
        super(marque, modele, annee);
        this.prix=prix;
        this.promo=promo;
    }

    public int getPromo() {
        return prix -promo;//Redéfinition de method de class camio
    }
    //la surcharge nfs method tbdl parametre
    
    @Override
     public String toString() {//la redéfinition d'une méthode
        return "vehicule :" + "marque=" + marque + ", modele=" + modele + ", annee=" + annee +" , promo"+ promo +" , prix "+prix+'}';
    }
    
    
    
}
