package inheritance.usesealedclass;

/**
 * Author: Sandeep Singh
 * Date: 04/02/25
 */

final class Car extends Vehicle {
    

    public void start() {
        super.start();
        System.out.println("Start Car");
    }

}
