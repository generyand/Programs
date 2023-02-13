package abstractionOne;

public class Main {
    
    public static void main(String[] args) {
        
        // Concrete Idea
        Animal d = new Dog();
        Animal c = new Cat();

        c.makeSound();
        d.makeSound();
        c.setName("Persian Cat");
        c.showName();
            
    }

}
