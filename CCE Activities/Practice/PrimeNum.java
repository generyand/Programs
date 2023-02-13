package Practice;

import java.util.Scanner;

public class PrimeNum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scan.nextInt();
        scan.close();

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }

        if (num <= 1) {
            System.out.println(num + " is not a prime number");
        } else if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

    }

}
