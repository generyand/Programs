import java.util.Scanner;

public class Exercise12 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter grade");
        int grade = scan.nextInt();
        scan.close();

        System.out.println();
        if (grade >= 90 && grade <= 100) {
            System.out.println("Outstanding! You got an A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("Very good! You got a B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("Good. You got a C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("You got a D");
        } else if (grade < 60) {
            System.out.println("You got an F. You failed, bruh. :(");
        } else {
            System.out.println("Invalid! Please enter a valid grade");
        }
    }

}
