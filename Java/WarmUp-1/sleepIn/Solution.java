package sleepIn;

public class Solution {

    /* 
    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
    We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true
    */
    
    public boolean sleepIn(boolean weekday, boolean vacation) {
        // Returns true if 'weekday' is false or 'vacation' is true
        // Returns false if 'weekday' is true or 'vacation' is false
        return weekday == false || vacation == true;
    }
}