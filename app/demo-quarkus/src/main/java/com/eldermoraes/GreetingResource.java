package com.eldermoraes;

import java.net.InetAddress;
import java.net.UnknownHostException;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    private static int i = 0;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws UnknownHostException {
        return "Hello, Confraria Dev! V2: " + i++ + " - " + InetAddress.getLocalHost().getHostName() + "\n";
    }
}
