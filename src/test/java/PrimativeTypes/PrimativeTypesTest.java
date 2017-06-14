package PrimativeTypes;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by dan on 6/14/17.
 */
public class PrimativeTypesTest {

    PrimativeTypes primativeTypes;

    @Before public void initialize(){
        primativeTypes = new PrimativeTypes();
    }

    @Test
    public void testAdditions(){
        int expectedInt = 27;
        int actualInt = this.primativeTypes.add(20,7);

        long expectedLong = 456874531;
        long actualLong = this.primativeTypes.add(228437266, 228437265);

        short expectedShort = 32767;
        short actualShort = (short) this.primativeTypes.add(16384, 16383);

        byte expectedByte = 127;
        byte actualByte = (byte) this.primativeTypes.add(63, 64);

        float expectedFloat = (float) 1545.585;
        float actualFloat = (float) this.primativeTypes.add(750.585,795.000);

        double expectedDouble = 456.25;
        double actualDouble = this.primativeTypes.add(225.25,231);

        assertEquals(expectedInt,actualInt);
        assertEquals(expectedLong,actualLong);
        assertEquals(expectedShort,actualShort);
        assertEquals(expectedByte,actualByte);
        assertEquals(expectedFloat,actualFloat, 0);
        assertEquals(expectedDouble,actualDouble, 0);
    }

    @Test
    public void testSubtractions(){
        int expectedInt = 13;
        int actualInt = this.primativeTypes.subtract(20,7);

        long expectedLong = 1;
        long actualLong = this.primativeTypes.subtract(228437266, 228437265);

        short expectedShort = 1;
        short actualShort = (short) this.primativeTypes.subtract(16384, 16383);

        byte expectedByte = -1;
        byte actualByte = (byte) this.primativeTypes.subtract(63, 64);

        float expectedFloat = (float) -44.415;
        float actualFloat = (float) this.primativeTypes.subtract(750.585,795.000);

        double expectedDouble = -5.75;
        double actualDouble = this.primativeTypes.subtract(225.25,231);

        assertEquals(expectedInt,actualInt);
        assertEquals(expectedLong,actualLong);
        assertEquals(expectedShort,actualShort);
        assertEquals(expectedByte,actualByte);
        assertEquals(expectedFloat,actualFloat, 0);
        assertEquals(expectedDouble,actualDouble, 0);
    }

    @Test
    public void testDivision(){
        int expectedInt = 10;
        int actualInt = this.primativeTypes.divide(20,2);

        long expectedLong = 20000;
        long actualLong = this.primativeTypes.divide(20000000, 1000);

        short expectedShort = 2;
        short actualShort = (short) this.primativeTypes.divide(2, 1);

        byte expectedByte = 2;
        byte actualByte = (byte) this.primativeTypes.divide(64, 32);

        float expectedFloat = (float) 2.50;
        float actualFloat = (float) this.primativeTypes.divide(7.5,3);

        double expectedDouble = 1.25;
        double actualDouble = this.primativeTypes.divide(5.0,4.0);

        assertEquals(expectedInt,actualInt);
        assertEquals(expectedLong,actualLong);
        assertEquals(expectedShort,actualShort);
        assertEquals(expectedByte,actualByte);
        assertEquals(expectedFloat,actualFloat, 0);
        assertEquals(expectedDouble,actualDouble, 0);
    }

    @Test
    public void testMultiplication(){
        int expectedInt = 10;
        int actualInt = this.primativeTypes.multiply(5,2);

        long expectedLong = 20000;
        long actualLong = this.primativeTypes.multiply(20, 1000);

        short expectedShort = 2;
        short actualShort = (short) this.primativeTypes.multiply(2, 1);

        byte expectedByte = 64;
        byte actualByte = (byte) this.primativeTypes.multiply(16, 4);

        float expectedFloat = (float) 2.50;
        float actualFloat = (float) this.primativeTypes.multiply(2.50,1);

        double expectedDouble = 9.75;
        double actualDouble = this.primativeTypes.multiply(3.25,3.0);

        assertEquals(expectedInt,actualInt);
        assertEquals(expectedLong,actualLong);
        assertEquals(expectedShort,actualShort);
        assertEquals(expectedByte,actualByte);
        assertEquals(expectedFloat,actualFloat, 0);
        assertEquals(expectedDouble,actualDouble, 0);
    }

    @Test
    public void testBoolean(){
        assertTrue(this.primativeTypes.returnTrue());
        assertFalse(this.primativeTypes.returnFalse());
    }

}
