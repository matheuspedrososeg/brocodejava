package OOP.superKeyword;

public class mainn {
    public static void main(String[] args) {

        // super = keyword refere a superclasse ( parent ) de um objeto
        // bem similar a keyword "this"

        Heroi heroi = new Heroi("Batman" , 42 , "$$$");
        Heroi heroi2 = new Heroi("Superman", 43 , "everything");

        System.out.println(heroi.name);
        System.out.println(heroi.age);
        System.out.println(heroi.power);

        System.out.println(heroi2.toString());

    }
}
