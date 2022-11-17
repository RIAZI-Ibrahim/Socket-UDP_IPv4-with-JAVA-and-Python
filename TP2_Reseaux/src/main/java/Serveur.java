import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Serveur {

    DatagramSocket serveurUDP;
    DatagramPacket in;
    byte msg[] = new byte[50];
    public Serveur() throws IOException {
        this.serveurUDP = new DatagramSocket(1234);
        this.in = new DatagramPacket(msg, 50);
    }

    public static void main(String[] args) throws IOException {
        Serveur serveur = new Serveur();
        Client client = new Client("C1", "localhost",1234);
        Client client1 = new Client("C2", "localhost",1234);
        serveur.serveurUDP.receive(serveur.in);
        System.out.print(new String(serveur.msg));
    }

}
