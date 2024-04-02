package model;

public class EntiteReservable <T extends Formulaire>{
	private CalendrierAnnuel carnet;
	private int numero;
	private Formulaire formulaire;
	
	public EntiteReservable(int num) {
		this.carnet = new CalendrierAnnuel();
		this.numero = num;
	}

	
	
	public int getNumero() {
		return this.numero;
	}
}
