import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Receipt {

    public static void main(String[] args) throws IOException {

        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        Scanner scan = new Scanner(System.in);
        String as = "*";
        int asLength = 45;

        System.out.println();
        System.out.printf("%34s", "INPUT DETAILS BELOW\n");
        System.out.printf("%36s", "PURCHASE RECEIPT SYSTEM\n");
        System.out.println(as.repeat(asLength));
        System.out.print("Enter Cashier Name:\t\t");
        String cashierName = scan.nextLine();
        System.out.print("Enter O.R. No:\t\t\t");
        String ORNum = scan.next();
        System.out.println(as.repeat(asLength));

        int numOfItems = 0;
        boolean notNum = true;
        System.out.printf("Enter Number of Items:\t\t");
        do {
            try {
                numOfItems = scan.nextInt();
                notNum = false;
            } catch (InputMismatchException ime) {
                scan.nextLine();
                System.out.print("Error. Please enter a number\t");
            }
        } while (notNum);
        scan.nextLine();

        String itemName[] = new String[numOfItems];
        double itemPrice[] = new double[numOfItems];
        int itemQuantity[] = new int[numOfItems];

        System.out.println(as.repeat(asLength));

        for (int i = 1; i <= numOfItems; i++) {
            System.out.println("Product " + i);

            System.out.print("Enter Item Name:\t\t");
            itemName[i - 1] = scan.nextLine();

            notNum = true;
            System.out.print("Enter Item Price:\t\t");
            do {
                try {
                    itemPrice[i - 1] = scan.nextDouble();
                    notNum = false;
                } catch (InputMismatchException ime) {
                    scan.nextLine();
                    System.out.print("Error. Please enter a number\t");
                }
            } while (notNum);

            notNum = true;
            System.out.print("Enter Item Quantity:\t\t");
            do {
                try {
                    itemQuantity[i - 1] = scan.nextInt();
                    notNum = false;
                } catch (InputMismatchException ime) {
                    scan.nextLine();
                    System.out.print("Error. Please enter a number\t");
                }
            } while (notNum);
            scan.nextLine();
            System.out.println("-".repeat(asLength));
        }

        double subTotal = 0;
        double productTotalPrice = 0;
        for (int i = 0; i < numOfItems; i++) {
            productTotalPrice = itemPrice[i] * itemQuantity[i];
            subTotal += productTotalPrice;
        }

        double VAT = subTotal * .05;
        double total = subTotal + VAT;

        System.out.printf("%s%,.2f\n", "TOTAL PAYMENT:\t\t\tPhp ", total);
        System.out.println(as.repeat(asLength));

        double payment = 0;
        notNum = true;
        do {
            try {
                System.out.print("Enter Customer Payment:\t");
                payment = scan.nextInt();
                while (payment < total) {
                    System.out.print("Insufficient. Please try again...\n\nEnter Customer Payment:\t");
                    payment = scan.nextDouble();
                    System.out.println("\n");
                }
                notNum = false;
            } catch (InputMismatchException ime) {
                System.out.print("Not a number. Please try again...\n");
                System.out.println();
                notNum = true;
                scan.nextLine();
            }
        } while (notNum);

        System.out.println(as.repeat(asLength));
        scan.close();

        // Clear Screen
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime();
            }
        } catch (IOException | InterruptedException ex) {
        }

        BufferedReader reader = new BufferedReader(new FileReader("header.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();

        System.out.println();
        // System.out.printf("%35s", "Gaisano Grand Mall\n");
        // System.out.printf("%41s", "Mc Arthur Highway, Digos City\n");
        // System.out.printf("%42s", "Tel. #: 553-2847  Fax: 679652382\n");
        // System.out.printf("%38s", "GST Reg. No. 00023648294\n");
        // System.out.printf("%33s", "RCB: 529873290\n");
        // System.out.println();
        // System.out.printf("%34s", "PURCHASE RECEIPT\n");
        // System.out.println();

        System.out.println("Cashier: " + cashierName);
        System.out.print("Date: " + formatter.format(date) + " ".repeat(16));
        System.out.print("O.R. No.: " + ORNum);
        System.out.println();
        System.out.println(as.repeat(50));
        System.out.printf("\n%-10s%-30s%-10s", "  Qty.", "Item/s", "Price/s  ");
        System.out.println();
        System.out.println("-".repeat(50));

        int quantity = 0;
        String product = "";
        double totalPrice = 0;
        for (int i = 0; i < numOfItems; i++) {
            quantity = itemQuantity[i];
            product = itemName[i];
            totalPrice = itemPrice[i] * itemQuantity[i];
            System.out.printf("  %-8d%-30s%,-8.2f  ", quantity, product, totalPrice);
            System.out.println();
        }
        System.out.println();

        System.out.println(as.repeat(50));

        System.out.println();
        System.out.printf("%-36s%-3s %,-7.2f  ", "  SUBTOTAL", "Php", subTotal);
        System.out.println();
        System.out.printf("%-36s%-3s %,-7.2f  ", "  VAT(5%)", "Php", VAT);
        System.out.println("\n");
        System.out.printf("%-36s%-3s %,-7.2f  ", "  TOTAL", "Php", total);
        System.out.println("\n");
        System.out.printf("%-36s%-3s %,-7.2f  ", "  CASH", "Php", payment);
        System.out.println();
        System.out.printf("%-36s%-3s %,-7.2f  ", "  CHANGE", "Php", (payment - total));
        System.out.println("\n");

        reader = new BufferedReader(new FileReader("footer.txt"));
        
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();

        System.out.printf("\n\n%36s", "THANK YOU FOR SHOPPING!");
        System.out.println();
    }

}