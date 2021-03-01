package HomeWork_3.Exersise_1;

public class Dress extends Clothes implements WomensClothes{

    public Dress() {
    }

    public Dress(Sizes size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("The women is dressed" + getColor() + "in dress");
    }
}
