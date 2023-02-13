import java.util.Scanner;

public class FoodDelivery2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = "";
        double price = 0;
        int overDel;
        double overDelFee = 0;
        double shippingFee = 0;
        double total = 0;

        System.out.print("Enter the item: ");
        item = scan.nextLine();
        System.out.print("Enter the price: ");
        price = scan.nextDouble();

        if (price < 10) {
            shippingFee = 2;
        } else {
            shippingFee = 3;
        }


        System.out.println("\nOvernight Deliver? (5$)\nNo - 0\nYes - 1");
        overDel = scan.nextInt();
        scan.close();
        System.out.println();

        if (overDel == 1) {
            overDelFee = 5;
        }
        if (overDel == 0) {
            overDelFee = 0;
        }
        
        total = price + shippingFee + overDelFee;

        System.out.println(item + ": " + price);
        System.out.println("Shipping: " + shippingFee);
        System.out.println("Overnight Delivery Fee: " + overDelFee);
        System.out.println("TOTAL: " + total);
    }

}