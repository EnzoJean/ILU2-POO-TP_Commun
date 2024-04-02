package model;

public class ReservationRestaurant extends Reservation {
	private int numService;
	private int numTable;
	
	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		this.jour = jour;
		this.mois = mois;
		this.numService = numService;
		this.numTable = numTable;
	}
	
	@Override
	public String toString() {
		String service = "premier";
		if (numService != 1) {
			service = "deuxième";
		}
		StringBuilder chaine = new StringBuilder();
		chaine.append("Le " + jour + "/" + mois+"\n");
		chaine.append("Table "+numTable+" pour le "+service+" service.");
		return chaine.toString();
	}
}
