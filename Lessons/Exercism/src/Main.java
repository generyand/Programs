import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num [] = new int[9];

        for (int i=0;i<9;i++) {
        System.out.print("Enter a number: [ " + i + " ]: ");
        num[i]=scan.nextInt();
        }
        System.out.println("---------------------------");
        System.out.println("Arrange numbers");
        for (int i=0;i<num.length;i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println("\nReverse numbers");
        for (int i=8;i>=0;i--) {
            System.out.print(num[i] + " ");
        }

    }
}
