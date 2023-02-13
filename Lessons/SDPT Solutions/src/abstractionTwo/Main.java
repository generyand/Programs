package abstractionTwo;

public class Main {

    public static void main(String[] args) {
        
        Dog d = new Dog();
        Bird b = new Bird();
        Fish f = new Fish();

        b.fly();
        b.makeSound();
        b.walk();

    }

}
