package abstractionTwo;

public class Dog implements Animal, LandAnimal {
    
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    public void walk() {
        System.out.println("Walking happily");
    }
    
}
