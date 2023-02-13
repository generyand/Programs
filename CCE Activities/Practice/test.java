package Practice;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        // FOR LOOP
        long startTimeForLoop = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.print("wassup");
        }
        long forLoop = (System.currentTimeMillis() - startTimeForLoop);
        
        // WHILE LOOP
        long startTimeWhileLoop = System.currentTimeMillis();
        int i = 0;
        while (i < 10000) {
            System.out.print("wassup");
            i++;
        }
        long whileLoop = (System.currentTimeMillis() - startTimeWhileLoop);
        System.out.println("For Loop: " + forLoop);
        System.out.println("While Loop: " + whileLoop);


    }

}
