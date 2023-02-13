package fundamentals;

import java.util.ArrayList;

public class Tao {
    
    String name, dialog;
    int hp, mp, lvl;

    Tao(String name, String dialog, int hp, int mp, int lvl) {

        this.name = name;
        this.dialog = dialog;
        this.hp = hp;
        this.mp = mp;
        this.lvl = lvl;

    }

    void introduce() {
        System.out.println(name + ": " + dialog + " I am " + name);
    }

    // Arguments using basic datatypes
    void talkTo(String firstName) {
        System.out.println(name + ": " + "Hello, " + firstName);
    }

    void talkTo(String firstName, String firstName2) {
        System.out.println(name + ": " + "Hello, " + firstName + " and " + firstName2);
    }

    void talkTo(String firstName, String firstName2, String firstName3) {
        System.out.println(name + ": " + "Hello, " + firstName + ", " + firstName2 + " and " + firstName3); 
    }


    // Arguments using built objects
    void talkTo(Tao x) {
        System.out.println(getFirstName() + ": " + "Hello, " + x.getFirstName() + " mah friend");
    }

    String getFirstName() {

        String[] getName = name.split("");
        ArrayList<String> firstName = new ArrayList<>();
        for (int i = 0; i < getName.length; i++) {
            if (getName[i].equals(" ")) {
                break;
            }
            firstName.add(getName[i]);
        }

        firstName.toString();
        return String.join("", firstName);

    }
    
}
