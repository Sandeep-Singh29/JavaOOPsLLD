package polymorphism;

public class HumanRunTest {

    public static void main(String[] args) {


        HumanRun human = new HumanRun();
        System.out.println("WithOut Parameter : " + human.run());
        System.out.println("With One Parameter : " + human.run("Marathon Running...."));
        System.out.println("With Two Parameter : " + human.run("1 Running..", " 2.Stop"));
        System.out.println("With Two Different Parameter : " + human.run("Olympic", 15));

    }

}
