package polymorphism;

public class Animal {
    
    String name;
    Animal(String name) {
        this.name = name;
    }

    void makesound() {
        System.out.println("Please do override this function.");
    }

}
