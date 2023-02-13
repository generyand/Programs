package polymorphism;

public class Enemy {
    
    String name;
    int hp;

    Enemy() {
    }

    Enemy(String name) {
        this.name = name;
    }

    void dialog() {
        System.out.println("Do override this function.");
    }

    void showStats() {
        System.out.println("Name:\t" + name);
        System.out.println("HP:\t" + hp);
    }

}
