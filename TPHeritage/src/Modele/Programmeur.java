package Modele;

public class Programmeur extends Employer{

	private Double prime;
	private Double frais;
	
	
	
	
	
	public Programmeur(int id, String nom, String prenom, String department, Double coutheure, Double prime, Double frais) {
		super(id, nom, prenom, department, coutheure);
		// TODO Auto-generated constructor stub
	this.prime=prime;
	this.frais=frais;
	}
	public Double getPrime() {
		return prime;
	}
	public void setPrime(Double prime) {
		this.prime = prime;
	}
	public Double getFrais() {
		return frais;
	}
	public void setFrais(Double frais) {
		this.frais = frais;
	}
	
	
	public double getSalaire() {
		return (210*getCoutheure())+prime+frais; 
	}
	
	
}
