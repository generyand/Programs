import java.util.Scanner;

public class Act5Exc3 {

    public static void main(String[] args) {
        // GENERAL INITIALIZATION
        Scanner scan=new Scanner(System.in);
        double num= 0.0;
        double sum= 0.0;
        double square=0.0;
        int i=1;

        // ASK FOR THE INPUT (KUNG KAPILA SIYA MAG INPUT)
        System.out.print("Enter N: ");
        int n=scan.nextInt();

        // PROCESS
        while (i<=n) {
            num= scan.nextDouble(); // Ask for the input depende kung kapila base sa n
            sum+= num; // sum sa mga inputs
            square+=Math.pow(num, 2); // square sa mga inputs and sum nila tanan
            i++; // incrementation
        }

        scan.close();

        // PROCESS 2
        double avg1= sum/n; // average sa mga inputs
        double avg2=Math.pow(avg1, 2); // average sa inputs gi square (avg2^2)
        double avgSquare=square/n; // average sa mga square sa inputs
        double SD=Math.sqrt(avgSquare-avg2); // Standard Deviation

        // DISPLAY OR OUTPUT
        System.out.println();
        System.out.println("avg1 = " + avg1);
        System.out.println("avg2 = " + avg2);
        System.out.println();
        System.out.println("avgSquare = " + avgSquare);
        System.out.println("SD: " + SD);

    }

}