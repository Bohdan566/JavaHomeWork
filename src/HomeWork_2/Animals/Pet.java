package HomeWork_2.Animals;

public class Pet extends Animal{
    private String home;

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public Pet() {
    }

    public Pet(String name, int age, String home) {
        super(name, age);
        this.home = home;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "home='" + home + '\'' +
                "} " + super.toString();
    }
}
