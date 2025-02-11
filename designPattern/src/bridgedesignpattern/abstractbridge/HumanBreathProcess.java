package bridgedesignpattern.abstractbridge;

import bridgedesignpattern.implementor.BreatheImplementor;

/**
 * Author: Sandeep Singh
 * Date: 06/02/25
 */

public class HumanBreathProcess extends LivingThings{

    public HumanBreathProcess(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breathProcess() {
        breatheImplementor.breath();
    }
}
