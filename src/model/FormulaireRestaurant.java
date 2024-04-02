package model;

public class FormulaireRestaurant extends Formulaire {
	private int nbPers;
	private int numService;
	
	public FormulaireRestaurant(int jour, int mois, int nbPers, int numService) {
		this.jour = jour;
		this.mois = mois;
		this.nbPers = nbPers;
		this.numService = numService;
	}
	
	public int getNombrePersonnes() {
		return this.nbPers;
	}
	
	public int getNumService() {
		return this.numService;
	}
}
