package metodosJava;

public class methods {
    public static void main(String[] args) {

        // method: a block of code that is executed whenever it is called upon.
        String name = "bro";
        int age = 21;

        hello(name, age);
    }

    static void hello(String name, int age ) {
        System.out.println("hello" + name);
        System.out.println("you are " + age);
    }
}
