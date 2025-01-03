package peer2PeerChatSystem;

import java.util.*;

public class Interface {
    private final Scanner scanner = new Scanner(System.in);
    private final EventDistributor distributor;

    public Interface(EventDistributor distributor) {
        this.distributor = distributor;
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void getUserInput() {
        Thread inputThread = new Thread(() -> {
            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    distributor.closeConnection();
                    break;
                }
                distributor.sendUserInput(input);
            }
        });
        inputThread.start();
    }
}



