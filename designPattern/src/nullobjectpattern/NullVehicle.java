package nullobjectpattern;

/**
 * Author: Sandeep Singh
 * Date: 02/02/25
 */

public class NullVehicle implements Vehicle {

    @Override
    public int getTankCapacity() {
        return 0;
    }

    @Override
    public int getSeatCapacity() {
        return 0;
    }
}
