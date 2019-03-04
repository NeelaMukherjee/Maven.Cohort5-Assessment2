package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {

        Integer len = arrayToBeSpliced.length;


        ArrayList <String> newString = new ArrayList<> ();

        for (int i = startingIndex; i< endingIndex; i++ ){


            newString.add (arrayToBeSpliced [i]);
        }

        Integer length = newString.size();

        String [] result = newString.toArray(new String[length]);

        return result;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {

       Integer len = arrayToBeSpliced.length;
        ArrayList <String> newString = new ArrayList<> ();

       String [] nullString = {};

        if (startingIndex > len || startingIndex < 0) {

            return nullString;
        }

        else {
            for (int i = startingIndex; i< len; i++){

                newString.add(arrayToBeSpliced [i]);
            }
            Integer length = newString.size();
            String [] result = newString.toArray(new String[length]);

            return result;
        }

    }
}
