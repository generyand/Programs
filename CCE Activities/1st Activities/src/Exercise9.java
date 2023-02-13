import java.util.Scanner;

public class Exercise9 {
    /*
    9.	Write a java program that will ask the user to input the values of four variables, A, B, C, and D and print “TRUE” if A is greater than B, and C is less than D or if A is less than B and C is greater than D.  Print “FALSE” if otherwise.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("A: ");
        int a = scan.nextInt();
        System.out.print("B: ");
        int b = scan.nextInt();
        System.out.print("C: ");
        int c = scan.nextInt();
        System.out.print("D: ");
        int d = scan.nextInt();
        scan.close();

        if ((a > b && c < d) || (a > b && c < d)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }

}