package Practice;

import java.util.Scanner;

public class wayloop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        scan.nextLine();
        String string1 = scan.nextLine();

        System.out.println(num + string1);
    }

}