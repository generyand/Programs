package Main;

public class Laptop {
    
    String brand;
    String model;
    String screenSize;
    double price;

    Laptop(String brand, String model, String screenSize, double price) {

        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.price = price;

        System.out.printf("%15s%-10s\n", "Laptop Brand:\t", brand);
        System.out.printf("%15s%-10s\n", "Laptop Model:\t", model);
        System.out.printf("%15s%-10s\n", "Screen Size:\t", screenSize);
        System.out.printf("%15s%,-10.2fPHP\n", "Price:\t", price);

    }

}
