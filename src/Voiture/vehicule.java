
package Voiture;

public class vehicule {

  String marque;

  String modele;
  String annee;
    private int vitess;

    public vehicule(String marque, String modele, String annee) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        vitess = 0;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public String getAnnee() {
        return annee;
    }

    public int getVitess() {
        return vitess;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public void setVitess(int vitess) {
        this.vitess = vitess;
    }

    @Override
    public String toString() {
        return "vehicule :" + "marque=" + marque + ", modele=" + modele + ", annee=" + annee + '}';
    }
    public void accelrer(){
       if(vitess<200) 
        vitess+=5;
       else
            System.out.println("vous avez vitesse max");
    }
     public void ralentir(){
       if(vitess>0) 
        vitess-=5;
       else
            System.out.println("la voiturer est arreter");
    }
    public boolean estArretee(){
        // if(vitess==0)return true;
       // else return false;
        
        return vitess==0 ? true : false;
    }
    // System.out.println(this+"manger")
                      //name objet li rat returniha f toString 
    
    

}