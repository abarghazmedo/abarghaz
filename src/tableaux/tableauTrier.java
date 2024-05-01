package tableaux;

import java.util.Random;

public class tableauTrier {
//Creation des variables
	private int[] tab;
	private Random rand;
	private Boolean bool;
	private int temp;
        
	public tableauTrier() {
	tab = new int [10];
	rand = new Random();
	bool=true;
	temp=0;
	
	}
//Remplir le Tableau d'une facon aléatoir
	public void remplir() {
	for(int i =0 ;i<tab.length;i++) {
		tab[i]=rand.nextInt(100);
	}}
	
//Afficher le Tableau
	public void afficher() {
		for(int i =0 ;i<tab.length;i++) {
			System.out.print(" "+tab[i]+" ");		
			}
	}
	
//Trier le Tableau
	public void trier() {
		
		while(bool==true) {
			bool=false;
			for(int i =0 ;i<tab.length-i;i++) {
				
				if(tab[i]>tab[i+1])	{
					temp = tab[i];
					tab[i]= tab[i+1];
					tab[i+1]=temp;
					bool=true;
				}
				}
			}
	}
	
	
}