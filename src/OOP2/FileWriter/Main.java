package OOP2.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("poema.txt"); // cria um novo arquivo
            writer.write("Roses are red. \nViolets are Blue.\n bbbbbbbbbbbbbbb"); // .write escreve
            writer.append("\n um poema de matheus");
            writer.close(); // fecha o "scanner".
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
