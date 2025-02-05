package adapterdesignpattern.adapter;

import adapterdesignpattern.adaptee.WeightMachine;

/**
 * Author: Sandeep Singh
 * Date: 03/02/25
 */

public class WeightMachineAdapterImpl implements WeightMachineAdapter {

    private final WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }


    @Override
    public double getWeightInKg(double weight) {
        double weightInPound = weightMachine.getWeightInPound(weight);
        // Convert Pound into KG
        return weightInPound * .45;
    }
}
