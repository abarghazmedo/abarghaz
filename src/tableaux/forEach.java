
package tableaux;
public class forEach {
    public static void main(String[] args) {
        
     /*   for (int i=0; i<names.length;i++){
            System.out.println(names[i]);
        }*/
     ///////////////oor
        String[] names = {" Ahmed ", " Tarik ", " Aicha ", " Mohamed "};
        for (String nom : names) {
            // Trim the leading and trailing spaces before checking the first character
            nom = nom.trim();//gpt

            if (nom.charAt(0) == 'A') {
                System.out.println(nom);
            }
        }

    }
}
