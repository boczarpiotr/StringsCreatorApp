package com.boczar.StringsCreatorApp.util;

import com.boczar.StringsCreatorApp.exceptions.ToManyWantedStringsException;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//let's say returning unique words works
public class StringsService {

    public Set<String> getRandomStringsOfChars(String chars, int min, int max, int numberOfWantedStrings) {
        int numberOfPossibleStrings = getNumberOfPossibleStrings(min, max, chars);

        if (numberOfPossibleStrings < numberOfWantedStrings) {
            throw new ToManyWantedStringsException("It is not possible to generate this many unique Strings");
        } else {
            Random random = new Random();
            Set<String> uniqueStrings = new HashSet<>();

            while (uniqueStrings.size() != numberOfWantedStrings) {
                StringBuilder sb = new StringBuilder();
                int maxLength = random.nextInt(min, max + 1);
                for (int i = 0; i < maxLength; i++) {
                    //get random index out of chars string
                    int index = random.nextInt(chars.length());
                    //get random character based on index
                    char randomChar = chars.charAt(index);
                    //append it to sb
                    sb.append(randomChar);
                }
                uniqueStrings.add(sb.toString());
            }
            return uniqueStrings;
        }
    }

    public static int getNumberOfPossibleStrings(int min, int max, String chars) {
        int result = 0;
        for (int i = min; i <= max; i++) {
            int pow = (int) Math.pow(chars.length(), i);
            result += pow;
        }
        return result;
    }

    public static void main(String[] args) {
//        int min = 1;
//        int max = 2;
//        String chars = "ab";
//        int numberOfWantedStrings = 7;
//
//        StringsService stringsService = new StringsService();
//        Set<String> randomStringsOfChars = stringsService.getRandomStringsOfChars(chars, min, max, numberOfWantedStrings);
//        randomStringsOfChars.forEach(System.out::println);
//
        int createJobThread = Thread.getAllStackTraces().keySet().stream()
                .filter(e -> e.getState().equals(Thread.State.RUNNABLE))
                .filter(e -> e.getName().contains("createJobThread"))
                .toList()
                .size();
        System.out.println(createJobThread); //hmmmmmmmmm
    }
}
