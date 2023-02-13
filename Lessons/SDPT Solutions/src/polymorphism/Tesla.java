package polymorphism;

public class Tesla extends Car {
    
    Tesla() {
        this.name = "Tesla";
        this.horsepower = 1020;
    }

    void rev() {
        System.out.println(":( " + name + " can't rev because it is electric.");
    }

}
