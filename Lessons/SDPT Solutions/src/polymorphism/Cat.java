package polymorphism;

public class Cat extends Animal {
    
    Cat(String name) {
        super(name);
    }

    void makesound() {
        System.out.println(name + ": Purr");
    }

}
