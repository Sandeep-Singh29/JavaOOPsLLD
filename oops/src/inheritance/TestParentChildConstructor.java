package inheritance;

/**
 * Author: Sandeep Singh
 * Date: 25/01/25
 */

public class TestParentChildConstructor {
    public static void main(String[] args) {
        Child child = new Child();

    }
}

class Parent {
    public Parent() {
        System.out.println("Parent Constructor Called");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child Constructor Called");
    }
}

