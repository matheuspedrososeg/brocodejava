package JavaInputOutputReadWrite;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class Main {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\menor.ti\\Desktop\\output-copy.txt"));
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\menor.ti\\Desktop\\output.txt"));
            String s;
            while((s = br.readLine()) != null) {
                System.out.println(s);
                bw.write(s + "\n");
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);

        }

    }
}
