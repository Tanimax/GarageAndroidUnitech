package Modele;

public abstract class Form {
	
	String nomform;

	public Form(String nomform) {
		this.nomform = nomform;
	}
	
	
	
	
	public String getNomform() {
		return nomform;
	}




	public void setNomform(String nomform) {
		this.nomform = nomform;
	}

	abstract double surface();
	
	abstract double perimetre();


	public String toString() {
		return getNomform()+" Surface: "+(double)Math.round(surface()*10000)/10000+" Perimetre: "+(double)Math.round(perimetre()*10000)/10000;
	}
	
}
