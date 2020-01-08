package test;

public class Rectangle {
	
	double longueur;
	double largeur;
	public double getLongueur() {
		return longueur;
	}
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	public double getLargeur() {
		return largeur;
	}
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	public Double Perimetre() {
		return (this.longueur+this.largeur)*2;
	}
	
	public Double Surface() {
		return (this.longueur*this.largeur);
	}

}
