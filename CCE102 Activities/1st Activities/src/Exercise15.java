import java.util.Scanner;

public class Exercise15 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the item: ");
        String item = scan.nextLine();
        System.out.print("Enter the price: ");
        double price = scan.nextDouble();

        int ODel;
        double ODelFee = 0;
        do {
            System.out.println("\nOvernight Deliver? (5$)\nNo - 0\nYes - 1");
            ODel = scan.nextInt();
            
            ODelFee = 0;
            if (ODel == 1) {
                ODel = 1;
                ODelFee = 5;
                break;
            } else if (ODel == 0){
                ODel = 0;
                ODelFee = 0;
                break;
            } else {
                System.out.println(ODel + " is not valid");
            }
        } while (ODel != 1 || ODel != 0);
        
        scan.close();
        System.out.println();

        double shippingFee;
        if (price < 10) {
            shippingFee = 2;
        } else {
            shippingFee = 3;
        }
        double total = price + shippingFee + ODelFee;

        System.out.printf("%-30s %.2f\n", item, price);
        System.out.printf("%-30s %.2f\n", "Shipping", shippingFee);
        System.out.printf("%-30s %.2f\n", "Overnight Delivery Fee", ODelFee);
        System.out.printf("%-30s %.2f\n", "TOTAL:", total);

    }

}
