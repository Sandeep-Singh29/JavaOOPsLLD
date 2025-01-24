package solidprinciples.liskovsubstitutionprinciple.solution;

import org.w3c.dom.css.ViewCSS;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 24/01/25
 */

public class VehicleTest {
    public static void main(String[] args) {

        List<Vehicle> vehicles =  new ArrayList<>();
        vehicles.add(new MotorCycle());
        vehicles.add(new Car());
        vehicles.add(new Bicycle());

        for(Vehicle v : vehicles){
            System.out.println(v.getNumberOfWheels().toString());
        }

    }
}
