package isahasarelationship;

/**
 * Author: Sandeep Singh
 * Date: 27/01/25
 */

public class Maruti extends Car {

    private final Engine engine;

    public Maruti(Engine engine) {
        this.engine = engine;
        System.out.println("Maruti Constructor Called");
    }


    public void carType() {
        System.out.println("Maruti is Sports Car");
    }
}
