package PolymorphismeEx;
public class Salary {
    protected String nom;
    protected  double salary;

    public Salary(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom;
    }
    public void AfficherSalair(){
        System.out.println("salary de "+this+" est "+salary);
    }
    
    
}
