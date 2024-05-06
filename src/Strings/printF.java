package Strings;

public class printF {
    public static void main(String[] args) {

        // printf = metodo opcional para controlar, formatar e mostrar texto para a janela do console.
        // dois argumentos = format string + (objeto/ variavel ou valor)
        // % [flags] [ precision ] [ width ] [ conversion character ]
        // %d valor numerico
        // %f para double e float, numeros com virgula

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "maeda";
        int myInt = 50;
        double myDouble = 1000;

       // System.out.printf("%b" , myBoolean);
        // System.out.printf("%c" , myChar);
       //  System.out.printf("%s" , myString);
       // System.out.printf("%d" , myInt);
        // System.out.printf("%f" , myDouble);

        // [width]
        System.out.printf("hello %10s" , myString);

        // precision
       // System.out.printf("you have this much money %.2f" , myDouble);

        // flags

        System.out.printf("you have this much money %,20f" , myDouble);

    }
}
