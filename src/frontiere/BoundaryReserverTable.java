package frontiere;

import java.util.Scanner;

import control.ControlReserverTable;

public class BoundaryReserverTable {
	private ControlReserverTable controlReserverTable;
	private Scanner scan = new Scanner(System.in);
	
	public BoundaryReserverTable(ControlReserverTable controlReserverTable) {
		this.controlReserverTable = controlReserverTable;
	}
	
	public void reserverTable(int numClient) {
		System.out.println("Quand souhaitez vous réserver ?");
		System.out.println("Pour quel mois ?");
		int mois = scan.nextInt();
		System.out.println("Pour quel jour ?");
		int jour = scan.nextInt();
		System.out.println("Pour combien de personnes ?");
		int nombrePersonnes = scan.nextInt();
		System.out.println("Pour quel service ?");
		int numService = scan.nextInt();
		int[] proposition = controlReserverTable.trouverPossibilite(jour, mois, nombrePersonnes, numService);
		System.out.println("Choisissez votre table");
		int numTable = scan.nextInt();
		controlReserverTable.reserver(numClient, numTable, proposition[0]);
	}
}
