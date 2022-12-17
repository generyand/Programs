import java.util.Scanner;

public class oneDimensionArray {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String employeeNames[] = new String[20];
        int evenNumbers[] = new int[10];

        System.out.print("Enter Employee Name: ");
        employeeNames[0] = scan.nextLine();

        System.out.println(employeeNames[0]);
 
    }

}
