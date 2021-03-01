package HomeWork_2.Animals;

public class Dog extends Pet{
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Dog() {
    }

    public Dog(String name, int age, String home, int speed) {
        super(name, age, home);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}
