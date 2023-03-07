package examEtudiant;

public class Note {
	private String matiere;
	private double valeur;
	public Note(String matiere, double valeur) {
		this.matiere = matiere;
		this.valeur = valeur;
	}
	public String getMatiere() {
		return this.matiere;
	}
	public double getValeur() {
		return this.valeur;
	}
	@Override
	public String toString() {
		return this.getMatiere()+" : "+this.getValeur();
	}
}
