package prototypedesignpattern.cloneobject;

import prototypedesignpattern.baseinterface.Prototype;

/**
 * Author: Sandeep Singh
 * Date: 11/02/25
 */

public class Mobile implements Prototype {

    boolean isSmartPhone;
    boolean is5G;
    private String brandName;

    public Mobile(boolean isSmartPhone, boolean is5G, String brandName) {
        this.isSmartPhone = isSmartPhone;
        this.is5G = is5G;
        this.brandName = brandName;
    }

    public Mobile() {
    }

    @Override
    public Prototype clone() {
        return new Mobile(isSmartPhone, is5G, brandName);
    }
}
