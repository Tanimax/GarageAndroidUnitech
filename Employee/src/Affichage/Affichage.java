package Affichage;

import Modele.Personne;
import Modele.Programmeur;

public class Affichage {
	
	public static void main(String[] args) {
		
		Personne entreprise[] = new Personne[5] ;
		entreprise[0]= new Programmeur("Cronos", 1000, 500) ;
		entreprise[1]= new Programmeur("Zeus ", 1000, 600) ;
		entreprise[2]= new Personne("Ares", 620) ;
		entreprise[3]= new Personne ("Apollon", 700) ;
		entreprise[4]= new Personne ("Aphrodite ", 100) ;
		
		for ( int i = 0 ; i< 5 ; ++i){
			   if (entreprise[i] instanceof Programmeur) System.out.print("Programmeur : ");
			   System.out.println( entreprise[i].toString()); 
			   
			}
		
		double sommeSalaires = 0;
		for ( int i = 0 ; i < 5 ; ++i)
		   if(!(entreprise[i] instanceof Programmeur))  sommeSalaires +=  entreprise[i].getSalaire();
		System.out.println(sommeSalaires); 
		
	}

}
