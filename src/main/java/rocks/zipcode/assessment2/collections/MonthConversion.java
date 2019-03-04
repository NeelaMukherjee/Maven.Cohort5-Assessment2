package rocks.zipcode.assessment2.collections;

import java.util.*;

/**
 * Use a map to solve
 */
public class MonthConversion {
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */

    TreeMap<Integer, String> calendar  = new TreeMap<> ();

    public void add(Integer monthNumber, String monthName) {

        calendar.put(monthNumber, monthName);

    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {

        if (calendar.get(monthNumber).equals(null)) {

            throw new NullPointerException();
        } else {

            return calendar.get(monthNumber);
        }
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {

        Integer monthNum = 0;
        Set set = calendar.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {

            Map.Entry<Integer, String> mentry = (Map.Entry) iterator.next();
            String monthNames = mentry.getValue();

            if (monthNames.equals(monthName)) {
                monthNum = mentry.getKey();
                break;
            }


        }
        return monthNum;
    }


    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {


        //if(1<= monthNumber && monthNumber<=12){

            String value1 = calendar.get(monthNumber);

            return (value1!= null);

    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {

        return (getNumber(monthName) >0);
        //return null;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {


        return calendar.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {

calendar.replace(monthNumber, monthName);
    }
}
