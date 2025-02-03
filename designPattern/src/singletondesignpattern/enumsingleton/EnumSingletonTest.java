package singletondesignpattern.enumsingleton;

/**
 * Author: Sandeep Singh
 * Date: 01/02/25
 */

public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        System.out.println(instance1.hashCode());
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        System.out.println(instance2.hashCode());
        instance1.setValue(5);
        instance2.setValue(10);
        System.out.println(instance2.getValue());

        instance1.showMessage();
    }
}
