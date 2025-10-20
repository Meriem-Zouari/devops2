package com.example;

import java.io.IOException;
import java.io.OutputStream;
import com.sun.net.httpserver.*;

public class Main {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new java.net.InetSocketAddress(8081), 0);
        server.createContext("/", exchange -> {
            String response = "Hello from my simple Java app!";
            exchange.sendResponseHeaders(200, response.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        });
        System.out.println("Server started on port 8081");
        server.start();
    }
}
