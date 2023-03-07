package examEtudiant;

import java.util.Arrays;
import java.util.List;

public class Etudiant {
	private String nom;
	public Etudiant(String nom) {
		this.nom = nom;
		this.lesNotes = Arrays.asList();
	}
	public String getNom() {
		return this.nom;
	}
	private List<Note> lesNotes;
	public List<Note> getNotes() {
		return this.lesNotes;
	}
	public void noter(String matiere, double valeur) {
		this.lesNotes.add(new Note(matiere, valeur));
	}
	public double getMoyenne() {
		int somme = 0;
		int nbrNotes = 0;
		for (int i = 0 ; i < this.lesNotes.size() ; ++i) {
			somme += this.getNotes().get(i).getValeur();
			nbrNotes += 1;
		}
		return somme/nbrNotes;
	}
	@Override
	public String toString() {
		return "Etudiant "+this.getNom()+" - Moyenne : "+ this.getMoyenne();
	}
}
