import java.util.Scanner;

public class Main
{	

	
	public static int readAndReturnInteger() //Funktion zur Eingabe
	{
		Scanner scanner = new Scanner(System.in); //,,scanf" deklarieren
		System.out.println("Bis zu welcher Zahl möchten sie alle Dezimalzahlen in Binär umgewandelt haben?: ");
		int intValue = scanner.nextInt(); //Einlesen eines Int
		return intValue; //eingelesene Variabel nun ausgeben und der Main Funktion übergeben
	}
	
	
	
	public static String calculate(int j) //Funktion zur Umrechnung von dec->bin
	{ 
		int modulo;
		String myString="";
		int temp=j;
			
		do {
			modulo=j % 2;
			j=j/2;
			myString+=modulo;
		
		}while(j>0);
			
		return myString;
	}
	
	

	public static void main(String[] args) //Funktion zur Konsolenausgabe
	{	
		
		int intValue = readAndReturnInteger();
		for(int i=0; i<= intValue; i++)
		{	
			String result = calculate(i);
			// Umkehrung des Strings
		    String reversedString = new StringBuilder(result).reverse().toString();
			System.out.println(i + ":" + reversedString);
		}
	
	}
	
	

}
