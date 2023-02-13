import java.util.Scanner;

public class Exercise4 {
    /*
    4.	Create a java program that will convert dollars to pesos. (Php 48.34 = $1).
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter how much you have in dollars");
        double dollar = scan.nextDouble();
        scan.close();

        double dollarToPeso = dollar * 48.34;

        System.out.printf("\n$%.2f is equivalent to %,.2f Pesos\n", dollar, dollarToPeso);

    }

}
