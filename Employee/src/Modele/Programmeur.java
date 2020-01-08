package Modele;

public class Programmeur extends Personne {
	
	double prime;

	public double getPrime() {
		return prime;
	}

	public void setPrime(double prime) {
		this.prime = prime;
	}
	
	
	public Programmeur ( String nom, double salaire, double prime){
	      super( nom, salaire) ;
	      this.prime = prime;
	   }
	   public double getSalaire() {return salaire + prime;}

}
