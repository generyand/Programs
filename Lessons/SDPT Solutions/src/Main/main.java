package Main;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Laptop brand: ");
        String brand = scan.nextLine();
        System.out.print("Input Laptop model: ");
        String model = scan.nextLine();
        System.out.print("Input size: ");
        String size = scan.nextLine();
        System.out.print("Input price: ");
        double price = scan.nextDouble();
        System.out.println();
        
        System.out.println("Laptop Details");
        Laptop laptop1 = new Laptop(brand, model, size, price);

    }

}
