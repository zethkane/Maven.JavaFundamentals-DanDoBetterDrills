package Strings;

/**
 * Created by dan on 6/14/17.
 */
public class Strings {

    //Concatenate two strings together that are passed in the parameters
    public String concatenation(String one, String two){
        return one + two;
    }

    //Concatenate a string and a integer together that are passed in the parameters
    public String concatenation(int one, String two){
        return one + two;
    }

    //Get the substring of the first three letters of a string
    public String subStringBegin(String input){
        return input.substring(0,3);
    }

    //Get the substring of a string "Hello" so it returns the last three letters only
    public String subStringEnd(String input){
        return input.substring(input.length() - 3, input.length());
    }

    //Compare the two strings using compareTo() and if they are return true, else false
    public boolean compareTwoStrings(String one, String two){
        int comparison = one.compareTo(two);
        if (comparison == 0){
            return true;
        }
        else
            return false;
    }

    //Compare the two strings using equals() and if they are return true, else false
    public boolean compareTwoStringsEqual(String one, String two){
        return one.equals(two);
    }

    //Write a method that returns the middle character in the given string hint: use the .length and .charAt methods
    public char getTheMiddleChar(String string){
        Integer middle = string.length()/2;
        return string.charAt(middle);
    }

    //Use the indexOf method to find the first space in a string and .substring() to return the first word
    public String getTheFirstWord(String string){
        Integer space = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == ' '){
                space = i;
            }
        }
        return string.substring(0, space);
    }

    //Use the same behavior to find the second word
    public String getTheSecondWord(String string){
        Integer space = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == ' '){
                space = i;
            }
        }
        return string.substring(space + 1, string.length());
    }

    //Create a method that uses the above methods to return a string consisting of the second and first word in reversed order
    public String reverseTheTwo(String string){
        StringBuilder sb = new StringBuilder();
        sb.append(getTheSecondWord(string));
        sb.append(" ");
        sb.append(getTheFirstWord(string));
        return sb.toString();
    }

}
