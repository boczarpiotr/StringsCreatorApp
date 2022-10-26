package com.boczar.StringsCreatorApp.util;

import com.boczar.StringsCreatorApp.model.Request;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class RequestService {
    public Request getRequestObjectOfJson(String body) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(body, Request.class);
    }
}
