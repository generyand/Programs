package OverloadedConstructors;

public class Main {
    
    public static void main(String[] args) {
        
        Pizza pizza = new Pizza("thick crust", "tomato");

        System.out.println("Here are the ingredients for your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

    }

}
