import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to add its digits:");
        int num = scan.nextInt();
        int digit = 0;
        int sum = 0;
        
        
        do {
            digit = num % 10;
            System.out.println("digit: " + digit);

            sum += digit;
            System.out.print("sum: " + sum);
            
            num /= 10;
            System.out.println("\nnew num: " + num + "\n");
        } while (num != 0);

        System.out.println("final sum: " + sum);
        scan.close();

    }

}
