package Practice;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n term: ");
        int n = scan.nextInt();
        scan.close();

        // long[] num = new long[n];
        long firstTerm = 0, secondTerm = 1, sum = 0;
        // String sep = "";
        char hehe = 'c';

        for (int i = 0; i < n; i++) {
            // num[i] = sum;
            firstTerm = secondTerm;
            secondTerm = sum;
            sum = firstTerm + secondTerm;

            String sumpay = "";
            if (i == n-1) {
                String term = Integer.toString(n);
                // System.out.println((term.charAt(term.length()-1)));

                if (term.charAt(term.length()-1) == 1) {
                    sumpay = "st";
                } else if (term.charAt(term.length()-1) == 2) {
                    sumpay = "nd";
                } else if (term.charAt(term.length()-1) == 3) {
                    sumpay = "rd";
                } else {
                    sumpay = "th";
                }
                
                System.out.print(n + sumpay + " term: " + sum);
            }
            // sep = ", ";
        }


        // System.out.println(Character.valueOf(hehe));
        // System.out.println(num[n - 1] + num[n - 2]);
    }

    // split the digits of n
    // if n.chart(n.length - 1) == 1, pang sumpay is 'st'
    // if n.chart(n.length - 1) == 2, pang sumpay is 'nd'
    // if n.chart(n.length - 1) == 3, pang sumpay is 'rd'

}
