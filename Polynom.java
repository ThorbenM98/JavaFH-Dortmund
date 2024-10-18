import java.util.Scanner;



public class Polynom {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("geben sie den wert für X ein:");
		final int x = scanner.nextInt();
		int mon1;
		mon1=x*5;
		int mon2;
		mon2=mon1+3*x*x;
		mon1 = mon2 + x * x * x;
		System.out.println("mon1: "+mon1);
			
		
	}

}
