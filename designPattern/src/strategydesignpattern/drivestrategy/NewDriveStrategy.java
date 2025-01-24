package strategydesignpattern.drivestrategy;

/**
 * Author: Sandeep Singh
 * Date: 24/01/25
 */

public class NewDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("New Drive Strategy Capacity");
    }
}
