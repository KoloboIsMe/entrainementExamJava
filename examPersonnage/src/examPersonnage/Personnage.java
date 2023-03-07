package examPersonnage;

public class Personnage {
	private static int DEFAUT_PHYSIQUE = 10;
	private static int DEFAUT_MENTAL = 10;
	private static int dernierID = 0;
	private String nom;
	private int forcePhysique;
	private int forceMentale;
	private int id;
	
	public String joue() {
		return "";
	}
	public static int getDEFAUT_PHYSIQUE() {
		return DEFAUT_PHYSIQUE;
	}
	public static void setDEFAUT_PHYSIQUE(int physique) {
		DEFAUT_PHYSIQUE = physique;
	}
	public static int getDEFAUT_MENTAL() {
		return DEFAUT_MENTAL;
	}
	public static void setDEFAUT_MENTAL(int mental) {
		DEFAUT_MENTAL = mental;
	}
	public static int getDernierID() {
		return dernierID;
	}
	public Personnage () {
		this.dernierID += 1;
		this.id = getDernierID();
		this.forcePhysique = this.getDEFAUT_PHYSIQUE();
		this.forceMentale = this.getDEFAUT_MENTAL();
		this.setNom("monPerso"+this.id);
	}
	public Personnage (String nom) {
		this.dernierID += 1;
		this.id = getDernierID();
		this.forcePhysique = this.getDEFAUT_PHYSIQUE();
		this.forceMentale = this.getDEFAUT_MENTAL();
		this.setNom(nom);
	}
	public String getNom( ) {
		return this.nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getForcePhysique() {
		return this.forcePhysique;
	}
	public void setForcePhysique(int forcePhysique) {
		this.forcePhysique = forcePhysique;
	}
	public int getForceMentale() {
		return this.forceMentale;
	}
	public void setForceMentale(int forceMentale) {
		this.forceMentale = forceMentale;
	}
	public String toString() {
		return "Personnage [nom="+this.getNom()+", forcePhysique="+this.getForcePhysique()+", forceMentale ="+this.getForceMentale()+"]";
	}
}
