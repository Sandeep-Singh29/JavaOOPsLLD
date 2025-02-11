package bridgedesignpattern.implementor;

/**
 * Author: Sandeep Singh
 * Date: 06/02/25
 */

public class WaterBreathImplementor implements BreatheImplementor{

    @Override
    public void breath() {
        System.out.println("Breath through Water");
    }
}
