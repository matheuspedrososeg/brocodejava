package broArrays;

import java.util.ArrayList;
public class arraysLists {
    public static void main(String[] args) {


        // arraylist = a resizable array.
        // elements can be added and removed after compilation phase
        // store reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburguer");
        food.add("hotdog");

        food.set(0 , "sushi");
        food.remove(2);
        // food.clear(); remove todos os arrays

        for (int i=0; i<food.size(); i++) { // arraylist nao usa .length , mas sim .size
            System.out.println(food.get(i));



        }

    }
}
