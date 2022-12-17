import java.util.Scanner;

public class Exercise16 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = scan.nextInt();
        scan.close();

        System.out.println();
        if (num1 > num2) {
            System.out.println(num1 + " is larger");
        } else if (num1 < num2) {
            System.out.println(num2 + " is larger");
        } else {
            System.out.println("They are equal");
        }
    }

}
