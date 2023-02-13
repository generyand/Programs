package Practice;

import java.util.Scanner;

public class fibonacci2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n term: ");
        int n = scan.nextInt();
        scan.close();

        long firstTerm = 0, secondTerm = 1, sum = 0;

        for (int i = 0; i < n; i++) {
            firstTerm = secondTerm;
            secondTerm = sum;
            sum = firstTerm + secondTerm;

            if (i == n - 1) {
                String term = Integer.toString(n);
                String ordinal = "";
                
                if (term.charAt(term.length() - 1) == 1) {
                    ordinal = "st";
                } else if (term.charAt(term.length() - 1) == 2) {
                    ordinal = "nd";
                } else if (term.charAt(term.length() - 1) == 3) {
                    ordinal = "rd";
                } else {
                    ordinal = "th";
                }

                System.out.print(n + ordinal + " term: " + sum);
            }
        }

        System.out.println();
    }

}
