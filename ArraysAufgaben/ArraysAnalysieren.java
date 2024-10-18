
import java.util.Scanner;

public class ArraysAnalysieren {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eingabe;
        int summe = 0;
        int mittelwert = 0;
        int positiv = 0;
        int negativ = 0;
        int index1;
        int index2;
        int sortierung;
        int[] intArray = new int[10];

        //eingabe
        System.out.println("Geben sie 10 Werte ein: ");
        for (int i = 0; i < intArray.length; i++) {
            eingabe = scanner.nextInt();
            intArray[i] = eingabe;
        }

        //ausgabe
        System.out.println("Eingelesene Werte :");
        for (int i : intArray) {
            System.out.println("." + i);
        }

        //Summe + Mittelwert ausgeben 
        System.out.println("Summe ausgeben:");
        for (int i : intArray) {
            summe += i;
        }
        mittelwert = summe / intArray.length;
        System.out.println("Summe:" + summe);
        System.out.println("Mittelwert:" + mittelwert);

        //Min Wert
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
               sortierungsreihenfolge(intArray, j, j + 1, 1);
            }
        }
        System.out.println("Min Wert :" + intArray[0]);

        //Max Wert
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j > intArray.length - i - 1; j++) {
                sortierungsreihenfolge(intArray, j, j + 1, 2);

            }
        }
        System.out.println("Max Wert :" + intArray[intArray.length-1]);

        
        //Positive und Negative Zahlen ermitteln
        for (int i : intArray) {
            if (i < 0) {
                negativ++;
            } else {
                positiv++;
            }
        }
        System.out.println("Positive Zahlen :" + positiv);
        System.out.println("Negative Zahlen :" + negativ);
    }



    public static void sortierungsreihenfolge(int[] intArray, int index1, int index2, int sortierung) {
        //Max Wert
        if (intArray[index1] > intArray[index2] && sortierung == 1) {
            int temp = intArray[index1];
            intArray[index1] = intArray[index2];
            intArray[index2] = temp;
        }
        //Min Wert
        if (intArray[index1] < intArray[index2] && sortierung == 2) {
            int temp = intArray[index1];
            intArray[index1] = intArray[index2];
            intArray[index2] = temp;
        }
    }
}
