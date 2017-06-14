package Math;

/**
 * Created by dan on 6/14/17.
 */
public class Math {

    //Get the remainder from division
    public int remainder(int one, int two){
        return one % two;
    }

    //Return true using greater than symbol
    public boolean greaterThanTrue(int one, int two){
        return one > two;
    }

    //Return false using greater than symbol
    public boolean greaterThanFalse(int one, int two){
        return one > two;
    }

    //Return true using less than symbol
    public boolean lessThanTrue(int one, int two){
        return one < two;
    }

    //Return false using less than symbol
    public boolean lessThanFalse(int one, int two){
        return one < two;
    }

    //Return true using greater or equal symbol
    public boolean greaterOrEqualTrue(int one, int two){
        return one >= two;
    }

    //Return false using greater or equal symbol
    public boolean greaterOrEqualFalse(int one, int two){
        return one >= two;
    }

    //Return true using less than or equal symbol
    public boolean lessOrEqualTrue(int one, int two){
        return one <= two;
    }

    //Return false using less than or equal symbol
    public boolean lessOrEqualFalse(int one, int two){
        return one <= two;
    }

    //Return true if the number in parameter is equal to 3 and less than 90
    public boolean logicalAnd(Integer number){
        if (number == 3 && number < 90){
            return true;
        }
        else
            return false;
    }

    //Return true if the number passed in is equal to 4 or greater than 100
    public boolean logicalOr(Integer number){
        if (number == 4 || number > 100){
            return true;
        }
        else
            return false;
    }

}
