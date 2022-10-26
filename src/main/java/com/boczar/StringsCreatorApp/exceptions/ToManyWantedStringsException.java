package com.boczar.StringsCreatorApp.exceptions;

public class ToManyWantedStringsException extends RuntimeException {
    public ToManyWantedStringsException(String errorMessage) {
        super(errorMessage);
    }
}
