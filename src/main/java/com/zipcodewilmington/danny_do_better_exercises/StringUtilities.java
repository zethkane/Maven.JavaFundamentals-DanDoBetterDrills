package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        String hello = "Hello World";
        return hello;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        String combination = "";
        combination = firstSegment + secondSegment;
        return combination;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        String combination = "";
        combination += firstSegment + secondSegment;
        return combination;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        String findFirstThree = "";
        if ( input.length() > 3){
            findFirstThree = input.substring(0,3);
        }
        return findFirstThree;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        String findLastThree = "";
        if ( input.length() > 3){
            findLastThree = input.substring(input.length() - 3, input.length());
        }
        return findLastThree;
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        boolean equivalant = true;
        if (inputValue == comparableValue){
            equivalant = true;
        }
        else {
            equivalant = false;
        }
        return equivalant;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
        char middleChar = 0;
        if (inputValue.length() %2 == 0){
            middleChar = inputValue.charAt(inputValue.length() / 2 - 1) ;
        }
        else if ( inputValue.length() %2 == 1){
            middleChar = inputValue.charAt(inputValue.length() / 2 );
        }
        return middleChar;
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        int index = spaceDelimitedString.indexOf(' ');
        if (index > -1){
            return spaceDelimitedString.substring(0, index);
        }
        else {
            return spaceDelimitedString;
        }
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        int index = spaceDelimitedString.indexOf(' ');
        if (index > -1){
            return spaceDelimitedString.substring(index + 1);
        }
        else {
            return spaceDelimitedString;
        }
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        int len = stringToReverse.length();
        StringBuilder reverse = new StringBuilder(len);

        for (int i = len - 1; i >=0; i--){
            reverse.append(stringToReverse.charAt(i));
        }
        return reverse.toString();
    }
}
