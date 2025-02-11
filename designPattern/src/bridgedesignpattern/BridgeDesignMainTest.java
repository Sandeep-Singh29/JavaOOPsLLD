package bridgedesignpattern;

import bridgedesignpattern.abstractbridge.FishBreathingProcess;
import bridgedesignpattern.abstractbridge.HumanBreathProcess;
import bridgedesignpattern.implementor.AirBreathImplementor;
import bridgedesignpattern.implementor.WaterBreathImplementor;

/**
 * Author: Sandeep Singh
 * Date: 06/02/25
 */

public class BridgeDesignMainTest {
    public static void main(String[] args) {

        FishBreathingProcess fishBreathingProcess = new FishBreathingProcess(new WaterBreathImplementor());
        System.out.println("Fish Breath" );
        HumanBreathProcess humanBreathProcess = new HumanBreathProcess(new AirBreathImplementor());
        humanBreathProcess.breathProcess();

    }
}
