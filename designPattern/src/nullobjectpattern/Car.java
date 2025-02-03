package nullobjectpattern;

/**
 * Author: Sandeep Singh
 * Date: 02/02/25
 */

public class Car implements Vehicle{

    @Override
    public int getTankCapacity() {
        return 30;
    }

    @Override
    public int getSeatCapacity() {
        return 7;
    }
}
