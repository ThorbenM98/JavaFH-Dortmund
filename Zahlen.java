
import java.util.Scanner;
import java.util.Random;

public class Zahlen {

	public static int check(int ganzeZahl, int teiler)
	{

		return ganzeZahl % teiler;
	}

	public static void main(String[] args)
	{
		//Deklaration und Init.
		int[] array;
		array = new int[4096]; // array mit 4096 Werten
		int modulo;
		int teiler = 0;
		//
		//Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben sie eine Ganzzahl ein :");
		int ganzeZahl = scanner.nextInt();
		scanner.close();
		//
		
		modulo = check(ganzeZahl, 2);
		if (modulo == 1)
		{
			System.out.println("Die Zahl " + ganzeZahl + " ist ungerade");

		} else if (modulo == 0)
		{
			System.out.println("Die Zahl " + ganzeZahl + " ist gerade");
		}
		modulo = check(ganzeZahl, 3);
		if (modulo == 0) 
		{
			System.out.println("Die Zahl " + ganzeZahl + " ist durch 3 teilbar");
		}
		if (modulo > 0) 
		{
			System.out.println(ganzeZahl + " Diese zahl ist nicht durch 3 Teilbar");
		}

		if (ganzeZahl < 0) 
		{
			System.out.println("Die zahl ist negativ");
		} 
		else if (ganzeZahl > 0) 
		{
			System.out.println("Die Zahl ist positiv");
		}
		
		//Überprüfung der GanzeZahl mit allen 2er potenzen bis zu seiner größe
		for (int i = 2; i <= ganzeZahl; i = i * 2)
		{

			array[i] = i;
			if (ganzeZahl == i) {

				System.out.println(ganzeZahl + " Diese zahl ist eine Zweierpotenz");

			}

		}
		for (int j = 0; j <= ganzeZahl; j++) 
		{
			if ((ganzeZahl != array[j]) && ganzeZahl == j) {
				System.out.println(ganzeZahl + " Diese zahl ist keine Zweierpotenz");
			}
		}

		//
	}

}