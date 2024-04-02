package model;

public class CalendrierAnnuel {
	private Mois[] calendrier = new Mois[12]; 
	
	public CalendrierAnnuel() {
		this.calendrier[0] = new Mois("Janvier", 31);
		this.calendrier[1] = new Mois("Février", 28);
		this.calendrier[2] = new Mois("Mars", 31);
		this.calendrier[3] = new Mois("Avril", 30);
		this.calendrier[4] = new Mois("Mai", 31);
		this.calendrier[5] = new Mois("Juin", 30);
		this.calendrier[6] = new Mois("Juillet", 31);
		this.calendrier[7] = new Mois("Août", 31);
		this.calendrier[8] = new Mois("Septembre", 30);
		this.calendrier[9] = new Mois("Octobre", 31);
		this.calendrier[10] = new Mois("Novembre", 30);
		this.calendrier[11] = new Mois("Décembre", 31);
	}
	
	public boolean estLibre(int jour, int mois) {
		return calendrier[mois-1].estLibre(jour);
	}

	public boolean reserver(int jour, int mois) {
		boolean value = false;
		if (estLibre(jour, mois)) {
			value = true;
			try {
				calendrier[mois-1].reserver(jour);
			} catch(IllegalStateException e) {
				value = false;
			}
		}
		return value;
	}
	
	public class Mois {
		private String nom;
		private boolean[] jours;
		
		public Mois(String nom, int nbJours) {
			this.nom = nom;
			this.jours = new boolean[nbJours];
			for (int i = 0; i<nbJours; ++i) {
				this.jours[i] = false;
			}
		}
		
		public boolean estLibre(int jour) {
			return !(this.jours[jour-1]);
		}
		
		public void reserver(int jour) throws IllegalStateException{
			if(estLibre(jour))
				this.jours[jour-1] = true;
			else
				throw new IllegalStateException();
		}
	}
}
