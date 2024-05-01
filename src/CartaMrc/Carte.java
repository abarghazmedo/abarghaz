
package CartaMrc;

public class Carte {
    //les variables
   private Color color;
   private valeur valu;
   private boolean afficher;
   
   //constructeur
    public Carte(Color color, valeur valu) {
        this.color = color;
        this.valu = valu;
        afficher =false;
    }
    
    //getters

    public Color getColor() {
        return color;
    }

    public void setValu(valeur valu) {
        this.valu = valu;
    }

    public boolean isAfficher() {
        return afficher;
    }
    public void tourner(){
        afficher=!afficher;
    }
    

    @Override
    public String toString() {
        String affichage;
        if(afficher)
            affichage= color.getNom()+" dyal "+valu.getNom();
        else
            affichage="this catre is not afficher";
        return affichage;
    }
    
    
    
   
}
