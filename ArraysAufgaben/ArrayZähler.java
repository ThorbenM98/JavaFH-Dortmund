
import java.util.Random;
import java.util.Scanner;

public class ArrayZähler {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int korrekteTüte[] = new int[16];
        int fehlerHaft[] = new int[20];
        int fehlerhafteNummer[] = new int[20];
        int fehlerhaftStk = 0;
        int korrekt = 0;
        int eingabe;
        int anzahl;
        System.out.println("Wie viele Tüten sollen gezählt werden?");
        eingabe = scanner.nextInt();

        for (int i = 1; i < eingabe; i++) {
            // Erzeugt eine Zufallszahl zwischen 11 und 16
            anzahl = 11 + random.nextInt(6); 
            if (anzahl != 12) {
                fehlerhaftStk++;
                fehlerHaft[i] = anzahl;
                fehlerhafteNummer[i] = i;
                System.out.println("Fehlerhafte befüllung bei Tüte " + fehlerhafteNummer[i] + ". " + fehlerHaft[i] + " stk.");
            } else if (anzahl == 12) {
                korrekteTüte[i] = anzahl;
                korrekt++;
            }
        }

        //ausgabe
        System.out.println("Korrekt abgepackte tüten: " + korrekt);
        System.out.println("Falsch abgepackte Tüten: " + fehlerhaftStk);

       

    }
}
