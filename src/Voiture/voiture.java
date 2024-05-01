
package Voiture;

public class voiture {
   int code;
   String marque;
   boolean etat;
   double vitess,prix;
    public voiture(String m ,int v,int p){
        code++;
        marque=m;                         //constructeur parametrer
        vitess=v;
        prix=p;
    }
    public String toString(){
        return"la  voiture est de marque "+this.marque+" et de vitess "+this.vitess+" a pour "
                + " prix "+this.prix;
    }
    //action
    public void demarrer(){
        etat=true;
    }
     public void arreter(){
        etat=false;
    }
     public void etat(){
         if(etat==true){
             System.out.println("la voiture "+ marque  +" en marche");
         }else{
             System.out.println(toString()+ " e arreter");
         }
     }
}
