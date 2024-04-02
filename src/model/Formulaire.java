package model;

public abstract class Formulaire {
	public int jour;
	public int mois;
	public int numEntite;
	
	public int getJour() {
		return jour;
	}
	
	public int getMois() {
		return mois;
	}
	
	public int getIdentificationEntite() {
		return numEntite;
	}
	
	public void setIdentificationEntite(int numEntite) {
		this.numEntite = numEntite;
	}
}
