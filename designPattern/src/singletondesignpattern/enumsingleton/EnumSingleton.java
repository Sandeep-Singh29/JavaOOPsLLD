package singletondesignpattern.enumsingleton;

/**
 * Author: Sandeep Singh
 * Date: 01/02/25
 */

public enum EnumSingleton {

    INSTANCE;

    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void showMessage() {
        System.out.println("Singleton instance using Enum!");
    }

}
