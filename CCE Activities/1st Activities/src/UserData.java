import java.util.Scanner;

public class UserData {
    /* 
    3.	Create a java program that displays the user’s name, birthday, age, sex, and phone number.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = scan.nextLine();
        System.out.print("Enter birthday: ");
        String bday = scan.nextLine();
        System.out.print("Enter age: ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter sex: ");
        String sex = scan.nextLine();
        System.out.print("Enter phone number: "); 
        String number = scan.nextLine();
        System.out.println();

        System.out.println("Hello, " + name);
        System.out.println("You are born on " + bday);
        System.out.println("You are " + age + " years old");
        System.out.println("You are a " + sex);
        System.out.println("Your contact number is " + number);
        
        scan.close();
    }

}
