import java.util.Scanner;

public class Exc7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int Rows = scan.nextInt();
        System.out.print("Enter number of columns: ");
        int Columns = scan.nextInt();
        scan.close();

        int[][] table = new int[Rows][Columns];
        int row = 1, column = 1;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = row * column;
                column++;
            }
            row++;
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