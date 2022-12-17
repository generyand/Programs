package Loop;

import java.util.Scanner;

public class Loop {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isNameAvailable = false;
        String names[] = {"Gene", "Asnari", "Ace", "Fernyl", "hehe"};
        int i = 0;
        
        System.out.println("Enter name to search");
        String nameInput = scan.nextLine();
        scan.close();

        for (i = 0; i < names.length; i++) {
            if (nameInput.equals(names[i])) {
                isNameAvailable = true;
                break;
            }
        }

        if (isNameAvailable == true) {
            System.out.println("Name found in index " + i);
        } else {
            System.out.println("Name not found");
        }

    }

}




