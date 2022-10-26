package com.boczar.StringsCreatorApp;

public class TestMain {
    public static void main(String[] args) {

        String errorMessage = "to many wanted strings";

        String s = "{\n" +
                "  \"errorMessage\": \""+ errorMessage +"\",\n" ;
        System.out.println(s);
    }
}
