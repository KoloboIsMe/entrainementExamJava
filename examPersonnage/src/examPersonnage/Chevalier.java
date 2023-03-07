package examPersonnage;

public class Chevalier extends Personnage{
	private static int DEFAUT_PHYSIQUE = 50;
	public Chevalier() {
		super();
	}
	public Chevalier(String nom) {
		super(nom);
	}
	public String toString() {
		return "Chevalier ["+super.toString()+"]";
	}
	public String joue() {
		System.out.println("Attention, Chevalier "+ this.getNom()+" joue !");
		return "Attention, Chevalier "+ this.getNom()+" joue !";
	}
	public static int getDEFAUT_PHYSIQUE() {
		return DEFAUT_PHYSIQUE;
	}
	public static void setDEFAUT_PHYSIQUE(int physique) {
		DEFAUT_PHYSIQUE=physique;
	}
}
