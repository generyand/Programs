import java.util.Scanner;

public class Exc9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = { "Clariedhel", "Jayvive", "Weelyn", "Lorre", "Mae Ann", "Nelson", "Mervin", "Jay", "Ryan",
                "Eric", "Michael", "Joy", "Angelo", "Marisol", "Kent", "Vincent" };

        System.out.println("SEARCH ARRAY CODE");
        System.out.println("This is a system that can search the name of the student of ICT-TVL-B9");
        System.out.println("**********************************************************************");

        boolean search = true;
        while (search == true) {
            System.out.print("Please enter the Student Name:\t\t");
            String name = scan.nextLine();
            System.out.println("----------------------------------------------------------------------");

            boolean nameExist = false;
            int i = 0;
            for (i = 0; i < names.length; i++) {
                if (name.equalsIgnoreCase(names[i])) {
                    nameExist = true;
                    break;
                }
            }

            String searchAgain = "";
            if (nameExist == true) {
                System.out.print("NAME FOUND, Do you want to search another name? (Y/N): ");
                searchAgain = scan.nextLine();
            } else {
                System.out.print("No Name Found, Do you want to search another name? (Y/N): ");
                searchAgain = scan.nextLine();
            }

            boolean YN = false;
            while (YN == false) {
                if (searchAgain.equalsIgnoreCase("Y")) {
                    search = true;
                    YN = true;
                    System.out.println();
                } else if (searchAgain.equalsIgnoreCase("N")) {
                    System.out.println("SEARCHING STOPPED");
                    search = false;
                    YN = true;
                } else {
                    System.out.println("\n" + searchAgain + " is not a valid key.");
                    YN = false;
                    System.out.println("Do you want to search another name? (Y/N): ");
                    searchAgain = scan.nextLine();
                }
            }

        }
        scan.close();

    }

}