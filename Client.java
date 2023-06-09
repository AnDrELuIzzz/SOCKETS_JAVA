
// A Java program for a Client
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

    public static void main(String args[]) throws IOException {
        // 1. Abre conexao
        // Este método tenta se conectar ao servidor especificado na porta especificada.
        // Se esse construtor não lançar uma exceção, a conexão será bem-sucedida e o
        // cliente será conectado ao servidor.
        Socket socket = new Socket("localhost", 4000);
        Scanner scanner = new Scanner(System.in);
        // Stream de saida
        PrintStream saida = new PrintStream(socket.getOutputStream());
        String teclado = scanner.nextLine();
        saida.println(teclado);

        try {
            scanner.close();
            socket.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}