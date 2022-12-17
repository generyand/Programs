import java.util.Scanner;

public class Exercise2 {
    /*
    2.	Ask for the book title and number of copies. Compute for the amount due by assuming that all prices of the books are equal to Php 250.00. Display Title and amount due.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String bookTitle = scan.nextLine();
        System.out.print("Enter number of copies: ");
        int NumOfCopies = scan.nextInt();
        scan.close();
        System.out.println();

        int amountDue = NumOfCopies * 250;

        System.out.println("Book Title:\t" + bookTitle);
        System.out.println("Amount Due:\t" + amountDue + " PHP");

    }

}
