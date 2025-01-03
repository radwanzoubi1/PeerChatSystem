# PeerChatSystem

This project implements a simple peer-to-peer chat application in Java, enabling two peers to connect and exchange real-time messages. The system employs a lightweight client-server architecture and emphasizes minimal setup, efficient communication, and user-friendly command-line interactions.

---

### About PeerChatSystem

PeerChatSystem is a Java-based application designed to facilitate direct communication between two users in a peer-to-peer manner. It offers an intuitive interface and robust backend to establish, manage, and close connections seamlessly. By leveraging Java's networking capabilities, PeerChatSystem delivers an efficient and reliable messaging experience.

#### Key Capabilities
- **Peer-to-Peer Communication**: Supports server and client modes for flexible connectivity.
- **Real-Time Messaging**: Enables seamless message exchange.
- **Command-Line Interface**: Provides a straightforward interface for user input and message display.
- **Connection Management**: Handles connection setup, data transfer, and termination effectively.

#### Further Reading
To explore more about peer-to-peer architecture and Java networking:
- [Java Networking Basics](https://docs.oracle.com/javase/tutorial/networking/overview.html)
- [Peer-to-Peer Architecture on Wikipedia](https://en.wikipedia.org/wiki/Peer-to-peer)

---

## About the Problem

### Domain:
- **Networking and Communication**: Building real-time applications using Java sockets.
- **Purpose**: Enable two peers to connect, send, and receive messages in a reliable and efficient manner.

### Problem Overview:
- **Task**: Implement a chat system where users can initiate or join a peer-to-peer communication session.
- **Optimization Criteria**:
  - Simplify setup for users with minimal configurations.
  - Provide responsive message handling and real-time updates.
- **Challenges**: Managing socket connections and ensuring smooth data transfer between peers.

---

## Project Objectives

1. **Peer-to-Peer Communication**:
   - Allow one peer to act as a server and another as a client.
   - Enable bi-directional message exchange using Java sockets.

2. **User-Friendly Interface**:
   - Design a command-line interface for easy interaction.
   - Provide clear prompts and real-time message updates.

3. **Robust Connection Handling**:
   - Ensure reliable setup, maintenance, and closure of connections.
   - Handle unexpected disconnections gracefully.

---

## Key Features Explored

1. **How to establish reliable peer-to-peer connections?**
   - Addressed using Java `Socket` and `ServerSocket`.

2. **How to handle real-time user input and message delivery?**
   - Implemented with threading to separate input/output processes.

3. **How to ensure minimal setup for users?**
   - Simplified mode selection (server/client) with clear instructions.

---

## Tools and Libraries Used

- **Java**: Core programming language for implementation.
- **Socket API**: Enables networking and communication.

---

## How to Run

### 1. Clone the Repository:
```bash
git clone https://github.com/<your-username>/PeerChatSystem.git
cd PeerChatSystem
```

### 2. Set Up Java Environment:
Ensure you have JDK installed. If not, download and install it from [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html).

### 3. Compile and Run:
- **Compile the Code**:
```bash
javac peer2PeerChatSystem/*.java
```
- **Run the Program**:
```bash
java peer2PeerChatSystem.PeerChatApp
```

### 4. Usage:
- Start the application and select a mode:
  - **Server Mode**: Enter a port number to wait for a connection.
  - **Client Mode**: Enter the server's IP address and port to connect.
- Start chatting! Type messages and press Enter to send. Type `exit` to close the connection.

---

## Architecture and Design

### 1. Top-Level Peer-to-Peer Architecture
Below is the high-level architecture, showing the components and connectors of the PeerChatSystem:
![Top-Level Architecture](https://github.com/radwanzoubi1/PeerChatSystem/blob/main/P2P%20Architecture.PNG)

### 2. UML Representation of Classes
The UML diagram illustrates the relationships and interactions between the classes:
![UML Diagram](https://github.com/radwanzoubi1/PeerChatSystem/blob/main/UML.PNG)

### 3. Source Code Mapping to Components
This section maps the source code files to their respective components and connectors:

![Source Code Mapping](https://github.com/radwanzoubi1/PeerChatSystem/blob/main/Capture3.PNG)

---

## Output Samples

Here are sample outputs showcasing the solution's results:

- **Server Startup**:
  ```
  Enter port number: 12345
  Server started on port: 12345
  Client connected.
  ```
- **Client Connection**:
  ```
  Enter server IP and port: 127.0.0.1 12345
  Connected to server.
  ```
- **Chat Example**:
  ```
  Server: Hello, Client!
  Client: Hi, Server!
  ```

---

## Acknowledgments

This project was inspired by the principles of peer-to-peer architecture and Java's robust networking capabilities. Learn more about these concepts from the [Java Networking Guide](https://docs.oracle.com/javase/tutorial/networking/overview.html) and [Peer-to-Peer Networking](https://en.wikipedia.org/wiki/Peer-to-peer). 
