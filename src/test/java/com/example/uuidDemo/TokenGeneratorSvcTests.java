package com.example.uuidDemo;

import com.example.uuidDemo.tokenEngine.TokenGeneratorSvcImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.UUID;
import java.util.logging.Logger;

public class TokenGeneratorSvcTests {

    Logger logger = Logger.getLogger(TokenGeneratorSvcTests.class.getName());

    static TokenGeneratorSvcImpl tokenGenerator;
    static UUID uuid;
    static String token;

    @BeforeAll
    public static void init(){
        tokenGenerator = new TokenGeneratorSvcImpl();
        uuid = tokenGenerator.getUuidObject();
    }

    @Test
    public void testNotEmptyUUIDOrNull(){
        logger.info("This is the UUID generated for the UUID test: " + uuid);
        Assert.notNull(uuid, "the UUID should not be NULL");
    }

    @Test
    public void testNotEmptyUUIDStringOrNull(){
        token = tokenGenerator.getUuidStrFromUuidObj(uuid);
        logger.info("This is the token generated for the UUIDString test: " + token);
        Assert.notNull(token, "the token should not be NULL");
    }


}
