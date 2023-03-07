package examPersonnage;

public class Jedi extends Chevalier{
	private static int DEFAUT_PHYSIQUE = 150;
	private static int DEFAUT_MENTAL = 100;
	public Jedi() {
		super();
	}
	public Jedi(String nom) {
		super(nom);
	}
	public String joue() {
		System.out.println(super.joue()+" LA FORCE EST AVEC ELLE !");
		return super.joue()+" LA FORCE EST AVEC ELLE !";
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
}
