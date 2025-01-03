package peer2PeerChatSystem;

public class EventDistributor {
    private Peer peer;
    private Interface userInterface;

    public EventDistributor() {
    }

    public void setPeer(Peer peer) {
        this.peer = peer;
    }

    public void setUserInterface(Interface userInterface) {
        this.userInterface = userInterface;
    }

    public void handleMessage(String message) {
        userInterface.displayMessage(message);
    }

    public void sendUserInput(String input) {
        peer.sendMessage(input);
    }

    public void closeConnection() {
        peer.closeConnection();
    }
}






