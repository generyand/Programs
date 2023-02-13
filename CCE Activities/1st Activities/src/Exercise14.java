import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double hoursWorked = 0, overtime = 0, OTPay = 0, normalPay = 0, totalSalary = 0;

        System.out.print("Enter hours worked: ");
        hoursWorked = scan.nextDouble();
        scan.close();
        System.out.println();

        if (hoursWorked > 8) {
            normalPay = 8 * 35;
            overtime = hoursWorked - 8;
            OTPay = overtime * (35 * 1.5);
            totalSalary = normalPay + OTPay;
            
        } else {
            normalPay = hoursWorked * 35;
            totalSalary = normalPay + OTPay;
        }

        System.out.println("Normal pay: " + normalPay + " PHP");
        System.out.println("Overtime pay: " + OTPay + " PHP");
        System.out.println("Total Salary: " + totalSalary + " PHP");
    }
}
