package model;

public class FormulaireHotel extends Formulaire {
	private int nbLitSimple;
	private int nbLitDouble;
	
	public FormulaireHotel(int jour, int mois, int nbLitSimple, int nbLitDouble) {
		this.jour = jour;
		this.mois = mois;
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
	}
	
	public int getNbLitSimple() {
		return this.nbLitSimple;
	}
	
	public int getNbLitDouble() {
		return this.nbLitDouble;
	}
}
