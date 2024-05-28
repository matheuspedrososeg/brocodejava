package AplicacaoEcho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {

        System.out.println("Client started.");
        try {
            Socket soc = new Socket("localhost" , 9806); // can be written in proxy: localhost, or 127.0.0.1
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in)); // system.in to receive input
            System.out.println("Enter a String.");
            String str = userInput.readLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true); // boolean statement is used to send data (for auto flush)
            out.println(str);
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
             System.out.println(in.readLine());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
