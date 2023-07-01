package cys21082.practise.net;



import java.io.*;
import java.net.*;

/**
 * The SimpleClient class represents a simple client program.
 * It connects to a server on the specified host and port, sends and receives messages, and closes the connection.
 * This class demonstrates basic network programming using sockets.
 *
 * Note: This is a simple example and does not handle advanced error handling or response handling from the server.
 *
 * Usage:
 * - Run the SimpleServer program to start the server.
 * - Run the SimpleClient program to connect to the server and send/receive messages.
 * - The server receives the messages, processes them, and sends responses back to the client.
 * - The client program continues to send/receive messages until the server sends an "exit" message.
 * - The client program then closes the connection.
 *
 * Note: The server must be running before executing the client program.
 *
 * To change the host and port, modify the arguments of the Socket constructor.
 *
 * @author Ramaguru Radhakrishnan
 * @version 0.5
 */
public class Client {
    /**
     * The main method is the entry point of the program.
     * It establishes a connection to the server, sends and receives messages, and closes the connection.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        try {
            // Create a socket and connect to the server at "localhost" on port 2444
            Socket socket = new Socket("localhost", 2444);

            // Create a DataInputStream to receive messages from the server
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            // Create a DataOutputStream to send messages to the server
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            // Continuously send and receive messages until the server sends an "exit" message
            while (true) {
                // Read the message from the server
                String receivedMessage = dis.readUTF();
                System.out.println("Server: " + receivedMessage);

                // Check if the server sent an "exit" message to terminate the client
                if (receivedMessage.equalsIgnoreCase("exit")) {
                    System.out.println("Client exiting...");
                    break;
                }

                // Send a message to the server
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Client: ");
                String messageToSend = br.readLine();
                dos.writeUTF(messageToSend);
                dos.flush();
            }

            // Close the input stream, output stream, and the socket
            dis.close();
            dos.close();
            socket.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
