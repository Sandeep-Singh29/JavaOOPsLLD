package inheritance.usesealedclass;

/**
 * Author: Sandeep Singh
 * Date: 04/02/25
 */

public sealed class Vehicle permits Car, Bike {

    public void start() {
        System.out.println("Start Vehicle");
    }

}
