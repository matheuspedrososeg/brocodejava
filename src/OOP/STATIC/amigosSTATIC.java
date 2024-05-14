package OOP.STATIC;

public class amigosSTATIC {

    String name;

    static int numberFriends;
    amigosSTATIC(String name) {
        this.name = name;

        numberFriends++;
    }

    static void displayFriends() {
        System.out.println("you have " + numberFriends + " friends.");
    }
}
