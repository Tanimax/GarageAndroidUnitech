package Modele;

public class Rectangle extends Form{
	
	double lon, lar;
	
	public Rectangle(String nomform, double lon, double lar){
		super(nomform);
		this.lon=lon;
		this.lar=lar;
	}

	@Override
	double surface() {
		// TODO Auto-generated method stub
		return lon*lar;
	}

	@Override
	double perimetre() {
		// TODO Auto-generated method stub
		return (lon+lar)*2;
	}

}
