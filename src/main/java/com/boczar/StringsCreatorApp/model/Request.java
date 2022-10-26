package com.boczar.StringsCreatorApp.model;

import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Component
public class Request {
    private int min;
    private int max;
    private String chars;
    private int numberOfStrings;

}
