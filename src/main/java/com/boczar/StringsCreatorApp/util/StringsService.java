package com.boczar.StringsCreatorApp.util;

import com.boczar.StringsCreatorApp.exceptions.ToManyWantedStringsException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
public class StringsService {

    public static int getNumberOfPossibleStrings(int min, int max, String chars) {
        Set<Character> setWithoutDuplicates = new HashSet<>();
        char[] charArray = chars.toCharArray();
        for(char char1 : charArray){
            setWithoutDuplicates.add(char1);
        }
        int result = 0;
        for (int i = min; i <= max; i++) {
            int pow = (int) Math.pow(setWithoutDuplicates.size(), i);
            result += pow;
        }
        return result;
    }

    public Set<String> getRandomStringsOfChars(String chars, int min, int max, int numberOfWantedStrings) {
        int numberOfPossibleStrings = getNumberOfPossibleStrings(min, max, chars);

        if (numberOfPossibleStrings < numberOfWantedStrings) {
            throw new ToManyWantedStringsException("It is not possible to generate this many unique strings.");
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
}