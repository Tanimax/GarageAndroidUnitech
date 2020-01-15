package Modele;

public class Employer {
	
	
	private int id;
	private String nom;
	private String prenom;
	private String department;
	private Double coutheure;
	
	
	
	public Employer(int id, String nom, String prenom, String department, Double coutheure) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.department = department;
		this.coutheure = coutheure;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Double getCoutheure() {
		return coutheure;
	}
	public void setCoutheure(Double coutheure) {
		this.coutheure = coutheure;
	}
	
	public Double Salaire() {
		return 210*coutheure;
	}
	
	
	public String toString()
	{
		return getNom()+" "+getPrenom()+" "+String.valueOf(Salaire())+" USD";
	}

}
