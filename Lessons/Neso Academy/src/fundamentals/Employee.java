package fundamentals;

public class Employee {

    String firstName, lastName;
    String title, address, sex;

    int age;

    Employee() {
        firstName = "Alaws";
        lastName = "Alaws";
        title = "Alaws";
        address = "Alaws";
        sex = "Alaws";
        age = 0;
    }
        
    Employee(String firstname,
            String lastName,
            String title) {

        this.firstName = firstname;
        this.lastName = lastName;
        this.title = title;
        address = "Alaws";
        sex = "Alaws";
        age = 0;
    }

    Employee(String firstname,
            String lastName,
            String title,
            String address,
            String sex,
            int age) {

        this.firstName = firstname;
        this.lastName = lastName;
        this.title = title;
        this.address = address;
        this.sex = sex;
        this.age = age;

    }

}
