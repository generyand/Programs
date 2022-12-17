package Loop;

import java.util.Scanner;

public class Hehe {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String ign;
        String heroClasses[] = {"Mage", "Whip", "Tanker", "Archer", "Fighter"};
        int power = 0;
        String classHeroOfUser = "";
        boolean qualification = false;

        System.out.print("IGN: ");
        ign = scan.nextLine();
        System.out.print("Hero class: ");
        classHeroOfUser = scan.nextLine();
        System.out.print("Hero power: ");
        power = scan.nextInt();
        System.out.println();
        scan.close();

        System.out.println("Hello, " + ign);
        System.out.println("Your class is " + classHeroOfUser);
        System.out.printf("Your Hero power is %,d\n", power);

        for (int i = 0; i < heroClasses.length; i++) {
            if (classHeroOfUser.equals(heroClasses[i]) && power >= 15000){
                qualification = true;
                break;
            }   
        }
        
        if (qualification == true){
            System.out.println("Congrats! You are qualified to enter our guild!");
        } else {
            System.out.println("I am sorry but you are not qualified! Thank you for trying. :D");
        }

        System.out.println();
        
    }
}
