package examEtudiant;

public class Alternant extends Etudiant {
	public Alternant(String nom) {
		super(nom);
	}
	private Evaluation evaluation;
	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}
	@Override
	public double getMoyenne() {
		double bonus = 0;
		switch (this.evaluation) {
		case Excellent : bonus = 2;
		case Satisfaisant : bonus = 1;
		case Passable : bonus = 0 ;
		case Insufisant : 
			if(super.getMoyenne()>0) {
				return super.getMoyenne() -1;
			}
			else {
				return 0;
			}
		}
		return super.getMoyenne() + bonus;
	}
	@Override
	public String toString() {
		String res = super.toString() + " - Evaluation : " + this.evaluation + "\n ";
		for( int i = 0 ; i < this.getNotes().size() ; ++i) {
			res += "\t" + this.getNotes().get(i).getMatiere() + " : " + this.getNotes().get(i).getValeur();
		}
		return res;
	}
}
