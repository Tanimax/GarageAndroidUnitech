package Affichage;

import Modele.Cercle;
import Modele.Form;
import Modele.Rectangle;

public class Affichage {
	
	
	public static void main(String[] args) {
		
		Form geo[]=new Form[5];
		
		geo[0]=new Rectangle("rectangle",4,6);
		geo[1]=new Rectangle("rectangle",3,8);
		geo[2]=new Rectangle("rectangle",4,9);
		geo[3]=new Cercle("cercle",4);
		geo[4]=new Cercle("cercle",6);
		for(int i=0; i<5; i++) {
			//if (geo[i] instanceof Rectangle) System.out.print("Chef : ");
			   System.out.println( geo[i].toString()); 
			
		}
		
		
	}

}
