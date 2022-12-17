import java.util.Scanner;

public class RectangleArea {
    /* 
    2.	Create a java program that will display the area of a rectangle, depending on the user’s input. 
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length of a rectangle");
        int length = scan.nextInt();
        System.out.println("Enter width of a rectangle");
        int width = scan.nextInt();

        int area = length * width;

        System.out.println("Area: " + area);
        scan.close();

    }

}
