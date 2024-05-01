
package Gestionetudient;
public class Etudiant {
    String nom,prenom;
    int idCode;
    
    public Etudiant(String n,String p,int c){
    nom=n;
    prenom=p;
    idCode=c;
    }
    public String toString(){
        
        return "l'etudiant "+nom+" "+prenom+" de "+idCode;
    }
    public void travail(){
        System.out.println("l'etudiant "+nom+" "+prenom+" traviller ");
    }
    public void sereposer(){
        System.out.println("l'etudiant "+nom+" "+prenom+" repose ");
    }
}
