package model;

public class ReservationSpectacle extends Reservation {
	private int numZone;
	private int numPlace;
	
	public ReservationSpectacle(int jour, int mois, int numZone, int numPlace) {
		this.jour = jour;
		this.mois = mois;
		this.numZone = numZone;
		this.numPlace = numPlace;
	}
	
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Le " + jour + "/" + mois + " : ");
		chaine.append("place n°"+numPlace+" dans la zone "+numZone+".");
		return chaine.toString();
	}
}
