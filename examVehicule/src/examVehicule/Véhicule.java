package examVehicule;

public class Véhicule {
	String couleur = "blanc";
	String typeCarburant;
	int capaciteReservoir;
	static int carburantDisponible;
	public Véhicule(String typeCarburant, int capaciteReservoir, int carburantDisponible) {
		this.typeCarburant = typeCarburant;
		this.capaciteReservoir = capaciteReservoir;
		this.carburantDisponible = carburantDisponible;
	}
	public Véhicule(String couleur, String typeCarburant, int capaciteReservoir, int carburantDisponible) {
		this.couleur = couleur;
		this.typeCarburant = typeCarburant;
		this.capaciteReservoir = capaciteReservoir;
		this.carburantDisponible = carburantDisponible;
	}
	@Override
	public String toString() {
		return "[couleur : "+this.couleur
				+", typeCarburant : "+this.typeCarburant
				+", capaciteReservoir : "+this.capaciteReservoir
				+", carburantDisponnible : "+this.carburantDisponible+"]";
	}
	public static void consommerCarburant() {
		if(reservoirVide()) System.out.println("Mon réservoir est vide");
		else carburantDisponible -= 1;
	}
	public void faireLePlein() {
		if (reservoirPlein()) System.out.println("Réservoir déjà plein !");
		this.carburantDisponible = capaciteReservoir;
	}
	public void ajouterCarburant(int quantite) {
		if (this.carburantDisponible + quantite >= capaciteReservoir) {
			this.faireLePlein();
			System.out.println("Mon réservoir est déjà plein !");
		}
		else this.carburantDisponible += quantite;
	}
	public static boolean reservoirVide() {
		if (carburantDisponible <= 0) return true;
		return false;
	}
	public boolean reservoirPlein() {
		if (this.carburantDisponible >= this.capaciteReservoir) return true;
		return false;
	}
 }
