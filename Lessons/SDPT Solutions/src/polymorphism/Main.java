package polymorphism;


public class Main {
    
    public static void main(String[] args) {

        Car bugattiCar = new Bugatti();
        Car ferrariCar = new Ferrari();
        Car TeslaCar = new Tesla();

        bugattiCar.doAll();
    }

}
