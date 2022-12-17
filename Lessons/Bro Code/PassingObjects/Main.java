package PassingObjects;

// import OOP.Car;

public class Main {
    
    public static void main(String[] args) {
        Garage garage = new Garage();

        Sakyanan sakyanan1 = new Sakyanan("BMW");
        Sakyanan sakyanan2 = new Sakyanan("Lamborghini");

        garage.park(sakyanan1);
        garage.park(sakyanan2);
    }

}
