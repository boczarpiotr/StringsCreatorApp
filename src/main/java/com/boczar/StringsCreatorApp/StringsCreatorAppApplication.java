package com.boczar.StringsCreatorApp;

import com.boczar.StringsCreatorApp.model.Request;
import com.boczar.StringsCreatorApp.repository.RequestRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StringsCreatorAppApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(StringsCreatorAppApplication.class, args);
        RequestRepository requestRepository = configurableApplicationContext.getBean(RequestRepository.class);
    }
}
