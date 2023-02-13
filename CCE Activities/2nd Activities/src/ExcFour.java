import java.util.ArrayList;
import java.util.Scanner;

public class ExcFour {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        System.out.println("************INPUT************");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%23s", "Enter a number:\t");
            int n = scan.nextInt();

            int remainder = n % 2;

            if (remainder == 0) {
                even.add(n);
            } else {
                odd.add(n);
            }
        }
        scan.close();

        System.out.println("************OUTPUT************");
        System.out.printf("%-15s\t", "Even Elements:");
        String sep = "";
        for (int i = 0; i < even.size(); i++) {
            System.out.print(sep + even.get(i));
            sep = ", ";
        }
        System.out.println();

        System.out.printf("%-15s\t", "Odd Elements:");
        sep = "";
        for (int i = 0; i < odd.size(); i++) {
            System.out.print(sep + odd.get(i));
            sep = ", ";
        }
        System.out.println("\n");
    }

}