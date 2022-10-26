package com.boczar.StringsCreatorApp.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Component
@Entity
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int min;
    private int max;
    private String chars;
    private int numberOfStrings;

    public Request(int min, int max, String chars, int numberOfStrings) {
        this.min = min;
        this.max = max;
        this.chars = chars;
        this.numberOfStrings = numberOfStrings;
    }
}
