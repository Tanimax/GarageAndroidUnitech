package Affichage;

import java.util.*;


import Modele.Personne;

public class Affichage {
	
	public static void main(String[] args) {
		
//		Personne personne=new Personne();
//		
//		String nom="Capois";
//		
//		personne.setNom(nom);
//		personne.setPrenom("La Mort");
//		personne.setSexe("masculin");
//		personne.setAnneenaissance(1990);
		
		List<Personne> persos=new ArrayList<Personne>();
		
		Personne p=new  Personne("Capois","La Mort", "Masculin",1990);
		Personne p1=new  Personne("Capois","La Mort", "Masculin",1990);
		Personne p2=new  Personne("Toussaint","Tony", "Masculin",1804);
		persos.add(p);
		persos.add(p1);
		persos.add(p2);
		Personne pers[]=new Personne[3];
		pers[0]=new Personne("Capois","La Mort", "Masculin",1990);
		pers[1]=new Personne("Dessalines","Jean Jacques", "Masculin",1990);
		pers[2]=new Personne("Toussaint","Tony", "Masculin",1804);
		
//		for(int i=0; i<3; i++) {
//			System.out.println(pers[i].toString());
//		}
		
		for(Personne pe: persos) {
			System.out.println(pe.toString());
		}
		
		//System.out.println(personne.toString());
		
	}

}
