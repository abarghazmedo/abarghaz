
package CartaMrc;
public enum Color {
    DHAB("dhab"),
    JBABN("jbabn"),
    SYOUFA("syoufa"),
    GRA3("gra3");
    private final String nom;

    private Color(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
    
    
    
}
