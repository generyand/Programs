import java.util.InputMismatchException;
import java.util.Scanner;

public class tool {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        boolean notNum = false;
        int num = 0;
        System.out.print("Enter a number: ");
        do {
            try {
                num = scan.nextInt(); // \n
                notNum = false;
            } catch (InputMismatchException ime) {
                System.out.println("\nError. Please try again...");
                notNum = true;
                scan.nextLine(); // 
            }
        } while (notNum);
        
    }

}
