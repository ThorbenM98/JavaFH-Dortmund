import java.util.Scanner;
import java.util.Random;



public class AdditionMitMatrNr {

	
	public static void main(String[] args)
	{
		//771071
		//,,Pseudo 64 Bit"
		int[] zahl= new int[512];
		int arraySize;
		int eingabe;
		int neueMatrNr=771071;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben sie Ganze Zahlen ein, diese werden auf ihrer Martikelnummer hinzuaddiert.");
		System.out.println("Wie viele Zahlen möchten sie eingeben?");
		arraySize=scanner.nextInt();
		
		for(int i=0; i<=arraySize;i++)
		{	
			System.out.println(i+". Zahl :");
			eingabe=scanner.nextInt();
			zahl[i]=eingabe;
		
		}
		
		
		for(int j=0; j<=arraySize;j++)
		{	
			neueMatrNr+=zahl[j];
		}
		System.out.println(neueMatrNr);

		
	}
	
}
