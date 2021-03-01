package HomeWork_2.Animals;

public class Kaban extends Savage{
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Kaban() {
    }

    public Kaban(String name, int age, String home, int speed) {
        super(name, age, home);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Kaban{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}
