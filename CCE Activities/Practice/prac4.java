package Practice;
import java.util.ArrayList;
import java.util.Scanner;

public class prac4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

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

        System.out.print("Even: ");
        String sep = "";
        for (int i = 0; i < even.size(); i++) {
            System.out.print(sep + even.get(i));
            sep = " ";
        }
        System.out.println();

        System.out.print("Odd: ");
        sep = "";
        for (int i = 0; i < odd.size(); i++) {
            System.out.print(sep + odd.get(i));
            sep = " ";
        }
        System.out.println();

    }

}
