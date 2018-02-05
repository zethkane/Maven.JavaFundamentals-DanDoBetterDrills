package com.zipcodewilmington.danny_do_better_exercises;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by leon on 2/5/18.
 */
@RunWith(Suite.class)

@Suite.SuiteClasses({
        HelloWorldTest.class,
        PredicateUtilitiesTest.class,
        PrimativeTypesTest.class,
        StringUtilitiesTest.class,
})
public class TestSuite {
}
