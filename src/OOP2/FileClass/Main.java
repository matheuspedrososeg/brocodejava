package OOP2.FileClass;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        // file = an abstract representation of file and directory pathnames.


        File file = new File("teste.txt");

        if (file.getAbsoluteFile().exists()) {
            System.out.println("esse arquivo existe ");
            System.out.println(file.getPath()); // cita o nome  do arquivo
            System.out.println(file.getAbsolutePath()); // cita onde ta o arquivo no pc , C:\Users\menor.ti\IdeaProjects\BroJava\teste.txt
            System.out.println(file.isFile()); // se a file for uma file, retorna true;
            //  file.delete(); // vai deletar o arquivo

        } else {
            System.out.println("esse arquivo nao existe doidao");
        }
    }
}
