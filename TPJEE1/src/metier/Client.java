package metier;

public class Client {
	private int id;
	private String nom;
	private String prenom;
	private String yeux;
	private int age;
	

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getYeux() {
		return yeux;
	}
	public void setYeux(String yeux) {
		this.yeux = yeux;
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
	public Client( String nom, String prenom, String yeux, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.yeux = yeux;
		this.age = age;
	}
		
	
	public Client(int id) {
		super();
		this.id = id;
	}
	public Client() {
		super();
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", yeux=" + yeux + ", age=" + age + "]";
	}
		
}
	
