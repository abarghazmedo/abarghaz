
package Polymorphisme;

import java.util.ArrayList;


public class main {
    public static void main(String[] args) {
        Animal doG=new dog();
        ArrayList<Animal> animaux=new ArrayList<>();
        animaux.add(new dog());
        animaux.add(new dog());
        animaux.add(new cat());
        animaux.add(new cat());
        animaux.add(new Animal());
        
        for (Animal animal : animaux) {
            animal.marcher();
        }
        
    }
}
