package ArrayList2D;

import java.util.ArrayList;

public class twoDArray {
    
    public static void main(String[] args) {
        
        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();

        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("pasta");
        produceList.add("garlic bread");
        produceList.add("donuts");

        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("pepsi");
        drinksList.add("coke");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        System.out.println(groceryList.get(0).get(0));
        
    }

}
