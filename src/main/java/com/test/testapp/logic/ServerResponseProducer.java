package com.test.testapp.logic;

import com.test.testapp.rest.domain.ServerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.Instant;

public class ServerResponseProducer {

    private static final Logger logger = LoggerFactory.getLogger(ServerResponseProducer.class);

    private final String hostName;

    private ServerResponseProducer() {
        String hostName1;
        try {
            InetAddress ip;
            ip = InetAddress.getLocalHost();
            hostName1 = ip.getHostName();
        }
        catch (UnknownHostException e) {
            logger.error("Could not resolve local host -> ignoring");
            hostName1 = "unknown";
        }
        hostName = hostName1;
    }

    public ServerResponse getServerResponse() {
        return new ServerResponse(hostName, Instant.now().toString());
    }

    private static ServerResponseProducer serverResponseProducer;

    public static ServerResponseProducer getServerResponseProducer() {
        if(serverResponseProducer==null) {
            serverResponseProducer = new ServerResponseProducer();
        }
        return serverResponseProducer;
    }
}
