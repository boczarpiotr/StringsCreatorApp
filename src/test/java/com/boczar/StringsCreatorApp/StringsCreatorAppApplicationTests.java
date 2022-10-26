package com.boczar.StringsCreatorApp;

import com.boczar.StringsCreatorApp.util.StringsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static com.boczar.StringsCreatorApp.util.StringsService.getNumberOfPossibleStrings;

@SpringBootTest
class StringsCreatorAppApplicationTests {
    @Autowired
    StringsService stringService;

    @Test
    public void testIfMethodWillFor13abWillReturn14() {
        int min= 1;
        int max= 3;
        String chars ="ab";
        int numberOfPossibleStrings = getNumberOfPossibleStrings(min, max, chars);
        Assertions.assertEquals(14, numberOfPossibleStrings);
    }
    @Test
    public void testIfMethodWillFor23abWillReturn12() {
        int min= 2;
        int max= 3;
        String chars ="ab";
        int numberOfPossibleStrings = getNumberOfPossibleStrings(min, max, chars);
        Assertions.assertEquals(12, numberOfPossibleStrings);
    }
    @Test
    public void testIfMethodWillFor12abcWillReturn12() {
        int min= 1;
        int max= 2;
        String chars ="abc";
        int numberOfPossibleStrings = getNumberOfPossibleStrings(min, max, chars);
        Assertions.assertEquals(12, numberOfPossibleStrings);
    }
    @Test
    public void testIfMethodWillFor13abcWillReturn39() {
        int min= 1;
        int max= 3;
        String chars ="abc";
        int numberOfPossibleStrings = getNumberOfPossibleStrings(min, max, chars);
        Assertions.assertEquals(39, numberOfPossibleStrings);
    }
}
