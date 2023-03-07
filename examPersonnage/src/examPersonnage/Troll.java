package examPersonnage;

public class Troll extends Personnage{
	private static int DEFAUT_MENTAL = 42;
	public Troll() {
		super();
	}
	public Troll(String nom) {
		super(nom);
	}
	@Override
	public String toString() {
		return "Troll ["+super.toString()+"]";
	}
	@Override
	public String joue() {
		System.out.println(this.getNom()+" joue !");
		return this.getNom()+" joue !";
	}
	public static int getDEFAUT_MENTAL() {
		return DEFAUT_MENTAL;
	}
	public static void setDEFAUT_MENTAL(int physique) {
		DEFAUT_MENTAL=physique;
	}
}
