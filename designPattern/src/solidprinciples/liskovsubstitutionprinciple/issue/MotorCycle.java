package solidprinciples.liskovsubstitutionprinciple.issue;

public class MotorCycle implements Bike {

    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        System.out.println(isEngineOn);
    }

    @Override
    public void accelerate() {
        speed += 70;
        System.out.println(speed);
    }
}
