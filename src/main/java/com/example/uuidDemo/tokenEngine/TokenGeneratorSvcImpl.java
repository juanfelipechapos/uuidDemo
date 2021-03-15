package com.example.uuidDemo.tokenEngine;

import java.util.UUID;

public class TokenGeneratorSvcImpl implements TokenGeneratorSvc {

    @Override
    public UUID getUuidObject() {
        return UUID.randomUUID();
    }

    @Override
    public String getUuidStrFromUuidObj(UUID uuid) {
        return uuid.toString();
    }
}
