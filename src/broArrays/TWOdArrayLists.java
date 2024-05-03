package broArrays;

import java.util.ArrayList;

public class TWOdArrayLists {
    public static void main(String[] args) {

        // 2d Array List = a dynamic list of lists
        // you can change the size of these lists during runtime

        ArrayList<ArrayList<String>> grocerylist = new ArrayList<>();

        ArrayList<String> bakerylist = new ArrayList<>();
        bakerylist.add("pasta");
        bakerylist.add("garlic bread");
        bakerylist.add("donuts");

        ArrayList<String> producelist = new ArrayList<>();
        bakerylist.add("tomatoes");
        bakerylist.add("zucchini");
        bakerylist.add("peppers");

        ArrayList<String> drinkslist = new ArrayList<String>();
        drinkslist.add("Soda");
    drinkslist.add("Coffee");

    grocerylist.add(bakerylist);
    grocerylist.add(producelist);
    grocerylist.add(drinkslist);


        System.out.println(grocerylist);


    }
}
