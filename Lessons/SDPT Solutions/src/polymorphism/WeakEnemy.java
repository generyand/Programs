package polymorphism;

public class WeakEnemy extends Enemy {
    
    WeakEnemy() {
        name = "Weak Enemy";
        hp = 10;
    }

    WeakEnemy(String name) {
        this.name = name;
        hp = 10;
    }

    void dialog() {
        System.out.println(name + ": I am a weak enemy. huhu");
    }

}
