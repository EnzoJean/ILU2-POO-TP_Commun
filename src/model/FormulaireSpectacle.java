package model;

public class FormulaireSpectacle extends Formulaire {
	private int numZone;
	
	public FormulaireSpectacle(int jour, int mois, int numZone) {
		this.jour = jour;
		this.mois = mois;
		this.numZone = numZone;
	}
	
	public int getNumZone() {
		return this.numZone;
	}
}
