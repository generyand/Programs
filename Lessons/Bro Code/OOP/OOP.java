package OOP;
public class OOP {
    
    public static void main(String[] args) {
        
        Car myCar1 = new Car();
        Car myCar2 = new Car();

        System.out.printf("%,.2f USD\n", myCar1.price);
        System.out.println(myCar1.model);
        System.out.println();

        System.out.printf(myCar2.make + "\n");
        System.out.println(myCar1.model);

    //     myCar1.drive();
    //     myCar1.brake();
    }

}
