package Strings;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by dan on 6/14/17.
 */
public class StringsTest {

    Strings strings;

    @Before public void initialize(){
        strings = new Strings();
    }

    @Test
    public void concatenationStringTest(){
        String one = "Hello", two = " Java";
        assertTrue(this.strings.concatenation(one,two).equals("Hello Java"));
    }

    @Test
    public void concatenationStringAndIntegerTest(){
        int one = 21;
        String two = " Years Old";
        assertTrue(this.strings.concatenation(one, two).equals("21 Years Old"));
    }

    @Test
    public void substringBeginTest(){
        String string = "Hello";
        assertTrue(this.strings.subStringBegin(string).equals("Hel"));
    }

    @Test
    public void substringEndTest(){
        String string = "Hello";
        assertTrue(this.strings.subStringEnd(string).equals("llo"));
    }

    @Test
    public void compareToTest(){
        String one = "Zipcode", two = "Zipcode", three ="Wilmington";
        assertTrue(this.strings.compareTwoStrings(one,two));
        assertFalse(this.strings.compareTwoStrings(one,three));
    }

    @Test
    public void equalToTest(){
        String one = "Zipcode", two = "Zipcode", three = "Wilmington";
        assertTrue(this.strings.compareTwoStringsEqual(one, two));
        assertFalse(this.strings.compareTwoStringsEqual(three, two));
    }

    @Test
    public void getTheMiddleChar(){
        String one = "Zipcode";
        assertTrue('c' == this.strings.getTheMiddleChar(one));
    }

    @Test
    public void getTheFirstWord(){
        String string = "Zipcode Wilmington";
        assertTrue(this.strings.getTheFirstWord(string).equals("Zipcode"));
    }

    @Test
    public void getTheSecondWord(){
        String string = "Zipcode Wilmington";
        assertTrue(this.strings.getTheSecondWord(string).equals("Wilmington"));
    }

    @Test
    public void reverseThem(){
        String string = "Zipcode Wilmington";
        assertTrue(this.strings.reverseTheTwo(string).equals("Wilmington Zipcode"));
    }

}
