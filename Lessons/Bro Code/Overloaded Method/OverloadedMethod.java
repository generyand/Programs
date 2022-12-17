// import java.util.Scanner;

public class OverloadedMethod {

    public static void main(String[] args) {
        
        double x = add(2.0, 2.7, 3.0, 4.5);

        System.out.println("Sum:" + x);
    }

    static int add(int a, int b) {
        System.out.println("This is #1 overloaded method");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("This is #2 overloaded method");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("This is #3 overloaded method");
        return a + b + c + d;
    }

    static double add(double a, double b) {
        System.out.println("This is #4 overloaded method");
        return a + b;
    }

    static double add(double a, double b, double c) {
        System.out.println("This is #5 overloaded method");
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        System.out.println("This is #6 overloaded method");
        return a + b + c + d;
    }

}