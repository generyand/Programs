package Practice;

import java.util.Scanner;

public class login {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String credentials[][] = { { "spiderman", "marvel" }, { "admin", "123" } };

        System.out.println("Login Page");

        boolean isValid = false;
        do {
            System.out.print("Username: ");
            String username = scan.nextLine();
            System.out.print("Password: ");
            String password = scan.nextLine();

            for (int i = 0; i < credentials.length; i++) {
                for (int j = 0; j < credentials[i].length; j++) {
                    if (username.equals(credentials[i][0]) && password.equals(credentials[i][1])) {
                        isValid = true;
                        break;
                    }
                }
            }
            
            if (isValid) {
                System.out.println("Logged in");
            } else {
                System.out.println("There's something wrong with the username or password. Try again...");
            }
            System.out.println();
        } while (!isValid);
        scan.close();

    }

}
