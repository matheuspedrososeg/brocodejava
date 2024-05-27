package JavaInputOutputReadWrite;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\menor.ti\\Desktop\\output.txt"));
            String s;
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);

        }

    }
}
