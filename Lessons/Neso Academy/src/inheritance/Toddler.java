package inheritance;

public class Toddler extends Person {
    
    String favoriteMovie;

    Toddler(String name, String sex, int age, String favoriteMovie) {
        super(name, sex, age);
        this.favoriteMovie = favoriteMovie;
    }

    void drink() {
        System.out.println(name + " just drank milk.");
    }

    void checkStatus() {
        super.checkStatus();
        System.out.println("Favorite Movie:\t" + favoriteMovie);
    }

}
