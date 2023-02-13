import java.util.Scanner;

public class Exercise6 {
    /*
    6.	Write a java application named Arithmetic that has two numbers namely variable num1 and num2, and compute the five arithmetic operators.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
        scan.close();
        System.out.println();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int modulo = num1 % num2;     

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        System.out.println("The difference of " + num1 + " and " + num2 + " is " + difference);
        System.out.println("The product of " + num1 + " and " + num2 + " is " + product);
        System.out.println("The quotient of " + num1 + " and " + num2 + " is " + quotient);
        System.out.println("The modulo of " + num1 + " and " + num2 + " is " + modulo);
        System.out.println();

    }

}
