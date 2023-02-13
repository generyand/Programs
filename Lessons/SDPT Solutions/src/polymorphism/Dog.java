package polymorphism;

public class Dog extends Animal {
    
    Dog(String name) {
        super(name);
    }

    void makesound() {
        System.out.println(name + ": Woof! Woof!");
    }

}
