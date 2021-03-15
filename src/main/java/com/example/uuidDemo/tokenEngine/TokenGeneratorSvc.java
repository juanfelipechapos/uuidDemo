package com.example.uuidDemo.tokenEngine;

import java.util.UUID;

public interface TokenGeneratorSvc {

    UUID getUuidObject();
    String getUuidStrFromUuidObj(UUID uuid);

}
