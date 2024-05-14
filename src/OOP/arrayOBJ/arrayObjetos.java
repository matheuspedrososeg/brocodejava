package OOP.arrayOBJ;

public class arrayObjetos {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        char[] characters = new char[4];
        String[] strings = new String[5];

        //  comida[] refrigerator = new comida[3];


        comidaArrayOBJ comida1 = new comidaArrayOBJ("pizza");
        comidaArrayOBJ comida2 = new comidaArrayOBJ("hamburguer");
        comidaArrayOBJ comida3 = new comidaArrayOBJ("hotdog");


        comidaArrayOBJ[] refrigerator = {comida1, comida2, comida3};


        // refrigerator[0] = comida1;
        //refrigerator[1] = comida2;
        //  refrigerator[2] = comida3;

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);


    }
}
