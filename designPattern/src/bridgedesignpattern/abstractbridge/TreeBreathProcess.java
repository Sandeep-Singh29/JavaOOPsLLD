package bridgedesignpattern.abstractbridge;

import bridgedesignpattern.implementor.BreatheImplementor;

/**
 * Author: Sandeep Singh
 * Date: 06/02/25
 */

public class TreeBreathProcess extends LivingThings {

    public TreeBreathProcess(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breathProcess() {
        breatheImplementor.breath();
    }
}
