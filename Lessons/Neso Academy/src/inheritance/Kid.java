package inheritance;

public class Kid extends Toddler {
    
    String sport;

    Kid(String name, String sex, int age, String favoriteMovie, String sport) {
        super(name, sex, age, favoriteMovie);
        this.sport = sport;
    }

    void checkStatus() {
        super.checkStatus();
        System.out.println("Sport:\t" + sport);
    }

}
