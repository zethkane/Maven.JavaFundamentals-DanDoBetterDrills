package com.zipcodewilmington.danny_do_better;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by dan on 6/14/17.
 */
public class MathUtilitiesTest {


    MathUtilities math;

    @Before public void initialize(){
        math = new MathUtilities();
    }

    @Test
    public void testRemainder(){
        Integer dividend = 7;
        Integer divisor = 3;
        Integer expected = 1;

        Integer actual = this.math.remainder(dividend, divisor);

        assertTrue(expected == actual);
    }

    @Test
    public void testGreaterThan(){
        assertTrue(this.math.isGreaterThan(456,23));
    }

    @Test
    public void testLessThan(){
        assertTrue(this.math.isLessThan(1 ,3));
    }

    @Test
    public void testLessOrEqual(){
        assertTrue(this.math.isLessThanOrEqualTo(3 , 3));
        assertTrue(this.math.isLessThanOrEqualTo(3, 6));
    }

    @Test
    public void testGreaterOrEqual(){
        assertTrue(this.math.isGreaterThanOrEqualTo(4, 4));
        assertTrue(this.math.isGreaterThanOrEqualTo(78, 5));
    }

    @Test
    public void testLogicalAnd(){
        assertTrue(this.math.isBoth(3));
        assertFalse(this.math.isBoth(4));
    }

    @Test
    public void testLogicalOr(){
        assertTrue(this.math.logicalOr(4));
        assertTrue(this.math.logicalOr(14564));
        assertFalse(this.math.logicalOr(54));
    }


}
