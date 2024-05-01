
package Interface33;
public class Lion implements AnimalIntr{ 

    @Override
    public void dormir() {
        System.out.println("animal selep");
    }

    @Override
    public void manger() {
        System.out.println("Lion eat all");  
    }

    @Override
    public void move() {
        System.out.println("his walking");
    }

   
    public void voice() {
        System.out.println("hes voice haaaaaa");    }
}
