package examEtudiant;

public class Main {
	public static void main(String[] args) {
		Etudiant leo = new Etudiant("Léo");
		leo.noter("Anglais", 15);
		leo.noter("Java", 17);
		leo.noter("Maths", 14);
		System.out.println(leo.toString());
	}
}
