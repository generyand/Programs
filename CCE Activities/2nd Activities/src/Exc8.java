import java.util.Scanner;

public class Exc8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = { "Clariedhel", "Jayvive", "Weelyn", "Lorre", "Mae Ann", "Nelson", "Mervin", "Jay", "Ryan",
                "Eric", "Michael", "Joy", "Angelo", "Marisol", "Kent", "Vincent" };

        System.out.println("SEARCH ARRAY CODE");
        System.out.println("This is a system that can search the name of the student of ICT -TVL-B9");
        System.out.println("***********************************************************************");

        System.out.print("Please enter the Student Name:               ");
        String name = scan.nextLine();
        System.out.println("-----------------------------------------------------------------------");
        scan.close();

        boolean nameExist = false;
        int i;
        for (i = 0; i < names.length; i++) {
            if (name.equalsIgnoreCase(names[i])) {
                nameExist = true;
                break;
            }
        }
        
        if (nameExist == true) {
            System.out.println("Name found: " + names[i]);
        } else {
            System.out.println("No Name Found");
        }

    }

}