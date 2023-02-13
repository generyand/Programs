import java.util.Scanner;

public class arjay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = { "Angelo Ymas", "Arjay Escabas", "Laurence Sarominez", "Shereca Ave Verano", "Ericka Migue" };
        String name = "";
        String[] course = { "BSIT", "bsit", "Bsit" };
        String[] year = { "1st year", "first year", "1ST YEAR", "FIRST YEAR" };
        String[] section = { "Paterno", "paterno", "PATERNO" };
        boolean qualification = false;

        System.out.println("Fill-up the questions provided");

        System.out.print("Name: ");
        name = scan.nextLine();
        System.out.print("Course: ");
        String Usercourse = scan.nextLine();
        System.out.print("Year: ");
        String Useryear = scan.nextLine();
        System.out.print("Section: ");
        String Usersection = scan.nextLine();
        scan.close();
        System.out.println();
        
        boolean nameCheck = false;
        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                nameCheck = true;
                break;
            }
        }
        
        boolean courseCheck = false;
        for (int i = 0; i < course.length; i++) {
            if (Usercourse.equals(course[i])) {
                courseCheck = true;
                break;
            }
        }
        
        boolean yearCheck = false;
        for (int i = 0; i < year.length; i++) {
            if (Useryear.equals(year[i])) {
                yearCheck = true;
                break;
            }
        }
        
        boolean sectionCheck = false;
        for (int i = 0; i < section.length; i++) {
            if (Usersection.equals(section[i])) {
                sectionCheck = true;
                break;
            }
        }
        
        if (nameCheck == true && courseCheck == true && yearCheck == true && sectionCheck == true) {
            qualification = true;
            System.out.println("Hello " + name + " here are your class schedule's");
        }
        
        if (qualification == true) {
            System.out.println("First subject: GE 1");
            System.out.println("First subject: GE 2");
            System.out.println("First subject: GE 3");
            System.out.println("First subject: GE 4");
            System.out.println("First subject: GE 5");
        } else {
            System.out.println("ERROR");
        }
    }

}