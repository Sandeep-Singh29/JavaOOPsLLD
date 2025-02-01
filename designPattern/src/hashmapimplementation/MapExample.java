package hashmapimplementation;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sandeep Singh
 * Date: 31/01/25
 */

public class MapExample {

    public static void main(String[] args) {
        Map<String,String> myMap = new HashMap<>();
        myMap.put("name", "sandeep");
        myMap.put("fName", "Brijendra");
        myMap.put("age", "27");
        myMap.put("address", "kanpur");

        String name = myMap.get("name");
        System.out.println(name);
    }

}
