package com.zipcodewilmington.danny_do_better;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/1/18.
 */
public class HelloWorldTest {

    HelloWorld helloWorld;

    @Before
    public void initialize(){
        helloWorld = new HelloWorld();
    }

    @Test
    public void TestHelloWorld(){
        String expected = "Hello World";
        String actual = this.helloWorld.helloWorld();

        assertEquals(expected,actual);
    }

}