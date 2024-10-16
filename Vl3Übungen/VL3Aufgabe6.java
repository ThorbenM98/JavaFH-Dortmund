
import java.util.Scanner;

public class VL3Aufgabe6 {

	public static void main(String[] args) {
		int eingabe;
		boolean schaltjahr = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wählen sie aus:");
		System.out.println("1. Schaltjahr bestimmen, geben sie ein Jahr von 0 bis 4096 ein");
		System.out.println("2. Schaltjahr automatisch bestimmen, geben sie ein Jahr von 0 bis 4096 ein");
		System.out.println("3. nur Schaltjahre ausgeben, geben sie ein Jahr von 0 bis 4096 ein");
		// Menüeingabe
		eingabe = scanner.nextInt();

		if (eingabe > 3 || eingabe < 0) {
			System.out.println("Kein gültiger Wert!");
			System.exit(0);
		}
  
		
		if (eingabe == 1) {
			// Jahreseingabe
			eingabe = scanner.nextInt();
			schaltjahr = rechnung(eingabe);
			System.out.println(schaltjahr);
		}

		else if (eingabe == 2) {
			eingabe = sicherheitsAbfrage(eingabe, scanner);
			for (int i = 0; i <= eingabe; i++) {
				schaltjahr = rechnung(i);
				System.out.println(i + ". :" + schaltjahr);
			}

		} else if (eingabe == 3) {
			eingabe = sicherheitsAbfrage(eingabe, scanner);
			for (int i = 0; i <= eingabe; i++) {
				schaltjahr = rechnung(i);
				if (schaltjahr == true) {
					System.out.println(i + ". :" + schaltjahr);
				}

			}
		}
	}

	//Funktion zur Sicherheitsabfrage
	public static int sicherheitsAbfrage(int eingabe, Scanner scanner) {
		System.out.println("bis wohin soll der Wert automatisch zählen? (maximal 4096)");
		eingabe = scanner.nextInt();
		// sicherheitsabfrage zur Speicherschonung
		if (eingabe > 4096) {
			System.out.println("Error");
			System.exit(0);
		}
		return eingabe;
	}

	
	//Funkktion zur Berechnung der Jahre
	public static boolean rechnung(int eingabe) {
		boolean schaltjahr = false;
		if (eingabe % 4 == 0) {
			schaltjahr = true;

			if (eingabe % 100 == 0) {
				schaltjahr = false;
				if (eingabe % 400 == 0) {
					schaltjahr = true;

				}
			}
		}
		return schaltjahr;
	}
}
