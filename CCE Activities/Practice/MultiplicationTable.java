package Practice;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scan.nextInt();
        scan.close();

        int[][] table = new int[rows][columns];

        for (int i = 1; i <= table.length; i++) {
            for (int j = 1; j <= table[i - 1].length; j++) {
                table[i - 1][j - 1] = i * j;
            }
        }

        System.out.println();
        // for (int i = 0; i < columns; i++) {
        //     System.out.print("-".repeat(5));
        // }
        // System.out.print("-\n");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.printf(" %d ", table[i][j]);
            }
            // System.out.print("|\n");
            // for (int j = 0; j < columns; j++) {
            //     System.out.print("-".repeat(5));
            // }
            // System.out.print("-\n");
        }

    }

}
