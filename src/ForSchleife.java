import java.util.Scanner;

public class ForSchleife
{

    // Methode gibt den eingelesenen Integer zurück
    public static int readAndReturnInteger() 
    {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Gebe eine Positive Dezimalzahl ein: "); 
        int intValue = scanner.nextInt(); 
        System.out.println(intValue); 
        return intValue;  // Rückgabe des Werts
    }

    
    public static void main(String[] args)
    {
    	int modulo;
    	int testloop=100;
    	String myString="";
        // Aufruf der Methode und Speichern des Rückgabewerts in intValue
        int intValue = readAndReturnInteger();
        
       do
       {
    	   
    	   modulo=intValue % 2;
    	   intValue=intValue / 2;
           myString += modulo;
           if(intValue==1)
           {
        	   modulo=intValue % 2;
        	    myString += modulo;
        	   break;
           }
        
           testloop--;
       }while(testloop>1);
       
    // Ausgabe des Strings in normaler Reihenfolge (ursprünglich berechnet)
       System.out.println("\nOriginal Modulo-Ergebnisse: " + myString);

       // Umkehrung des Strings
       String reversedString = new StringBuilder(myString).reverse().toString();
       
       // Ausgabe des umgekehrten Strings
       System.out.println("Spiegelverkehrt: " + reversedString);
    }
}
