package model;

public abstract class EntiteReservable <T extends Formulaire>{
	public CalendrierAnnuel calendrier;
	private int numero;
	
	public EntiteReservable(int num) {
		this.calendrier = new CalendrierAnnuel();
		this.numero = num;
	}

	public boolean estLibre(T formulaire) {
		int jour = formulaire.getJour();
		int mois = formulaire.getMois();
		return calendrier.estLibre(jour, mois);
	}
	
	public abstract boolean compatible(T formulaire);
	
	public abstract Reservation reserver(T formulaire);
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int nouveauNumero) {
		this.numero = nouveauNumero;
	}
}
