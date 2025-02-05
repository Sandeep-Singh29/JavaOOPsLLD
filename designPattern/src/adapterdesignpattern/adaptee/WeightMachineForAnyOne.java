package adapterdesignpattern.adaptee;

/**
 * Author: Sandeep Singh
 * Date: 03/02/25
 */

public class WeightMachineForAnyOne implements WeightMachine {

    @Override
    public double getWeightInPound(double weight) {
        return weight;
    }
}
