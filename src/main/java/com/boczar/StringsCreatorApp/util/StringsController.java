package com.boczar.StringsCreatorApp.util;

import com.boczar.StringsCreatorApp.model.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Set;

@RestController
public class StringsController {
    @Autowired
    RequestService requestService;
    @Autowired
    StringsService stringsService;
    @Autowired
    FileService fileService;

    @PostMapping("/generate")
    public String startGenerating(@RequestBody String body) throws IOException {
        try {
            Request request = requestService.getRequestObjectOfJson(body);
            Set<String> randomStringsOfChars = stringsService.getRandomStringsOfChars(request.getChars(), request.getMin(), request.getMax(), request.getNumberOfStrings());
            fileService.saveAllStringsToAFile(randomStringsOfChars);
        } catch (Exception e) {
            return "{\n" +
                    "  \"errorMessage\": \"" + e.getMessage() + "\"\n" +
                    "}";
        }
        return "Your request is now being processed, please check C:\\GeneratedStrings folder for a new file(s)";
    }
}
