package asen.restswagger.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class LoggerUtil {

    ObjectMapper objectMapper;

    @Autowired
    public LoggerUtil(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public void logObjectToDebug(Logger logger, String message, Object request) {
        try {
            logger.debug("{}{}", message, objectMapper.writeValueAsString(request));
        } catch (JsonProcessingException e) {
            logger.warn("While logging fail to convert");
        }
    }
}
