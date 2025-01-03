package peer2PeerChatSystem;


import java.util.*;
public class PeerChatApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to start as a server or 2 to start as a client:");
        int choice = scanner.nextInt();
        scanner.nextLine();

        EventDistributor distributor = new EventDistributor();
        Peer peer = new Peer(distributor);
        Interface userInterface = new Interface(distributor);

        distributor.setPeer(peer);
        distributor.setUserInterface(userInterface);

        if (choice == 1) {
            System.out.println("Enter port number:");
            int port = scanner.nextInt();
            scanner.nextLine();
            peer.startServer(port);
        } else {
            System.out.println("Enter server IP and port :");
            String address = scanner.nextLine();
            String[] parts = address.split(" ");
            peer.connectToPeer(parts[0], Integer.parseInt(parts[1]));
        }

        userInterface.getUserInput();
    }
}


