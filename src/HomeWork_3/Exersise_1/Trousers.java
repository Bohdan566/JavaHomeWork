package HomeWork_3.Exersise_1;



public class Trousers extends Clothes implements MensClothes, WomensClothes{

    public Trousers() {
    }

    public Trousers(Sizes size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMen() {
        System.out.println("The men is dressed" + getColor() + "in trousers");
    }

    @Override
    public void dressWomen() {
        System.out.println("The women is dressed" + getColor() + "in trousers");
    }
}
