package immutableClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 01/02/25
 */

public class ImmutableTest {
    public static void main(String[] args) {
        List<Object> carsList = new ArrayList<>(Arrays.asList("bmw", "audi"));

        MyImmutable myObj = new MyImmutable("sandeep", "bangalore", carsList);
        System.out.println(myObj);

        myObj.getCarName().add("newCar"); // Modifies only the copied list
        System.out.println(myObj.getCarName()); // Shows the modified copied list

        System.out.println(myObj); // Original object remains unchanged

        }
}
