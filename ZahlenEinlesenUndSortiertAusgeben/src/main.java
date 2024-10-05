import java.util.Scanner;
import java.util.Random;

public class main {

    // Methode, um eine Benutzerzahl einzulesen
    public static int readUserInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein:");
        return scanner.nextInt();
    }

    // Methode zur Auswahl und Ausführung der Sortierung (aufsteigend/absteigend)
    public static void sortArray(int[] array, int sortOrder)
    {
        for (int i = 0; i < array.length - 1; i++) 
        {
            for (int j = 0; j < array.length - i - 1; j++)
            {
                if (sortOrder == 1 && array[j] < array[j + 1]) 
                { // Absteigend
                    swapElements(array, j, j + 1);
                } else if (sortOrder == 2 && array[j] > array[j + 1])
                { // Aufsteigend
                    swapElements(array, j, j + 1);
                }
            }
        }
    }

    // Hilfsmethode zum Tauschen von zwei Elementen im Array
    public static void swapElements(int[] array, int index1, int index2)
    {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // Methode zur Erstellung einer zufälligen Zahl
    public static int createRandomNumber(int max) 
    {
        Random random = new Random();
        return random.nextInt(max);
    }

    // Hauptmenü, in dem der Benutzer eine Auswahl trifft
    public static int showMainMenuAndGetChoice()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Was möchten Sie machen?");
        System.out.println("1. Zahlen sortieren (aufsteigend)");
        System.out.println("2. Zahlen sortieren (absteigend)");
        System.out.println("3. Zufällige Zahlen sortieren + ungerade markieren");
        System.out.println("4. Zufällige Zahlen sortieren + in Binär ausgeben");
        System.out.println("5. Zahlen sortieren + in Hex ausgeben");

        return scanner.nextInt();
    }

    // Hauptlogik für den Fall 3: Zufällige Zahlen sortieren und ungerade markieren
    public static void handleRandomSortAndMarkOdds(int[] array) 
    {
        fillArrayWithRandomNumbers(array);
        sortArrayBasedOnUserChoice(array);
        printArrayWithOddMarkers(array);
    }

    // Hauptlogik für den Fall 4: Zufällige Zahlen sortieren und in Binär ausgeben
    public static void handleRandomSortAndConvertToBinary(int[] array)
    {
        fillArrayWithRandomNumbers(array);
        sortArrayBasedOnUserChoice(array);
        printArrayInBinary(array);
    }
    
    
    // Hauptlogik für den Fall 5: Zufällige Zahlen sortieren und in Hex ausgeben
    public static void handleRandomSortAndConvertToHex(int[] array)
    {
        fillArrayWithRandomNumbers(array);
        sortArrayBasedOnUserChoice(array);
        printArrayInHex(array);
    }
    
  

    // Füllt das Array mit zufälligen Zahlen
    public static void fillArrayWithRandomNumbers(int[] array) 
    {
        for (int i = 0; i < array.length; i++) {
            array[i] = createRandomNumber(array.length);
        }
    }

    // Sortiert das Array basierend auf der Benutzerauswahl
    public static void sortArrayBasedOnUserChoice(int[] array)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aufsteigend oder Absteigend sortieren?");
        System.out.println("1. Absteigend");
        System.out.println("2. Aufsteigend");
        int sortOrder = scanner.nextInt();
        sortArray(array, sortOrder);
    }

    // Gibt das Array aus, wobei ungerade Zahlen markiert werden
    public static void printArrayWithOddMarkers(int[] array) 
    {
        for (int value : array) {
            if (value % 2 == 1) {
                System.out.print("ungerade ");
            }
            System.out.println(value);
        }
    }

    // Gibt das Array in Binärform aus
    public static void printArrayInBinary(int[] array)
    {
        for (int value : array) {
            String binaryString = convertDecimalToBinary(value);
            String reversedBinaryString = new StringBuilder(binaryString).reverse().toString();
            System.out.println(value + " : " + reversedBinaryString);
        }
    }
    
    // Gibt das Array in Hexform aus
    public static void printArrayInHex(int[] array)
    {
        for (int value : array) {
            String binaryString =  convertDecimalToHex(value);
            String reversedBinaryString = new StringBuilder(binaryString).reverse().toString();
            System.out.println(value + " : " + reversedBinaryString);
        }
    }

    // Konvertiert eine Dezimalzahl in einen Binär-String
    public static String convertDecimalToBinary(int number)
    {
        StringBuilder binaryString = new StringBuilder();
        do {
            int remainder = number % 2;
            number /= 2;
            binaryString.append(remainder);
        } while (number > 0);
        return binaryString.toString();
    }
    
    public static String convertDecimalToHex(int number)
    {
    	   StringBuilder hexString = new StringBuilder();
           do {
             int remainder = number % 16;
             number /= 16;
             if(remainder==10)
             {
            	 hexString.append("A");
             }
             else if(remainder==11)
             {
            	 hexString.append("B");
             }
             else if(remainder==12)
             {
            	 hexString.append("C");
             }
             else if(remainder==13)
             {
            	 hexString.append("D");
             }
             else if(remainder==14)
             {
            	 hexString.append("E");
             }
             else if(remainder==15)
             {
            	 hexString.append("F");
             }
             else
             {
            	 hexString.append(remainder); 
             }
           } while (number > 0);
           return hexString.toString();
    }

    // Hauptmethode
    public static void main(String[] args)
    {
        int choice = showMainMenuAndGetChoice();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bis zu welcher Zahl wollen Sie zählen?");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        switch (choice) 
        {
            case 1:
                for (int i = 0; i < arraySize; i++)
                {
                    array[i] = i;
                }
                sortArray(array, 2); // Aufsteigend sortieren
                printArrayWithOddMarkers(array);
                break;

            case 2:
                for (int i = arraySize - 1; i >= 0; i--) 
                {
                    array[arraySize - 1 - i] = i;
                }
                sortArray(array, 1); // Absteigend sortieren
                printArrayWithOddMarkers(array);
                break;

            case 3:
                handleRandomSortAndMarkOdds(array);
                break;

            case 4:
                handleRandomSortAndConvertToBinary(array);
                break;

            case 5:
            	handleRandomSortAndConvertToHex(array);
                // Implementiere die Logik für Hexadezimalausgabe hier
                break;

            default:
                System.out.println("Ungültige Auswahl");
                break;
        }
    }
}
