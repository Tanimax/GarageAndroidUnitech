package test;

public class HelloWorld {
	

	  public static void main(String[] args) {
		  Carre carre=new Carre();
		  Rectangle rec=new Rectangle();
		  carre.cote=8;
		  
		  rec.largeur=2;
		  rec.longueur=4;
		  System.out.println("Perimetre: "+carre.Perimetre());
		  System.out.println("Surface: "+carre.Surface());
		  
		  System.out.println("Perimetre Rectangle: "+rec.Perimetre());
		  System.out.println("Surface Rectangle: "+rec.Surface());
	  }
}
