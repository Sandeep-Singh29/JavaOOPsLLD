package bridgedesignpattern.abstractbridge;

import bridgedesignpattern.implementor.BreatheImplementor;

/**
 * Author: Sandeep Singh
 * Date: 06/02/25
 */

public abstract class LivingThings {

    BreatheImplementor breatheImplementor;

    public LivingThings(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    abstract public void breathProcess();

}
