import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    DatagramSocket udpClien;
    public Client(String line, String adress, int port) throws IOException {
        udpClien = new DatagramSocket();
        byte msg[] = (line+"\n").getBytes();
        InetAddress localHost = InetAddress.getByName(adress);
        DatagramPacket out = new DatagramPacket(msg, 0, msg.length, localHost, port);
        udpClien.send(out);

    }

}