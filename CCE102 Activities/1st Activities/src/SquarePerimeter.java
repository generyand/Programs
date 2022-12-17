import java.util.Scanner;

public class SquarePerimeter {
    /* 
    1.	Create a java program that will display the perimeter of the square, depending on
    the user’s input. 
    */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of a side to calculate its perimeter");
        int squareSide = scan.nextInt();

        int perimeter = squareSide * 4;
        System.out.println("Perimeter of the square is " + perimeter);

        scan.close();
    }

}
