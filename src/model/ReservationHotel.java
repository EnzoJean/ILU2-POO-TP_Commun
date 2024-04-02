package model;

public class ReservationHotel extends Reservation {
	private int nbLitSimple;
	private int nbLitDouble;
	private int numChambre;
	
	public ReservationHotel(int jour, int mois, int nbLitSimple, int nbLitDouble, int numChambre) {
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
		this.numChambre = numChambre;
		this.jour = jour;
		this.mois = mois;
	}
	
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Le " + jour + "/" + mois + " : ");
		chaine.append("chambre n°"+numChambre+" avec "+nbLitSimple+" lits simples et "+nbLitDouble+ " lits doubles.");
		return chaine.toString();
	}
}
