public class printf {

    public static void main(String[] args) {

        boolean myBoolean = true;
        char myChar = '#';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        // System.out.printf("%b\n", myBoolean);
        // System.out.printf("%c\n", myChar);
        // System.out.printf("%s\n", myString);
        // System.out.printf("%d\n", myInt);
        // System.out.printf("%f\n", myDouble);

        // System.out.printf("Hello %10s\n", myString);
        // System.out.printf("Your current balance is %.2f\n", myDouble);

        System.out.printf("Your current balance is %f\n", myDouble);
        System.out.printf("Your current balance is %015f\n", myDouble);
        System.out.printf("Your current balance is %,f\n", myDouble);




    }

}