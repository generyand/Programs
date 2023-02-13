import java.util.Scanner;

public class Act5Exc3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scan.nextInt();

        double input = 0;
        double sum = 0;
        double square = 0;
        for (int i = 1; i <= n; i++) {
            input = scan.nextInt();
            sum += input;
            square += Math.pow(input, 2);
        }
        scan.close();

        double avg1 = sum / n;
        double avg2 = Math.pow(avg1, 2);
        double avgSquare = square / n;
        double SD = Math.sqrt(avgSquare - avg2);

        System.out.println();
        System.out.println("avg1 = " + avg1);
        System.out.println("avg2 = " + avg2);
        System.out.println();
        System.out.println("avgSquare = " + avgSquare);
        System.out.printf("%s%.10f\n", "Standard Deviation: ", SD);

    }

}