import java.util.Scanner;

public class FifthExc3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scan.nextInt();

        double inputs = 0;
        double inputSum = 0;
        double inputSquareSum = 0;
        for (int i = 1; i <= n; i++) {
            inputs = scan.nextInt();
            inputSum += inputs;
            inputSquareSum += Math.pow(inputs, 2);
        }
        scan.close();

        double avg1 = inputSum / n;
        double avg2 = Math.pow(avg1, 2);
        double avgSquare = inputSquareSum / n;
        double SD = Math.sqrt(avgSquare - avg2);

        System.out.println();
        System.out.println("avg1 = " + avg1);
        System.out.println("avg2 = " + avg2);
        System.out.println();
        System.out.println("avgSquare = " + avgSquare);
        System.out.printf("%s%.10f\n", "Standard Deviation: ", SD);

    }

}