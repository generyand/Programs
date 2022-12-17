import java.util.Scanner;

public class Exercise7 {
    
    /*
    7.	According to Plato, a man should marry a woman whose age is half his age plus seven years. Write a java program to display the ideal age of a woman by requesting a man’s age.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input man's age");
        int manAge = scan.nextInt();
        scan.close();

        System.out.println();
        int womanIdealAge = (manAge / 2) + 7;
        System.out.println("Ideal age of a woman according to that age is " + womanIdealAge);

    }

}
