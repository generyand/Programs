import java.util.Scanner;

public class GPA {
    /*
    4.	Create a java program for a college’s admissions office. Allow the user to input the student’s high school GPA and admission test score. Print the message “Accept” if the student has a grade point average of 3.0 or above and an admission test score of at least 60. If the student does not meet either of the qualification criteria, print “Reject”.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your highschool GPA");
        double gpa = scan.nextDouble();
        System.out.println("Enter your admission test score");
        int score = scan.nextInt();

        if ((gpa >= 3 && gpa <= 4) && (score >= 60 && score <= 100)) {
            System.out.println("You are ACCEPTED");
        } else if (gpa < 3 || score < 60) {
            System.out.println("Sorry. You don't seem to meet the University's qualification. :(");
        } else {
            System.out.println("Error! Please enter a valid GPA or Score");
        }

        scan.close();

    }

}
