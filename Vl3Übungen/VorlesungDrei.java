import java.util.Scanner;
import java.util.Random;


public class VorlesungDrei
{
    public static void main(String[] args)
    {
        float rechnung = 0.123456789f- 0.123456788f;
        
        //Zeichenketten
        System.out.println("4+5");
        System.out.println("Dies ist" + "ein Text");
        System.out.println("Diesw ist ein \nText");

        //Zeichen
        System.out.println(2147483647); //normale int ausgabe des maximalen Wert
        System.out.println(2147483647+1); // Overflow, Java ist vorzeichen behaftet und geht nun ins Zweierkomplement (-2147483647)
        System.out.println(0xFF); //64
        System.out.println(0xFFFF); //256

        //Gleitpunktzahlen
        System.out.println("Zahl "+ 0.12345678901234567890); //ausgabe
        System.out.println("Zahl "+ 0.12345678901234567890f); //float hat nur eine Genauigkeit von 7 Dezimalstellen (32bit) alles drüber hinaus wird abgerundet 
        System.out.println("Summe " + (5.6 + 5.8)); //floatwert maximale ausgabe
        System.out.println("Differenz " + (0.123456789f- 0.123456788f)); //differez ausgabe 0,0 aufgrund des deklarierten float typen und der fehlenden anweisung ,0 zu ignorieren siehe nächste Zeile
        System.out.printf("Abgerundet: %.0f%n", rechnung); // HIER WIRD ABER NUR DIE ANZEIGE ABGERUNDET!
        System.out.println("Ergbenis im speicher abgerundet: "+ ergebnis);
        System.out.println("Summe "+ ((12345678.0f + 0.1f)+ 0.41f)); //1,2345678*10^7 wird in wissenschaftlicher schreibweise geschrieben um speicher zu sparen
        System.out.println("Summe " + (12345678.0f + 0.12f + 0.41f));
    }
    
}