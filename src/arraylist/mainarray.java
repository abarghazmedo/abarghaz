
package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

///collections
public class mainarray {
    public static void main(String[] args) {
        ArrayList<String> color=new ArrayList<>();
        //add element 
        color.add("red");
        color.add("yellow");
        color.add("black");
        color.add("bleu");
        color.add("green");
        color.add("white");
        System.out.println(color);
        
        //add element et index
        color.add(1, "gray");
        System.out.println(color);
        
        //indentifier  element idice position
        System.out.println(color.get(4)); 
        
        //modiefier elelment
        color.set(0, "purple");
        System.out.println(color);
        
        //delet element
        color.remove(1);
        
        //cherche element
        System.out.println(color.contains("white"));  //tue or false
        
        //trier
        Collections.sort(color);
        System.out.println(color);
        
        //permuter alletoir element
       // Collections.shuffle(color);//randomly
        System.out.println(color);
        
        //revers back to face
         Collections.reverse(color);
         System.out.println(color);
        
        //prendre une portion e la liste trf mn table 
         List<String> colorTb2=color.subList(0, 3);
         System.out.println("tabl 2 "+colorTb2);
                 
        //echange position  
        Collections.swap(color, 0, 4);
        System.out.println(color);
        
        //joinder 2 array list
        ArrayList<String> color3=new ArrayList<>();
        color3.add("mohamed");
        color3.add("tarik");
        ArrayList<String> color4=new ArrayList<>();
        color4.addAll(color);
        color4.addAll(color3);
        System.out.println(color4);
        
        //Suprimer tout les elements
        color4.clear();
       /* color4.add("hello");
        System.out.println(color4);*/
        
        //savoir si un arraylist est vide ou pas
        System.out.println(color4.isEmpty());
                 
                 
                 
                 
    }
}
