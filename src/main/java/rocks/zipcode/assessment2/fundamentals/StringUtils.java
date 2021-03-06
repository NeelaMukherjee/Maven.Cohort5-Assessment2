package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {

        if(stringToBePadded.length() >= amountOfPadding){

            return stringToBePadded;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < amountOfPadding - stringToBePadded.length()) {
            sb.append(' ');
        }
        sb.append(stringToBePadded);

        return sb.toString();
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {

        if(stringToBePadded.length() >= amountOfPadding){

            return stringToBePadded;
        }

        StringBuilder sb = new StringBuilder(stringToBePadded);
        while(sb.length()<amountOfPadding){
            sb.append(' ');
        }
        return sb.toString();
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i<=numberOfTimeToRepeat; i++){

            sb.append(stringToBeRepeated);
        }
        return sb.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        boolean bool = false;
        Integer count = 0;

        for (int i = 0; i < string.length(); i++) {

            if (Character.isLetter(string.charAt(i)) || string.charAt(i) == ' ') {
                count++;
            }

        }
        if(count == string.length()) {bool = true;}


        return bool;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {

        boolean bool = false;
        Integer count = 0;

        for (int i = 0; i < string.length(); i++) {

            if (Character.isDigit(string.charAt(i)) || string.charAt(i) == ' ') {
                count++;
            }

        }
        if(count == string.length()) {bool = true;}


        return bool;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {

        boolean bool = false;

         if(!(isNumericString(string) && isAlphaString(string))){

             bool= true;
         }

         else if (isNumericString(string)) {

            bool = false;
        }

         else if(isAlphaString(string)){

             bool = false;
         }

         return  bool;
    }
}
