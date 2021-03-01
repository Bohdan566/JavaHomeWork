package HomeWork_2.Humane_Interfaces;

import HomeWork_2.Humane_Interfaces.Interfaces.MenClothes;


public class Men extends Human implements MenClothes {
    private String work;

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Men() {
    }

    public Men(String name, int age, String work) {
        super(name, age);
        this.work = work;
    }

    @Override
    public String toString() {
        return "Men{" +
                "work='" + work + '\'' +
                "} " + super.toString();
    }

    @Override
    public void dressMen() {
        System.out.println("The Men was dressed");
    }
}
