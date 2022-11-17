import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class TP2 {

    public static void main(String[] args) throws IOException {
        String line;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader readLine = new BufferedReader(input);
        while((line = readLine.readLine()) != null) {
            Client client = new Client(line, args[0], Integer.parseInt(args[1]));
        }
    }

}