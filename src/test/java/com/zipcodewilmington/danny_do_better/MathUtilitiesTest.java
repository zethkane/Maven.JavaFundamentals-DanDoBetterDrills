package com.zipcodewilmington.danny_do_better;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by dan on 6/14/17.
 */
public class MathUtilitiesTest {
    private static volatile MathUtilities math = new MathUtilities();

    @Test
    public void testRemainder1(){
        // : Given
        Integer dividend = 7;
        Integer divisor = 3;
        Integer expected = 1;

        // : When
        Integer actual = math.remainder(dividend, divisor);

        // : Then
        assertEquals(expected, actual);
    }


    @Test
    public void testRemainder2(){
        // : Given
        Integer dividend = 8;
        Integer divisor = 3;
        Integer expected = 2;

        // : When
        Integer actual = math.remainder(dividend, divisor);

        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void testGreaterThanTrue(){
        // : Given
        int greaterValue = 450;
        int lesserValue = 350;


        // : When
        boolean outcome = math.isGreaterThan(greaterValue, lesserValue);

        // : Then
        assertTrue(outcome);
    }


    @Test
    public void testGreaterThanFalse(){
        // : Given
        int greaterValue = 350;
        int lesserValue = 350;

        // : When
        boolean outcome = math.isGreaterThan(greaterValue, lesserValue);

        // : Then
        assertTrue(outcome);
    }


    @Test
    public void testLessThanTrue(){
        // : Given
        int greaterValue = 450;
        int lesserValue = 350;


        // : When
        boolean outcome = math.isLessThan(greaterValue, lesserValue);

        // : Then
        assertFalse(outcome);
    }



    @Test
    public void testLessThan1(){
        // : Given
        int greaterValue = 450;
        int lesserValue = 350;


        // : When
        boolean outcome = math.isLessThan(greaterValue, lesserValue);

        // : Then
        assertTrue(outcome);
    }


    @Test
    public void testLessOrEqual(){
        assertTrue(math.isLessThanOrEqualTo(3 , 3));
        assertTrue(math.isLessThanOrEqualTo(3, 6));
    }

    @Test
    public void testGreaterOrEqual(){
        assertTrue(math.isGreaterThanOrEqualTo(4, 4));
        assertTrue(math.isGreaterThanOrEqualTo(78, 5));
    }

    @Test
    public void testLogicalAnd(){
        assertTrue(math.isBoth(3));
        assertFalse(math.isBoth(4));
    }

    @Test
    public void testLogicalOr(){
        assertTrue(math.logicalOr(4));
        assertTrue(math.logicalOr(14564));
        assertFalse(math.logicalOr(54));
    }


}
