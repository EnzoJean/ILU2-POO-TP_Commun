package model;

public class CentraleDeReservation <T extends EntiteReservable, F extends Formulaire> {
	private T[] entites;
	private int nbEntites = 0;
	
	public CentraleDeReservation(T[] entites) {
		this.entites = entites;
	}
	
	public int ajouterEntite(T entite) {
		this.entites[nbEntites] = entite;
		nbEntites+=1;
		int num = nbEntites;
		entite.setNumero(num);
		return num;
	}
	
	public int[] donnerPossibilites(F formulaire) {
		int tableau[] = new int[nbEntites];
		for (int i=0; i<nbEntites; ++i) {
			if (entites[i].compatible(formulaire))
				tableau[i] = i+1;
			else 
				tableau[i] = 0;
		}
		return tableau;
	}
	
	public Reservation reserver(int numEntite, F formulaire) {
		System.out.println("Entrée dans rerserver de centrale");
		if (numEntite>nbEntites) return null;
		return entites[numEntite].reserver(formulaire);
	}
}
