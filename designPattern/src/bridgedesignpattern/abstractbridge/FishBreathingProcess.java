package bridgedesignpattern.abstractbridge;

import bridgedesignpattern.implementor.BreatheImplementor;

/**
 * Author: Sandeep Singh
 * Date: 06/02/25
 */

public class FishBreathingProcess extends LivingThings{

    public FishBreathingProcess(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breathProcess() {
        breatheImplementor.breath();
    }
}
