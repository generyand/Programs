import java.util.Scanner;

public class Exercise13 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the value of the temperature: ");
        double temperature = scan.nextDouble();
        scan.close();

        System.out.println();
        if (temperature < 0) {
            System.out.println("ICE");
        } else if (temperature >= 0 && temperature <= 100) {
            System.out.println("WATER");
        } else {
            System.out.println("STEAM");
        }

    }
    
}
