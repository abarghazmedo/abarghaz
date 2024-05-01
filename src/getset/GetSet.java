
package getset;
public class GetSet {
    //L'Encapsulation mt3tich accer type par default yko privat
  private String nom;
  private String prenom;
  private int age;

    public String getNom() {//wkhha ykn privet 
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public int getAge() {
        return age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
  
}
