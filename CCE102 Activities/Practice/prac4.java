package Practice;
import java.util.ArrayList;
import java.util.Scanner;

public class prac4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number: ");
            int num = scan.nextInt();

            int remainder = num % 2;

            if (remainder == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }

        }
        scan.close();

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }

}
