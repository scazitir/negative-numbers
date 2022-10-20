import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.CANADA);
        Scanner scan = new Scanner(System.in);

        System.out.print("How many numbers would you like to input: ");
        int n = scan.nextInt();

        int[] arrayOfNumbers = new int[n];
        for (int i = 0; i < arrayOfNumbers.length; i++){
            System.out.print("Type a number: ");
            arrayOfNumbers[i] = scan.nextInt();
        }

        System.out.println();
        System.out.println("Negative numbers: ");
        for (int i = 0; i < arrayOfNumbers.length; i++){
            if (arrayOfNumbers[i] < 0){
                System.out.println(arrayOfNumbers[i]);
            }

        }

        scan.close();
    }
}
