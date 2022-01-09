public class Solution {
    /*
    
    Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. 
    Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.

    wordEnds("abcXY123XYijk", "XY") → "c13i"
    wordEnds("XY123XY", "XY") → "13"
    wordEnds("XY1XY", "XY") → "11"

    */

    public String wordEnds(String str, String word) {
        StringBuilder sb = new StringBuilder();
        String result = "";
        if(str.equals(word)) {
            return "";
        }
        for(int i = 0; i < str.length(); i++) {
            if(str.substring(i, i + 2).equals(word)) {
                if(i == 0) {
                    sb.append(str.charAt(i + word.length()));
                } else if(i == str.length() - 1) {
                    sb.append(str.charAt(i - 1));
                } else {
                    sb.append(str.charAt(i - 1));
                    sb.append(str.charAt(i + word.length()));
                }
            }
            result = sb.toString();
        } return result;
    }
}