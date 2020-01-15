package Affichage;

import Modele.Employer;
import Modele.Programmeur;

public class Affichage {
	
	
	public static void main(String[] args) {
		Employer emp[]=new Employer[2];
		emp[0]=new Employer(1,"Toussaint","Andre","Sante",24.0);
		emp[1]=new Programmeur(2,"Jovenel","Jean","Sante",30.0,5000.0,10000.0);
		
		for(int i=0; i<2;i++) {
			System.out.println(emp[i].toString());
		}
	
	}

}
