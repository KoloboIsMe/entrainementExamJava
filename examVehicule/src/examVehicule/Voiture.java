package examVehicule;

public class Voiture extends Véhicule{
	public Voiture(String typeCarburant, int capaciteReservoir, int carburantDisponible) {
		super(typeCarburant, capaciteReservoir, carburantDisponible);
	}
	public Voiture(String couleur, String typeCarburant, int capaciteReservoir, int carburantDisponible) {
		super(couleur, typeCarburant, capaciteReservoir, carburantDisponible);
	}
}
