package abstractionTwo;

public class Bird implements Animal, AirAnimal {
    
    public void makeSound() {
        System.out.println("Chirp! Chirp");
    }

    public void walk() {
        System.out.println("Just walked");
    }

    public void fly() {
        System.out.println("wheeewww... flyinnnn");
    }

}
