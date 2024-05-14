package OOP.STATIC;

import OOP.STATIC.amigosSTATIC;

public class PalavraStatic {
    public static void main(String[] args) {

        // static = uma copia unica de uma variavel ou metodo que é criado e compartilhado
        // a classe "é dona" do membro static


        amigosSTATIC amigo1 = new amigosSTATIC("Spongebob");
        amigosSTATIC amigo2 = new amigosSTATIC("Patrick");
        amigosSTATIC amigo3 = new amigosSTATIC("Squidward");

       amigosSTATIC.displayFriends();

        // System.out.println(amigosSTATIC.numberFriends);


    }
}
