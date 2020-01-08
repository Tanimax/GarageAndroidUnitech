package test;

public class Carre {
	
	double cote;

	public double getCote() {
		return cote;
	}

	public void setCote(double cote) {
		this.cote = cote;
	}
	
	
	public Double Perimetre() {
		return this.cote*4;
	}
	
	public Double Surface() {
		
		return this.cote*this.cote;
	}
	

}
