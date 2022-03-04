package com.zipcodewilmington;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];

    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length -1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length -2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String s : array) { // For each string in the array[]
            if (s == value) { //If string in array matches the string value
                return true; //return true
            }
            System.out.println(s);
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverse = new String[array.length]; //Initialize empty array reverse to match Orig. Array length.

        for (int i = 0; i < reverse.length; i++) { //Loop through reverse array
            reverse[i] = array[array.length - 1 -i]; //Assign the characters from array to new reverse array.
            System.out.println(reverse[i]);
        }
        return reverse;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[array.length - 1 - i]) {
                return true;
            }
        }
        return false;
    }


    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        StringBuilder string = new StringBuilder();
        char[] charArray = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r', 's',
                't','u','v','w','x','y','z'};

        string.append(charArray);
        System.out.println(string);

        //for (int i=0; i < charArray.length; i++){
          //  charArray[i] == alphabet[i];
        //}

        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;                          //Initialize counter = 0

        for (String string : array) {           // Create For each loop to loop through array
            if (string == value) {              // if the String value in array equals the given value
                count++;                        //Add +1 to the counter
            }
        }
        return count; // return the count
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] remove = new String[array.length - 1];

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(valueToRemove)) {
                array[i] = null;
            }


        }
        System.out.println(array);
        return array;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
