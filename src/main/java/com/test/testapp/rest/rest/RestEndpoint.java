package com.test.testapp.rest.rest;

import com.test.testapp.rest.domain.ServerResponse;
import com.test.testapp.logic.ServerResponseProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class RestEndpoint {

    private static final Logger logger = LoggerFactory.getLogger(RestEndpoint.class);


    @GetMapping(value="/server/basicinfo", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ServerResponse> getServerTime(HttpServletRequest request) {
        logger.info("Received request from "+request.getRemoteAddr());
        return ResponseEntity.ok(ServerResponseProducer.getServerResponseProducer().getServerResponse());
    }

}
