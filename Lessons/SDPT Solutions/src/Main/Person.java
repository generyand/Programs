package Main;

public class Person {
    
    String firstName;
    String lastName;
    char sex;
    int age;

    Person(String firstName, String lastName, char sex, int age) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;

        System.out.print("Person is created\n");
        System.out.printf("%-20s%s\n", "First Name:", firstName);
        System.out.printf("%-20s%s\n", "Last Name:", lastName);
        System.out.printf("%-20s%c\n", "Sex:", sex);
        System.out.printf("%-20s%d\n", "Age:", age);
    }

}
