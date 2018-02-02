package com.zipcodewilmington.danny_do_better;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by dan on 6/14/17.
 */
public class PrimativeTypesTest {
    private PrimativeTypes primativeTypes = new PrimativeTypes();

    @Test
    public void testAdditions() {
        int baseValue = 20;
        int addedValue = 7;
        int expected = 27;
        int actual = primativeTypes.add(baseValue, addedValue);
        assertEquals(expected,actual);
    }
    @Test
    public void testAdditions1() {
        long baseValue = 228437266;
        long difference = 228437265;
        long expected = 456874531;
        long actual = primativeTypes.add(baseValue, difference);
        assertEquals(expected,actual);
    }
    @Test
    public void testAdditions2() {
        short baseValue = 16384;
        short addedValue = 7;
        short expected = 32767;
        short actual = primativeTypes.add(baseValue, addedValue);
        assertEquals(expected,actual);
    }

    @Test
    public void testAdditions4() {
        byte baseValue = 63;
        byte addedValue = 64;
        byte expected = 127;
        byte actual = primativeTypes.add(baseValue, addedValue);
        assertEquals(expected,actual);
    }
    @Test
    public void testAdditions5() {
        float baseValue = 750.585F;
        float addedValue = 795.000F;
        float expected = 1545.585F;
        float actual = primativeTypes.add(baseValue, addedValue);
        assertEquals(expected,actual, 0);
    }

    @Test
    public void testAdditions6() {
        double baseValue = 225.25;
        double addedValue = 231;
        double expected = 456.25;
        double actual = primativeTypes.add(baseValue,addedValue);
        assertEquals(expected,actual, 0);
    }
















    @Test
    public void testSubtractions(){
        int baseValue = 20;
        int difference = 7;
        int expectedInt = 13;
        int actualInt = primativeTypes.subtract(baseValue,difference);
        assertEquals(expectedInt,actualInt);
    }
    @Test
    public void testSubtractions1() {
        long baseValue = 228437266;
        long difference = 228437265;
        long expectedLong = 1;
        long actualLong = primativeTypes.subtract(baseValue, difference);
        assertEquals(expectedLong,actualLong);
    }
    @Test
    public void testSubtractions2() {
        short baseValue = 16384;
        short difference = 16383;
        short expectedShort = 1;
        short actualShort = (short) primativeTypes.subtract(baseValue, difference);
        assertEquals(expectedShort,actualShort);
    }
    @Test
    public void testSubtractions3() {
        byte baseValue = 63;
        byte difference = 64;
        byte expectedByte = -1;
        byte actualByte = primativeTypes.subtract(baseValue, difference);
        assertEquals(expectedByte,actualByte);
    }
    @Test
    public void testSubtractions4() {
        float baseValue = 750.585F;
        float difference = 795.0F;
        float expectedFloat = (float) -44.415;
        float actualFloat = (float) primativeTypes.subtract(baseValue,difference);
        assertEquals(expectedFloat,actualFloat, 0);
    }
    @Test
    public void testSubtractions5() {
        double baseValue = 225.25;
        double difference = 231;
        double expectedDouble = -5.75;
        double actualDouble = primativeTypes.subtract(baseValue, difference);
        assertEquals(expectedDouble,actualDouble, 0);
    }














    @Test
    public void testDivision(){
        int dividend = 20;
        int divisor = 2;
        int expectedInt = 10;
        int actualInt = primativeTypes.divide(dividend, divisor);
        assertEquals(expectedInt,actualInt);
    }
    @Test
    public void testDivision1() {
        int dividend = 20000000;
        int divisor = 1000;
        long expectedLong = 20000;
        long actualLong = primativeTypes.divide(dividend, divisor);
        assertEquals(expectedLong,actualLong);
    }
    @Test
    public void testDivision2() {
        short dividend = 2;
        short divisor = 1;
        short expectedShort = 2;
        short actualShort = primativeTypes.divide(dividend, divisor);
        assertEquals(expectedShort,actualShort);

    }
    @Test
    public void testDivision3() {
        byte dividend = 64;
        byte divisor = 32;
        byte expectedByte = 2;
        byte actualByte = (byte) primativeTypes.divide(dividend, divisor);
        assertEquals(expectedByte,actualByte);
    }
    @Test
    public void testDivision4() {
        float dividend = 7.5F;
        float divisor = 3;
        float expectedFloat = 2.50F;
        float actualFloat = primativeTypes.divide(dividend,divisor);
        assertEquals(expectedFloat,actualFloat, 0);
    }
    @Test
    public void testDivision5() {
        double dividend = 5.0;
        double divisor = 4.0;
        double expectedDouble = 1.25;
        double actualDouble = primativeTypes.divide(dividend,divisor);
        assertEquals(expectedDouble,actualDouble, 0);
    }


















    @Test
    public void testMultiplication(){
        int multiplicand = 5;
        int multiplier = 2;
        int expectedInt = 10;
        int actualInt = primativeTypes.multiply(multiplicand,multiplier);
        assertEquals(expectedInt,actualInt);
    }
    @Test
    public void testMultiplication1() {
        long multiplicand = 20;
        long multiplier = 1000;
        long expectedLong = 20000;
        long actualLong = primativeTypes.multiply(multiplicand, multiplier);
        assertEquals(expectedLong, actualLong);
    }
    @Test
    public void testMultiplication2() {
        short multiplicand = 2;
        short multiplier = 1;
        short expectedShort = 2;
        short actualShort = (short) primativeTypes.multiply(multiplicand, multiplier);
        assertEquals(expectedShort, actualShort);
    }
    @Test
    public void testMultiplication3() {
        byte multiplicand = 16;
        byte multiplier = 14;
        byte expectedByte = 64;
        byte actualByte = (byte) primativeTypes.multiply(multiplicand, multiplier);
        assertEquals(expectedByte, actualByte);
    }
    @Test
    public void testMultiplication4() {
        float multiplicand = 2.5F;
        float multiplier = 1;
        float expectedFloat = (float) 2.50;
        float actualFloat = (float) primativeTypes.multiply(multiplicand,multiplier);
        assertEquals(expectedFloat, actualFloat, 0);
    }
    @Test
    public void testMultiplication5() {
        double multiplicand = 3.25;
        double multiplier = 3.0;
        double expectedDouble = 9.75;
        double actualDouble = primativeTypes.multiply(multiplicand,multiplier);
        assertEquals(expectedDouble, actualDouble, 0);
    }

    @Test
    public void testReturnTrue(){
        assertTrue(primativeTypes.returnTrue());
    }

    @Test
    public void testReturnFalse(){
        assertFalse(primativeTypes.returnFalse());
    }

}
