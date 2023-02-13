package polymorphism;

public class Car {
    
    String name;
    int horsepower;

    void doAll() {
        start();
        rev();
        showHorsePower();
    }

    void start() {
        System.out.println(name + " started");
    }

    void rev() {
        System.out.println(name + " revved! vrooommm");
    }

    void showHorsePower() {
        System.out.println("Horsepower: " + horsepower);
    }

}
