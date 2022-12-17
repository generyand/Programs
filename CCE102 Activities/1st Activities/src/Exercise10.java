import java.util.Scanner;

public class Exercise10 {
    /*
    10.	Write a java program that asks the user enter a number from 1 – 3. If 1 is entered, print “Hello”; if 2 is entered, print “Hi”; and if 3 is entered, then print “Bye”. Otherwise, print “Invalid.”
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number to greet. :D\n1 for Hello\n2 for Hi\n3 for Bye");
        int num = scan.nextInt();
        scan.close();
        System.out.println();

        if (num == 1) {
            System.out.println("Hello");
        } else if (num == 2) {
            System.out.println("Hi");
        } else if (num == 3) {
            System.out.println("Bye");
        } else {
            System.out.println("Invalid");
        }
    }

}
