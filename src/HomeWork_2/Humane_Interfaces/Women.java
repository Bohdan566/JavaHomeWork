package HomeWork_2.Humane_Interfaces;

import HomeWork_2.Humane_Interfaces.Interfaces.WomenClothes;

public class Women extends Human implements WomenClothes {
    private String comeFrom;

    public String getComeFrom() {
        return comeFrom;
    }

    public void setComeFrom(String comeFrom) {
        this.comeFrom = comeFrom;
    }

    public Women() {
    }

    public Women(String name, int age, String comeFrom) {
        super(name, age);
        this.comeFrom = comeFrom;
    }

    @Override
    public String toString() {
        return "Women{" +
                "comeFrom='" + comeFrom + '\'' +
                "} " + super.toString();
    }

    @Override
    public void dressWomen() {
        System.out.println("The Women was dressed too");
    }
}
