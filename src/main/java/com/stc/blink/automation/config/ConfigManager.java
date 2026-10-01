package com.stc.blink.automation.config;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;

public class ConfigManager {

    private static final JsonNode config;

    static {
        try {
            InputStream inputStream =
                    ConfigManager.class
                            .getClassLoader()
                            .getResourceAsStream("config.json");

            if (inputStream == null) {
                throw new RuntimeException("config.json not found");
            }

            ObjectMapper mapper = new ObjectMapper();
            config = mapper.readTree(inputStream);

        } catch (Exception e) {
            throw new RuntimeException(
                    "Failed to load config.json", e);
        }
    }

    public static int getExplicitWait() {
        return config
                .get("timeouts")
                .get("explicitWait")
                .asInt();
    }

    public static int getAssertWait() {
        return config
                .get("timeouts")
                .get("assertWait")
                .asInt();
    }

    public static int getPollingInterval() {
        return config
                .get("timeouts")
                .get("pollingInterval")
                .asInt();
    }

    public static int getNewCommandTimeout() {
        return config
                .get("timeouts")
                .get("newCommandTimeout")
                .asInt();
    }
}