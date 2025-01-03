package peer2PeerChatSystem;

import java.io.*;
import java.net.*;

public class Peer {
    private Socket socket;
    private ServerSocket serverSocket;
    private BufferedReader input;
    private PrintWriter output;
    private EventDistributor distributor;

    public Peer(EventDistributor distributor) {
        this.distributor = distributor;
    }

    public void startServer(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server started on port: " + port);
            socket = serverSocket.accept();
            System.out.println("Client connected");
            setupStreams();
            listenForMessages();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void connectToPeer(String address, int port) {
        try {
            socket = new Socket(address, port);
            System.out.println("Connected to server");
            setupStreams();
            listenForMessages();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void setupStreams() throws IOException {
        input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        output = new PrintWriter(socket.getOutputStream(), true);
    }

    private void listenForMessages() {
        new Thread(() -> {
            while (true) {
                try {
                    String message = input.readLine();
                    if (message != null) {
                        distributor.handleMessage(message);
                    }
                } catch (IOException e) {
                    System.out.println("Connection End");
                    break;
                }
            }
        }).start();
    }

    public void sendMessage(String message) {
        output.println(message);
    }

    public void closeConnection() {
        try {
            if (input != null) input.close();
            if (output != null) output.close();
            if (socket != null) socket.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}





