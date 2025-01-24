package strategydesignpattern.drivestrategy;

/**
 * Author: Sandeep Singh
 * Date: 24/01/25
 */

public class SpecialDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Special Drive");
    }
}
