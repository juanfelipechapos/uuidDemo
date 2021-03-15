package com.example.uuidDemo.tokenEngine;

import java.util.UUID;
import java.util.logging.Logger;

public class TestToken {
    public  static void main(String [] args){
        Logger logger = Logger.getLogger(TestToken.class.getName());
        TokenGeneratorSvcImpl tokenGenerator = new TokenGeneratorSvcImpl();
        UUID uuid = tokenGenerator.getUuidObject();
        String token = tokenGenerator.getUuidStrFromUuidObj(uuid);
        logger.info("This is the token in string format (UUID): " + token);
    }
}
