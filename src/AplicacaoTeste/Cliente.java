package AplicacaoTeste;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) {
        try {
            Socket soc = new Socket("localhost" , 9806);
            System.out.println("Insira uma mensagem.");
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String str = userInput.readLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println(str);
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
