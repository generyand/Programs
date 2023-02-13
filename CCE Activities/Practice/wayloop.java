package Practice;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Scanner;

public class wayloop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter name to search: ");
        String userInputName = scan.nextLine();
        scan.close();
        System.out.println();

        // Array
        String[] arrayNames = { "Gene Ryan", "Asnari", "Ace" };
        int[] arrayIds = { 59886, 12345, 98765 };

        int i;
        for (i = 0; i < arrayNames.length; i++) {
            if (userInputName.equalsIgnoreCase(arrayNames[i])) {
                System.out.println("Name:\t" + userInputName);
                System.out.println("ID:\t" + arrayIds[i]);
                break;
            }
        }
        if (i == arrayNames.length) {
            System.out.println("No Name Found");
        }

        System.out.println();
        System.out.println();

        // ArrayList
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Gene Ryan", "Asnari", "Ace"));
        ArrayList<Integer> ids = new ArrayList<>(Arrays.asList(59886, 12345, 98765));

        if (names.contains(userInputName)) {
            System.out.println("Name:\t" + userInputName);
            System.out.println("ID:\t" + ids.get(names.indexOf(userInputName)));
        } else {
            System.out.println("No Name Found");
        }

        System.out.println();
        System.out.println();

        // LinkedList
        LinkedList<String> linkedNames = new LinkedList<>(Arrays.asList("Gene Ryan", "Asnari", "Ace"));
        LinkedList<Integer> linkedIds = new LinkedList<>(Arrays.asList(59886, 12345, 98765));

        if (linkedNames.contains(userInputName)) {
            System.out.println("Name:\t" + userInputName);
            System.out.println("ID:\t" + linkedIds.get(names.indexOf(userInputName)));
        } else {
            System.out.println("No Name Found");
        }

        System.out.println();
        System.out.println();

        // HashMap
        HashMap<String, Integer> id = new HashMap<>();

        id.put("Gene Ryan", 59886);
        id.put("Asnari", 12345);
        id.put("Vincent Ace", 98765);

        if (id.containsKey(userInputName)) {
            System.out.println("Name:\t" + userInputName);
            System.out.println("ID:\t" + id.get(userInputName));
        } else {
            System.out.println("No Name Found");
        }
    }

}