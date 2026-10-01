package config;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public final class CapabilityLoader {

    private CapabilityLoader() {
    }

    public static DesiredCapabilities load(String fileName) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        try (InputStream inputStream = CapabilityLoader.class
                .getClassLoader()
                .getResourceAsStream(fileName)) {
            if (inputStream == null) {
                throw new IllegalStateException(fileName + " was not found in test resources");
            }

            Map<String, Object> values = objectMapper.readValue(
                    inputStream,
                    new TypeReference<>() {
                    }
            );

            DesiredCapabilities capabilities = new DesiredCapabilities();
            values.forEach(capabilities::setCapability);
            return capabilities;
        }
    }
}
