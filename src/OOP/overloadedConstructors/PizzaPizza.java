package OOP.overloadedConstructors;

import OOP.overloadedConstructors.Pizza;

public class PizzaPizza {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("thick crust" , "tomato");

        System.out.println("here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);




    }
}
