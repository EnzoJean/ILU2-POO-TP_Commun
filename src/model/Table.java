package model;

public class Table extends EntiteReservable<FormulaireRestaurant>{
	private CalendrierAnnuel calendrierDeuxiemeService;
	private int nbChaises;
	
	public Table(int nbChaises, int num) {
		super(num);
		this.nbChaises = nbChaises;
		calendrierDeuxiemeService = new CalendrierAnnuel();
	}

	@Override
	public boolean compatible(FormulaireRestaurant formulaire) {
		boolean value = false;
		int jour = formulaire.getJour();
		int mois = formulaire.getMois();
		int numService = formulaire.getNumService();
		if (nbChaises == formulaire.getNombrePersonnes() || nbChaises == formulaire.getNombrePersonnes()+1) {
			if (numService == 2 && calendrierDeuxiemeService.estLibre(jour, mois))
				value = true;
			else if (numService == 1 && calendrier.estLibre(jour, mois))
				value = true;
		}
		return value;
	}

	@Override
	public Reservation reserver(FormulaireRestaurant formulaire) {
		System.out.println("Entrée dans réserver de table\n");
		Reservation reservationRestaurant = null;
		int jour = formulaire.getJour();
		int mois = formulaire.getMois();
		int numService = formulaire.getNumService();
		int nbPersonnes = formulaire.getNombrePersonnes();
		System.out.println("AU DESSUS DU IF");
		if (nbChaises == nbPersonnes || nbChaises == nbPersonnes+1) {
			System.out.println("BON POUR LES CHAISES");
			if (numService == 2 && calendrierDeuxiemeService.estLibre(jour, mois)) {
				System.out.println("Res possible pour le 2eme serv");
				calendrierDeuxiemeService.reserver(jour, mois);
				reservationRestaurant = new ReservationRestaurant(jour, mois, 2, this.getNumero());
				
			} else if (numService == 1 && calendrier.estLibre(jour, mois)) {
				System.out.println("Res possible pour le 1er serv");
				calendrier.reserver(jour, mois);
				reservationRestaurant = new ReservationRestaurant(jour, mois, 1, this.getNumero());
			}
		}
		System.out.println("FIN DE LA FCT ???");
		return reservationRestaurant;
	}

}
