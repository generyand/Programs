import java.util.Scanner;

public class Cinema {
    /*
    5. To watch the Movie Deadpool the user must be at the right age to enter the cinema. Create a flowchart that will ask the user’s age to determine if he/she can watch it or not.  Display “You’re too Young and you’re not allowed” if the age is 16 below otherwise display “You’re old enough! You’re allowed”
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();

        if (age < 16) {
            System.out.println("You are too young, so you're not allowed. :(");
        } else {
            System.out.println("You are old enough! You can enter. :D");
        }

        scan.close();

    }

}
