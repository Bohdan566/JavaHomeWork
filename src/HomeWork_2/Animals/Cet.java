package HomeWork_2.Animals;

public class Cet extends Pet{
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Cet() {
    }

    public Cet(String name, int age, String home, int speed) {
        super(name, age, home);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Cet{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}
