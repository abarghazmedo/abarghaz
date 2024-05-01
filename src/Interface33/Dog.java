
package Interface33;


public class Dog implements AnimalIntr{

    @Override
    public void dormir() {
    System.out.println("animal selep");
    }

    @Override
    public void manger() {
        System.out.println("eat les os");    }

    @Override
    public void move() {
        System.out.println("dog run");
    }

    @Override
    public void voice() {
        System.out.println("hhes voice haw haw");    }
    
}
