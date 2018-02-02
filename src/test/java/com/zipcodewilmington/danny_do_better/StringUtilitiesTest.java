package com.zipcodewilmington.danny_do_better;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilitiesTest {
    private static StringUtilities stringUtilities = new StringUtilities();

    @Test
    public void concatenationStringTest(){
        // : Given
        String one = "Hello";
        String two = " Java";
        String expected = "Hello Java";

        // : When
        String actual = stringUtilities.concatenation(one,two);


        // : Then
        assertEquals(expected, actual);
    }


    @Test
    public void concatenationStringAndIntegerTest(){
        // : Given
        int one = 1;
        String two = " Java";
        String expected = "1 Java";

        // : When
        String actual = stringUtilities.concatenation(one,two);


        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void substringBeginTest(){
        // : Given
        String input = "Hello";
        String expected = "olleH";

        // : When
        String actual = stringUtilities.getPrefix(input);

        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void substringEndTest(){
        // : Given
        String input = "Hello";
        String expected = "llo";

        // : When
        String actual = stringUtilities.getSuffix("Hello");

        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void compareToTestEquals(){
        // : Given
        String inputValue = "Zipcode";
        String comparableValue = "Zipcode";

        // : When
        boolean actual = stringUtilities.compareTwoStrings(inputValue, comparableValue);

        // : Then
        assertTrue(actual);
    }


    @Test
    public void compareToTestNotEquals(){
        // : Given
        String inputValue = "Zipcode";
        String comparableValue = "Zipcodee";

        // : When
        boolean actual = stringUtilities.compareTwoStrings(inputValue, comparableValue);

        // : Then
        assertFalse(actual);
    }

    @Test
    public void getTheMiddleChar(){
        // : Given
        String input = "Zipcode";
        char expected = 'c';

        // : When
        char actual = stringUtilities.getMiddleCharacter(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getTheMiddleCharr(){
        // : Given
        String input = "Zipcoder";
        Character expected = 'c';

        // : When
        Character actual = stringUtilities.getMiddleCharacter(input);

        // : Then
        Assert.assertEquals(expected.toString(), actual.toString());
    }


    @Test
    public void getTheFirstWord(){
        // : Given
        String input = "Zipcode Wilmington";
        String expected = "Zipcode";

        // : When
        String actual = stringUtilities.getFirstWord(input);

        // : Then
        assertEquals(expected, actual);
    }


    @Test
    public void getTheSecondWord(){
        // : Given
        String input = "Zipcode Wilmington";
        String expected = "Wilmington";

        // : When
        String actual = stringUtilities.getFirstWord(input);

        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void reverseThem(){
        // : Given
        String input = "Zipcode Wilmington";
        String expected = "notgnimliW edocpiZ";


        // : When
        String actual = stringUtilities.reverseTheTwo(input);

        // : Then
        assertEquals(expected, actual);
    }
}
