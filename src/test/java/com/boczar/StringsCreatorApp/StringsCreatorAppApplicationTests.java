package com.boczar.StringsCreatorApp;

import com.boczar.StringsCreatorApp.exceptions.ToManyWantedStringsException;
import com.boczar.StringsCreatorApp.util.StringsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

import static com.boczar.StringsCreatorApp.util.StringsService.getNumberOfPossibleStrings;

@SpringBootTest
class StringsCreatorAppApplicationTests {
    @Autowired
    StringsService stringService;

    @Test
    public void testIfMethodFor13abWillReturn14() {
        int min = 1;
        int max = 3;
        String chars = "ab";
        int numberOfPossibleStrings = getNumberOfPossibleStrings(min, max, chars);
        Assertions.assertEquals(14, numberOfPossibleStrings);
    }

    @Test
    public void testIfMethodFor23abWillReturn12() {
        int min = 2;
        int max = 3;
        String chars = "ab";
        int numberOfPossibleStrings = getNumberOfPossibleStrings(min, max, chars);
        Assertions.assertEquals(12, numberOfPossibleStrings);
    }

    @Test
    public void testIfMethodFor12abcWillReturn12() {
        int min = 1;
        int max = 2;
        String chars = "abc";
        int numberOfPossibleStrings = getNumberOfPossibleStrings(min, max, chars);
        Assertions.assertEquals(12, numberOfPossibleStrings);
    }

    @Test
    public void testIfMethodFor13abcWillReturn39() {
        int min = 1;
        int max = 3;
        String chars = "abc";
        int numberOfPossibleStrings = getNumberOfPossibleStrings(min, max, chars);
        Assertions.assertEquals(39, numberOfPossibleStrings);
    }

    @Test
    public void testGetRandomStringsMethodFor12ab() {
        String chars = "ab";
        int min = 1;
        int max = 2;
        int noOfWantedStrings = 6;

        Set<String> randomStringsOfChars = stringService.getRandomStringsOfChars(chars, min, max, noOfWantedStrings);
        Assertions.assertEquals(randomStringsOfChars.size(), 6);
    }

    @Test()
    public void testGetRandomStringsMethodForException() {
        String chars = "ab";
        int min = 1;
        int max = 2;
        int noOfWantedStrings = 7;
        ToManyWantedStringsException exception = Assertions.assertThrows(ToManyWantedStringsException.class, () -> {
            stringService.getRandomStringsOfChars(chars, min, max, noOfWantedStrings);
        });
        Assertions.assertEquals("It is not possible to generate this many unique strings." , exception.getMessage());
    }
}
