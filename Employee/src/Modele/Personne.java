package Modele;

public class Personne {
	
	String nom;
	double salaire;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public Personne ( String nom, double salaire){ 
	      this.nom = nom ; this.salaire = salaire ;
	   }
	
	public String toString() { return getNom() +" "+ getSalaire()+"$USD"; }
	
	

}
