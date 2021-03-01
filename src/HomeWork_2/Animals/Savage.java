package HomeWork_2.Animals;

public class Savage extends Animal{
    private String home;

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public Savage() {
    }

    public Savage(String name, int age, String home) {
        super(name, age);
        this.home = home;
    }

    @Override
    public String toString() {
        return "Savage{" +
                "home='" + home + '\'' +
                "} " + super.toString();
    }
}
