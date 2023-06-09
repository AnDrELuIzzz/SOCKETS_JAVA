
import java.net.*;
import java.io.*;

public class Server {
    public static void main(String args[]) throws IOException {
        ServerSocket serverSocket = new ServerSocket(4000);
        Socket socket = serverSocket.accept();// O método accept ( ) bloqueia ( fica lá ) até que um cliente se conecte
                                              // ao servidor.
        System.out.println("Cliente conectado");

        InputStreamReader inputReader = new InputStreamReader(socket.getInputStream()); // getInputStream() retorna um
                                                                                        // fluxo de entrada para o
                                                                                        // soquete fornecido
        BufferedReader reader = new BufferedReader(inputReader);
        String x;
        while ((x = reader.readLine()) != null) {
            System.out.println("Servidor: " + x);
        }

        try {
            serverSocket.close();
            socket.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }
}