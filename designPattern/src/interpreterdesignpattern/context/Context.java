package interpreterdesignpattern.context;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Sandeep Singh
 * Date: 12/02/25
 */

public class Context {

    Map<String, Integer> contextMap = new HashMap<>();


    public void put(String stringVal, int intVal) {
        contextMap.put(stringVal, intVal);
    }

    public int get(String stringVal) {
        return contextMap.get(stringVal);
    }

}
