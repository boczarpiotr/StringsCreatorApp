package com.boczar.StringsCreatorApp.exceptions;

import org.apache.tomcat.jni.Thread;

public class ToManyWantedStringsException extends RuntimeException {
    public ToManyWantedStringsException(String errorMessage) {
        super(errorMessage);
    }
}
