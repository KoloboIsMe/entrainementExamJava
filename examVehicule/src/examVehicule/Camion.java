package examVehicule;

public class Camion extends Véhicule{
	private double capaciteMarchandise;
	private double marchandiseEnCharge;
	public Camion(String typeCarburant, int capaciteReservoir, int carburantDisponible) {
		super(typeCarburant, capaciteReservoir, carburantDisponible);
		this.marchandiseEnCharge = 0;
	}
	public Camion(String couleur, String typeCarburant, int capaciteReservoir, int carburantDisponible) {
		super(couleur, typeCarburant, capaciteReservoir, carburantDisponible);
	}
	double getCapaciteMarchanise() {
		return this.capaciteMarchandise;
	}
	double getmarchandiseEnCharge() {
		return this.marchandiseEnCharge;
	}
	void chargerMarchandise(double quantite) {
		if (this.marchandiseEnCharge+quantite >= capaciteMarchandise) {
			System.out.println("Trop de marchandises");
			this.marchandiseEnCharge = this.capaciteMarchandise;
		}
		this.marchandiseEnCharge += quantite;
	}
	void dechargerMarchandise(double quantite) {
		if (this.marchandiseEnCharge-quantite >= 0) {
			System.out.println("Pas assez marchandises");
			this.marchandiseEnCharge = 0;
		}
		this.marchandiseEnCharge += quantite;
	}
	public static void consommerCarburant() {
		if(reservoirVide()) System.out.println("Mon réservoir est vide");
		else carburantDisponible -= 2;
	}
	
}
