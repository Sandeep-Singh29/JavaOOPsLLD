package solidprinciples.liskovsubstitutionprinciple.issue;

public class BiCycle implements Bike {
    boolean isEngine = false;
    int speed;

    @Override
    public void turnOnEngine() { // Break the Responsibility
        System.out.println(isEngine);
        throw new AssertionError("BiCycle Have No Engine");
    }

    @Override
    public void accelerate() {
        speed += 10;
        System.out.println(speed);
    }
}
