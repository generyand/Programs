package inheritance;

public class Main {
    
    public static void main(String[] args) {
        
        Person p = new Person("Elon", "Male", 34);
        Toddler t = new Toddler("David", "Male", 4, "Inception");
        Kid k = new Kid("Ryan", "Male", 19, "Tenet", "Football");

        p.checkStatus();

        System.out.println();
        t.checkStatus();

        System.out.println();
        t.drink();

        System.out.println();
        k.checkStatus();

        k.drink();

    }

}
