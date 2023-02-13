package fundamentals;

public class main {
    
    public static void main(String[] args) {

        Employee e = new Employee("Gene", "Depalubos", "Programmer", "Australia", "Male", 19);
        Employee hehe = new Employee("Asnari", "Pacalna", "Developer");
        Employee none = new Employee();

        System.out.println(none.sex);
    }

}