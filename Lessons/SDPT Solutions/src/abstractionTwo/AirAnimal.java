package abstractionTwo;

public interface AirAnimal extends LandAnimal{
    
    
    void fly();

    default void sayHello() {
        System.out.println("Wassup homans!");
    }

}
