package Modele;

public class Personne {
	
	
	private String nom;
	private String prenom;
	private String sexe;
	private int anneenaissance;
	
	public Personne(String nom, String prenom, String sexe, int annee) {
		this.nom=nom;
		this.prenom=prenom;
		this.sexe=sexe;
		this.anneenaissance=annee;
				
	}
	
	public int getAnneenaissance() {
		return anneenaissance;
	}
	public void setAnneenaissance(int anneenaissance) {
		this.anneenaissance = anneenaissance;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	
	public int Age() {
		return 2020-this.anneenaissance;
	}
	
	
	public String toString() {
		return this.nom+" "+this.prenom+" "+this.sexe+" "+String.valueOf(Age());
	}
	

}
