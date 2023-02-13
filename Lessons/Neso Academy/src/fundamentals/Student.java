package fundamentals;

public class Student {

    String firstName, lastName, year, course, section;
    double midtermGrade, finalGrade;

    Student(String firstName,
            String lastName,
            String year,
            String course,
            String section,
            double midtermGrade,
            double finalGrade) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.course = course;
        this.section = section;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;

    }

    void introduceSelf() {
        System.out.printf("Hello, everyone. I am %s %s, %s %s, I belong in %s class :D\n", firstName, lastName, year,
                course, section);
    }

    void evaluateGrade() {
        double averageGrade = (midtermGrade + finalGrade) / 2;
        System.out.printf("Grade: %.2f\n", averageGrade);
        String remarks = (averageGrade > 100) ? "Invalid Grade"
                : (averageGrade >= 98 && averageGrade <= 100) ? "With Highest Honors"
                        : (averageGrade >= 95 && averageGrade <= 97.99) ? "With High Honors"
                                : (averageGrade >= 90 && averageGrade <= 94.99) ? "With Honors"
                                        : (averageGrade >= 75 && averageGrade <= 89.99) ? "Passed" : "Failed";
        System.out.println("Remarks: " + remarks);
    }

}
