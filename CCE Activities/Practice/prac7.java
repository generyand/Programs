package Practice;

import java.util.Scanner;

public class prac7 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();
        System.out.print("Enter number of Columns: ");
        int columns = scan.nextInt();
        scan.close();

        int table[][] = new int[rows][columns];

        int row = 1;
        int column = 1;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = row * column;
                column += 1;
            }
            row += 1;
            column = 1;
        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.printf("%-4d", table[i][j]);
            }
            System.out.println();
        }

    }

}
