package inheritance;

public class Person {
    
    String name, sex;
    int age;

    Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    void checkStatus() {
        System.out.println("Name:\t" + name);
        System.out.println("Sex:\t" + sex);
        System.out.println("Age:\t" + age);
    }

}
