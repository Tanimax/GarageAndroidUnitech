package Modele;

public class Cercle extends Form{
	
	int r;
	
	

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public Cercle(String nomform, int ray) {
		super(nomform);
		this.r=ray;
		// TODO Auto-generated constructor stub
	}

	@Override
	double surface() {
		// TODO Auto-generated method stub
		return Math.PI*r*r;
	}

	@Override
	double perimetre() {
		// TODO Auto-generated method stub
		return 2*Math.PI*r;
		
	}
	
	

}
