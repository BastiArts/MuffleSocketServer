package com.bastiarts.muffle;

import com.bastiarts.muffle.endpoint.QueueEndpoint;
import com.bastiarts.muffle.util.PropertyUtil;
import org.glassfish.tyrus.server.Server;

import java.util.HashSet;
import java.util.Set;

public class MuffleSocketServer {

    public static void main(String[] args) {
        // Init the Config
        PropertyUtil.getInstance().init();
        final String URL = PropertyUtil.getInstance().getProps().getProperty("server.host");
        final String ROOT_PATH = PropertyUtil.getInstance().getProps().getProperty("server.rootPath");
        final int PORT = Integer.parseInt(PropertyUtil.getInstance().getProps().getProperty("server.port"));
        Set<Class<?>> endpoints = new HashSet<>();
        // Add custom Endpoints as you like
        endpoints.add(QueueEndpoint.class);
        Server server = new Server(URL, PORT, ROOT_PATH, endpoints);
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
