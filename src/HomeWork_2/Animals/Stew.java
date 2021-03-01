package HomeWork_2.Animals;

public class Stew extends Savage{
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Stew() {
    }

    public Stew(String name, int age, String home, int speed) {
        super(name, age, home);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Stew{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}
