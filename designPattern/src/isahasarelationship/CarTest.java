package isahasarelationship;

/**
 * Author: Sandeep Singh
 * Date: 28/01/25
 */

public class CarTest {
    public static void main(String[] args) {


        Car car = new Car();
        car.wheel();
        Engine engine = new Engine();
        Maruti maruti = new Maruti(engine);
        maruti.carType();
        engine.start();

    }
}
