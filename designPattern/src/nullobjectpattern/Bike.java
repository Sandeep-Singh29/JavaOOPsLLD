package nullobjectpattern;

/**
 * Author: Sandeep Singh
 * Date: 02/02/25
 */

public class Bike implements Vehicle {

    @Override
    public int getTankCapacity() {
        return 15;
    }

    @Override
    public int getSeatCapacity() {
        return 2;
    }
}
