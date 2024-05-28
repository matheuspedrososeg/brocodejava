package AplicacaoEcho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {

        System.out.println("Waiting for clients...");

        try {
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept(); // when server recieves a connection it will create a new socket.
            System.out.println("Connection established.");

            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream())); // soc.getInputStream is used to read the output
            String str = in.readLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println("Server says: " + str);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
