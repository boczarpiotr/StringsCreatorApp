package com.boczar.StringsCreatorApp.util;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//let's say returning unique words works
public class StringsService {
    public static void main(String[] args) {
        String chars = "ab";
        Random random = new Random();
        Set<String> uniqueStrings = new HashSet<>();


        while (uniqueStrings.size() != 12) {
            StringBuilder sb = new StringBuilder();
            int maxLength = random.nextInt(2, 4);
            for (int i = 0; i < maxLength; i++) {
                //get random index out of chars string
                int index = random.nextInt(chars.length());
                //get random character based on index
                char randomChar = chars.charAt(index);
                //append it to sb
                sb.append(randomChar);
            }
            //System.out.println(sb);
            uniqueStrings.add(sb.toString());
        }

        uniqueStrings.forEach(System.out::println);
        System.out.println(uniqueStrings.size());
    }
}
