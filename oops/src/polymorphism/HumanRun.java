package polymorphism;

/*

One Method Many Implementation
Same Method Different Parameter



**Types**

1. Compile-time Polymorphism (Method Overloading): This is when multiple methods with the same name exist,
 but with different parameters.

2. Runtime Polymorphism (Method Overriding-->> Using Inheritance extends Keyword ): This is when a method in a parent class is overridden by a
method in the child class.

*/

public class HumanRun {

    // Without parameter
    public String run() {
        return "Normal Walk";
    }

    //with one parameter
    public String run(String str) {
        return str;
    }

    //with two parameter
    public String run(String str, String str1) {
        return str + str1;
    }

    //with two parameter but different signature
    public String run(String str, int speed) {
        return str + " Speed is : " + speed;
    }


}
