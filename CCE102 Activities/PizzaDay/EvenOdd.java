package PizzaDay;

public class EvenOdd {
    
    public static void main(String[] args) {
        
        /* Print all the integer numbers starting from 1 to 20. Mark each of them by
         “Odd” or “Even” based on whether they are “odd” or “even”. */
        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }

        }

    }

}
