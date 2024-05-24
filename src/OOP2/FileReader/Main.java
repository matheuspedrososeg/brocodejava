package OOP2.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // FileReader = read the contents of a file as a stream of characters. one by one read() returns an int value which contians the byte value
        // when read() returns -1, there is no more data to be read.

        try {
            FileReader reader = new FileReader("poema.txt");
            try {
                int data = reader.read();
                while(data != -1) {
                    System.out.println((char) data);
                    data = reader.read();
                }
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
