package Practice;

public class prac8 {
    
    public static void main(String[] args) {
        
        int num = 97;
    
        boolean notPrime = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                notPrime = true;
            }
        }

        if (num == 1) {
            System.out.println("Not a prime number");
        } else if (!notPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }

    }


}
