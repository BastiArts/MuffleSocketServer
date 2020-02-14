package com.bastiarts.muffle;

import com.bastiarts.muffle.endpoint.QueueEndpoint;
import org.glassfish.tyrus.server.Server;
 
public class MuffleSocketServer {
    public static final String URL = "localhost";
    public static final int PORT = 8025;
    public static void main(String[] args) {
        Server server = new Server("localhost", 8025, "/muffle", QueueEndpoint.class);
        try {
            server.start();
            System.out.println("Server is listening at ws://" + URL + ":" + PORT);
            System.out.println("Press enter to stop the server...");
            System.in.read();
            server.stop();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            server.stop();
        }
    }
}
