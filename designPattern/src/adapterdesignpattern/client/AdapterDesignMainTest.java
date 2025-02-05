package adapterdesignpattern.client;

import adapterdesignpattern.adaptee.WeightMachineForAnyOne;
import adapterdesignpattern.adapter.WeightMachineAdapter;
import adapterdesignpattern.adapter.WeightMachineAdapterImpl;

/**
 * Author: Sandeep Singh
 * Date: 03/02/25
 */

public class AdapterDesignMainTest {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForAnyOne());
        double weightInKg = weightMachineAdapter.getWeightInKg(100);
        System.out.println(weightInKg);
    }
}
