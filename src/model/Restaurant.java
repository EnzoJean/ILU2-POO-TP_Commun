package model;

public class Restaurant {
	private CentraleDeReservation<Table,FormulaireRestaurant> centrale = new CentraleDeReservation<Table,FormulaireRestaurant>(new Table[10]);;
	
	public void ajouterTable(int nbChaises) {
		Table table = new Table(nbChaises, 0);
		centrale.ajouterEntite(table);
	}
	
	public int[] donnerPossibilites(FormulaireRestaurant formulaire) {
		return centrale.donnerPossibilites(formulaire);
	}
	
	public Reservation reserver(int numEntite, FormulaireRestaurant formulaire) {
		System.out.println("Entrée dans reserver");
		return centrale.reserver(numEntite-1, formulaire);
	}
}
