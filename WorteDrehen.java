import java.util.Scanner;
import java.util.Random;

public class WorteDrehen 
{

	public static void main(String[] args) 
	{
		boolean eins=false;
		boolean zwei=false;
		boolean drei=false;
		int randomNumber;
		Scanner scanner = new Scanner(System.in);
		// new String umd das array zu initialisieren für 100 zeichen
		String myString[] = new String[100];
		String eingabe;
		String space = "\t";
		System.out.println("Wie viele Zeichenketten wollen sie eingeben?");
		int chainlength = scanner.nextInt();

		for (int i = 1; i <= chainlength+1; i++) 
		{
			// nextLine() wichtig um strings einzugeben.
			eingabe = scanner.nextLine();
			myString[i] = eingabe;
			if(i<4)
			{
				System.out.println("Geben sie die " + i + ". Zeichenkette ein.");
			}
			
		

		}

		//andersherumausgeben
		for (int j = chainlength; j >=0; j--) 
		{
			System.out.print(myString[j+1] + space);
		}

		System.out.println("");
		//Zufällige reihenfolge
		for(int k= 1; k<=chainlength+1; k++)
		{	
			//Zufälige Zahl zwischen 1 und 3
			randomNumber=(int) (Math.random()*4);
			if(randomNumber==1  &&eins==false)
			{
				
				System.out.print(myString[2]+space);
				eins=true;
				continue;
			}
			
			else if(randomNumber==2 &&zwei==false)
			{
				
				System.out.print(myString[3]+space);
				zwei=true;
				continue;
			}
			else if(randomNumber==3 && drei==false)
			{
	
				System.out.print(myString[1]+space);
				 drei=true;
				 continue;
			}
			
			k--;
			if(eins==true && zwei==true && drei==true)
			{
				break;
			}
			
		}
	}

}
