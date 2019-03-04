package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    /**
     * @param strings list of strings to add / remove / fetch from
     */

    List <String> strings; //= new ArrayList<>();

    HashMap<String, Integer> items = new HashMap<>();

    public Inventory(List<String> strings) {

        this.strings = strings;

    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {

       strings = new ArrayList<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {

        if (items.containsKey(item)) {

            items.put(item, items.get(item) + 1);
        } else {

            items.put(item, 1);
        }

    }



    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {

        items.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return items.get(item);
    }
}
