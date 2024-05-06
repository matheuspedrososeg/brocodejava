package Strings;

public class StringMethods {
    public static void main(String[] args) {

        // reference data types have access to useful methods

        String name = "bro";

       // boolean result = name.equalsIgnoreCase("bro");

        // int result = name.length(); comprimento do nome

        // char result = name.charAt(1); caractere na posicao x
         int result = name.indexOf("b"); // diz onde B está

        System.out.println(result);

       // boolean result = name.isEmpty(); indica se o nome esta em branco

       // String result = name.toUpperCase(); tudo para maiusculo

       // String result = name.toLowerCase();
       //String result = name.trim(); removes empty space in the string

       // String result = name.replace('o' , 'a');muda o caractere


    }
}
