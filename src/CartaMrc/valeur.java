
package CartaMrc;
public enum valeur {
     ONE("one", 1)
    ,TWO("two", 2)
    ,TREE("tree", 3)
    ,FOUR("four", 4)
    ,FIVE("five", 5)
    ,SIX("six", 6)
    ,SEVEN("seven",7)
    ,SOTA("sota",10)
    ,KABAL("kabal",11)
    ,RAY("ray",12);
    
    private final String nom;
    private final int valeur ;

    private valeur(String nom, int valeur) {
        this.nom = nom;
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }
    public String getNom() {
        return nom;
    }   
    
}
