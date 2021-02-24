package com.test.testapp.logic;

import junit.framework.TestCase;
import org.junit.Ignore;

public class ServerResponseProducerTest extends TestCase {

    public void testGetServerResponse() {
        ServerResponseProducer  spr = ServerResponseProducer.getServerResponseProducer();
        assertTrue(spr.getServerResponse().getMyTime().startsWith("20"));
        assertFalse(spr.getServerResponse().getMyHostName().isEmpty());
    }

    public void testGetServerResponseProducer() {
        ServerResponseProducer  spr = ServerResponseProducer.getServerResponseProducer();
        assertEquals(spr,ServerResponseProducer.getServerResponseProducer());
    }

}